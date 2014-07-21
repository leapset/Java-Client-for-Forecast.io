package com.leapset.forecastio.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.leapset.forecastio.dto.ForecastIO;
import com.leapset.forecastio.exception.ForecastIOException;
import com.leapset.forecastio.service.ForecastWeatherService;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

/**
 * Implementation for forecast-io client
 *
 * @author <a href="mailto:chaminda@leapset.com">Chaminda Bandara</a>
 * @version 1.0
 * @since Forecast-IO Client v1.0
 */
public class ForecastWeatherServiceImpl implements ForecastWeatherService {

    private static Logger logger = Logger.getLogger(ForecastWeatherServiceImpl.class);

    @Value("#{forecastIOProperties['forecast.api.url']}")
    private String forecastApiUrl;

    private final String token;

    public ForecastWeatherServiceImpl(String token) {
        this.token = token;
    }

    /**
     * {@inheritDoc}
     */
    public ForecastIO getWeather(Float latitude, Float longitude, Long dateStart)
            throws ForecastIOException {

        logger.info("Collecting weather data for default token {latitude="
                + latitude + ", longitude=" + longitude + ", dateStart=" + dateStart + "}");

        return getWeather(latitude, longitude, dateStart, this.token);
    }

    /**
     * {@inheritDoc}
     */
    public ForecastIO getWeather(Float latitude, Float longitude, Long dateStart, String token)
            throws ForecastIOException {

        logger.info("Collecting weather data for given token {latitude="
                + latitude + ", longitude=" + longitude + ", dateStart=" + dateStart + "}");

        ForecastIO forecastDTO = null;
        HttpClient httpclient = new DefaultHttpClient();
        try {

            HttpGet httpget = new HttpGet(
                    forecastApiUrl + token + "/" + latitude + "," + longitude + "," + dateStart /*+ "?exclude=currently,minutely,hourly,alerts,flags"*/); // "?exclude=currently,minutely,hourly,alerts,flags"
            httpget.addHeader("accept", "application/json");

            // Create a response handler
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String responseBody = httpclient.execute(httpget, responseHandler);

            ObjectMapper mapper = new ObjectMapper();
            ForecastIO dto = mapper.readValue(responseBody, ForecastIO.class);
            forecastDTO = dto;

        } catch (ClientProtocolException e) {

            logger.error(e.getMessage(), e);
            throw new ForecastIOException(e.getMessage(), e);

        } catch (IOException e) {

            logger.error(e.getMessage(), e);
            throw new ForecastIOException(e.getMessage(), e);

        } finally {

            // When HttpClient instance is no longer needed,
            // shut down the connection manager to ensure
            // immediate deallocation of all system resources
            httpclient.getConnectionManager().shutdown();
        }
        return forecastDTO;
    }
}
