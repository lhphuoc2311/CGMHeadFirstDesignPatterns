/*
*  created date: Nov 08, 2021
*  author: cgm
*/
package cgm.headfirst.designpatterns.observer.weather;

public interface Subject {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    
}
