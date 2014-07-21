package com.leapset.forecastio.dto;

import java.io.Serializable;

/**
 * Data transfer object for forecast-io daily weather data
 *
 * @author <a href="mailto:chaminda@leapset.com">Chaminda Bandara</a>
 * @version 1.0
 * @since Forecast-IO Client v1.0
 */
public class Daily extends Hourly implements Serializable {

    private static final long serialVersionUID = 1246433179174421241L;
}
