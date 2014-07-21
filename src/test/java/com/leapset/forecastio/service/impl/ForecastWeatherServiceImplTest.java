package com.leapset.forecastio.service.impl;

import com.leapset.forecastio.dto.ForecastIO;
import com.leapset.forecastio.exception.ForecastIOException;
import com.leapset.forecastio.service.ForecastWeatherService;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Test case for forecast weather api service
 *
 * @author Chaminda Bandara <chaminda@leapset.com/>
 * @version 1.0
 * @since Forecast-IO Client v1.0
 */
public class ForecastWeatherServiceImplTest extends BaseServiceTestCase {

    private static Logger logger = Logger.getLogger(ForecastWeatherServiceImplTest.class);

    @Autowired
    private ForecastWeatherService forecastWeatherService;

    @Test
    public void testGetWeather() {

        ForecastIO forecastDTO = null;
        try {
            forecastDTO = forecastWeatherService.getWeather(37.76319f, -122.4807f, 1396422000L);
        } catch (ForecastIOException e) {
            logger.error(e);
        }
        assertForecastDTO(forecastDTO);
    }

    private void assertForecastDTO(ForecastIO forecastDTO) {

        Assert.assertNotNull(forecastDTO);
        Assert.assertNotNull(forecastDTO.getLatitude());
        Assert.assertNotNull(forecastDTO.getLongitude());
        Assert.assertNotNull(forecastDTO.getOffset());
        Assert.assertNotNull(forecastDTO.getTimezone());
        Assert.assertNotNull(forecastDTO.getDaily());
        Assert.assertNotNull(forecastDTO.getDaily().getData());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0));
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getTime());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getSummary());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getIcon());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getSunriseTime());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getSunsetTime());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getMoonPhase());
        Assert.assertNull(forecastDTO.getDaily().getData().get(0).getPrecipIntensity());
        Assert.assertNull(forecastDTO.getDaily().getData().get(0).getPrecipIntensityMax());
        Assert.assertNull(forecastDTO.getDaily().getData().get(0).getPrecipIntensityMaxTime());
        Assert.assertNull(forecastDTO.getDaily().getData().get(0).getPrecipProbability());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getPrecipType());
        Assert.assertNull(forecastDTO.getDaily().getData().get(0).getPrecipAccumulation());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getTemperatureMin());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getTemperatureMinTime());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getTemperatureMax());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getTemperatureMaxTime());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getApparentTemperatureMin());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getApparentTemperatureMinTime());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getApparentTemperatureMax());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getApparentTemperatureMaxTime());
        Assert.assertNull(forecastDTO.getDaily().getData().get(0).getDewPoint());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getWindSpeed());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getWindBearing());
        Assert.assertNull(forecastDTO.getDaily().getData().get(0).getCloudCover());
        Assert.assertNull(forecastDTO.getDaily().getData().get(0).getHumidity());
        Assert.assertNotNull(forecastDTO.getDaily().getData().get(0).getPressure());
        Assert.assertNull(forecastDTO.getDaily().getData().get(0).getVisibility());
        Assert.assertNull(forecastDTO.getDaily().getData().get(0).getOzone());
        Assert.assertNotNull(forecastDTO.toString());
    }
}
