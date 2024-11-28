package weatherdata.main;

import weatherdata.observable.WeatherData;
import weatherdata.observer.WeatherDisplay;

public class WeatherStation {

    public static void main(String[] args) {
	WeatherDisplay wd = new WeatherDisplay();
	WeatherData data = WeatherData.weatherData;
	
	data.addObserver(wd);
	
	for (int i = 0; i < 100; i++) {
	    data.notifyObservers();
	}
	
    }
    
}
