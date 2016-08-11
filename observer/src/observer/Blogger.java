package observer;

import java.util.ArrayList;

public class Blogger implements Subject {
	private ArrayList<Observer> observers = new ArrayList<>();
	private String message;

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		System.out.println("Thanks for subscribing :)");
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
		}
		System.out.println("Sorry to see you go :(");
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(message);
		}
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
