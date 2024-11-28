package weatherdata.observer;

import weatherdata.Observer;
import weatherdata.observable.WeatherData;

public class WeatherDisplay implements Observer{

//    public void run() {
//	WeatherData wd = WeatherData.weatherData;
//	
//	for (int i = 0; i < 100; i++) {
//	    System.out.println(wd.getTemperature());
//	}
//    }

    @Override
    public void update() {
	WeatherData wd = WeatherData.weatherData;
	System.out.println(wd.getTemperature());
    }

    
    
    
}
