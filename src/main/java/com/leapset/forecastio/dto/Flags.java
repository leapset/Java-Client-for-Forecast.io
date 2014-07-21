package com.leapset.forecastio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Data transfer object for forecast-io flags data
 *
 * @author <a href="mailto:chaminda@leapset.com">Chaminda Bandara</a>
 * @version 1.0
 * @since Forecast-IO Client v1.0
 */
public class Flags implements Serializable {

    private static final long serialVersionUID = 3410584020135136082L;

    private List<String> sources;
    @JsonProperty("isd-stations")
    private List<String> isdStations;
    @JsonProperty("madis-stations")
    private List<String> madisStations;
    @JsonProperty("lamp-stations")
    private List<String> lampStations;
    @JsonProperty("darksky-stations")
    private List<String> darkskyStations;
    private String units;

    public List<String> getSources() {
        return sources;
    }

    public void setSources(List<String> sources) {
        this.sources = sources;
    }

    public List<String> getIsdStations() {
        return isdStations;
    }

    public void setIsdStations(List<String> isdStations) {
        this.isdStations = isdStations;
    }

    public List<String> getMadisStations() {
        return madisStations;
    }

    public void setMadisStations(List<String> madisStations) {
        this.madisStations = madisStations;
    }

    public List<String> getLampStations() {
        return lampStations;
    }

    public void setLampStations(List<String> lampStations) {
        this.lampStations = lampStations;
    }

    public List<String> getDarkskyStations() {
        return darkskyStations;
    }

    public void setDarkskyStations(List<String> darkskyStations) {
        this.darkskyStations = darkskyStations;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Override
    public String toString() {
        return "Flags{" +
                "sources=" + sources +
                ", isdStations=" + isdStations +
                ", madisStations=" + madisStations +
                ", lampStations=" + lampStations +
                ", darkskyStations=" + darkskyStations +
                ", units='" + units + '\'' +
                '}';
    }
}
