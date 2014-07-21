package com.leapset.forecastio.exception;

/**
 * Exception class for forecast-io client
 *
 * @author <a href="mailto:chaminda@leapset.com">Chaminda Bandara</a>
 * @version 1.0
 * @since Forecast-IO Client v1.0
 */
public class ForecastIOException extends Exception {

    /**
     * @param message
     * @param cause
     */
    public ForecastIOException(String message, Throwable cause) {
        super(message, cause);
    }
}
