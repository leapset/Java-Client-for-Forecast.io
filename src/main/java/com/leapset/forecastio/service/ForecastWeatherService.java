package com.leapset.forecastio.service;

import com.leapset.forecastio.dto.ForecastIO;
import com.leapset.forecastio.exception.ForecastIOException;

/**
 * Interface for forecast-io client
 *
 * @author <a href="mailto:chaminda@leapset.com">Chaminda Bandara</a>
 * @version 1.0
 * @since Forecast-IO Client v1.0
 */
public interface ForecastWeatherService {

    /**
     * Return weather data for given date
     *
     * @param latitude
     * @param longitude
     * @param dateStart
     * @return
     */
    ForecastIO getWeather(Float latitude, Float longitude, Long dateStart)
            throws ForecastIOException;

    /**
     * Return weather data for given date and token
     *
     * @param latitude
     * @param longitude
     * @param dateStart
     * @return
     */
    ForecastIO getWeather(Float latitude, Float longitude, Long dateStart, String token)
            throws ForecastIOException ;
}