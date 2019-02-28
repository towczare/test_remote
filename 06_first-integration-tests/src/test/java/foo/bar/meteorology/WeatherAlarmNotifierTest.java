package foo.bar.meteorology;

import foo.bar.meteorology.alarm.WeatherAlarmNotifier;
import foo.bar.meteorology.weather.Weather;
import foo.bar.meteorology.weather.WeatherService;
import foo.bar.meteorology.weather.external.RainfallProvider;
import foo.bar.meteorology.weather.external.TemperatureProvider;
import foo.bar.meteorology.weather.external.WindSpeedProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class WeatherAlarmNotifierTest {

    private WeatherAlarmNotifier alarmNotifier = new WeatherAlarmNotifier(
        new WeatherService(
            new TemperatureProvider(),
            new RainfallProvider(),
            new WindSpeedProvider()
        )
    );



}
