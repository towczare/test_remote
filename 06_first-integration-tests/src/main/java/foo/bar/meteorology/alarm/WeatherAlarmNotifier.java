package foo.bar.meteorology.alarm;

import foo.bar.meteorology.weather.Weather;
import foo.bar.meteorology.weather.WeatherService;

public class WeatherAlarmNotifier {

    private WeatherService weatherService;

    public WeatherAlarmNotifier(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public WeatherAlarmLevel raiseLevelIfNeccessary() {
        Weather weather = weatherService.getWeather();

        return WeatherAlarmLevel.ALL_OK;
    }
}
