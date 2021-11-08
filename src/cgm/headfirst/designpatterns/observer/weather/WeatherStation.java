/*
*  created date: Nov 08, 2021
*  author: cgm
*/
package cgm.headfirst.designpatterns.observer.weather;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    }
    
}
