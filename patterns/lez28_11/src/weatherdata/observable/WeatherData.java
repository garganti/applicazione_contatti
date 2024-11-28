package weatherdata.observable;

import java.util.Random;

import weatherdata.Observable;

public class WeatherData extends Observable{

    private WeatherData() {}
    
    public double getTemperature(){
	return new Random().nextDouble();
    }
    
    static public WeatherData weatherData = 
	    new WeatherData();
    
}
