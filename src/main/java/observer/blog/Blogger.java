package observer.blog;

import java.util.ArrayList;

public class Blogger implements Subject {
	private final ArrayList<Observer> observers;
	
	public Blogger() {
		observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		System.out.println(observer.getName() + " subscribes to the blog");
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
			System.out.println(observer.getName() + " unsubscribes from the blog");
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update();
		}
	}

	public void displayMessage(String message) {
		System.out.println(message);
	}
	
}
