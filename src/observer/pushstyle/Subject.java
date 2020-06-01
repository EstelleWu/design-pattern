package observer.pushstyle;

import java.util.ArrayList;
import java.util.List;

// observable
public class Subject {
	private List<Observer> observers = new ArrayList<>();
	
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void notifyObservers(int value) {
		for (Observer observer: this.observers) {
			observer.update(value);
		}
	}
}
