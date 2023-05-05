package json_xml;

public class Weather {
    private int[] city;
    private String temperature;
    private String feels_like;
    private String humidity;
    private String pressure;
    private String[] wind;
    private String clouds;
    private String visibility;
    private String precipitation;
    private String weather;
    private String lastupdate;

    public Weather(int[] city, String temperature, String feels_like, String humidity, String pressure, String[] wind, String clouds, String visibility, String precipitation, String weather, String lastupdate) {
        this.city = city;
        this.temperature = temperature;
        this.feels_like = feels_like;
        this.humidity = humidity;
        this.pressure = pressure;
        this.wind = wind;
        this.clouds = clouds;
        this.visibility = visibility;
        this.precipitation = precipitation;
        this.weather = weather;
        this.lastupdate = lastupdate;
    }

    public int[] getCity() {
        return city;
    }

    public void setCity(int[] city) {
        this.city = city;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getFeels_like() {
        return feels_like;
    }

    public void setFeels_like(String feels_like) {
        this.feels_like = feels_like;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public String[] getWind() {
        return wind;
    }

    public void setWind(String[] wind) {
        this.wind = wind;
    }

    public String getClouds() {
        return clouds;
    }

    public void setClouds(String clouds) {
        this.clouds = clouds;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate;
    }
}
