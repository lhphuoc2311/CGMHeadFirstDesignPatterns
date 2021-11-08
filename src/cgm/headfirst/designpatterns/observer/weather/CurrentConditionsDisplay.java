/*
*  created date: Nov 08, 2021
*  author: cgm
*/
package cgm.headfirst.designpatterns.observer.weather;

public class CurrentConditionsDisplay implements Observer{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
    }
    
}
