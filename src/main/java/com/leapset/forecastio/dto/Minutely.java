package com.leapset.forecastio.dto;

import java.io.Serializable;
import java.util.List;

/**
 * Data transfer object for forecast-io minutely weather data
 *
 * @author <a href="mailto:chaminda@leapset.com">Chaminda Bandara</a>
 * @version 1.0
 * @since Forecast-IO Client v1.0
 */
public class Minutely implements Serializable {

    private static final long serialVersionUID = 1321254067292442680L;

    private String summary;
    private String icon;
    private List<DataNode> data;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<DataNode> getData() {
        return data;
    }

    public void setData(List<DataNode> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Minutely{" +
                "summary='" + summary + '\'' +
                ", icon='" + icon + '\'' +
                ", data=" + data +
                '}';
    }
}
