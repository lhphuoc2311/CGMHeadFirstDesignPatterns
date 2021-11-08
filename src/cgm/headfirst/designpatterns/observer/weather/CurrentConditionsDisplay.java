/*
*  created date: Nov 08, 2021
*  author: cgm
*/
package cgm.headfirst.designpatterns.observer.weather;

public class CurrentConditionsDisplay implements Observer{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        //display()
    }
    
}
