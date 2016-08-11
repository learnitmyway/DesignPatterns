package observer;

public class Fan implements Observer {
	private String name;
	
	public Fan(Blogger blogger, String name) {
		blogger.registerObserver(this);
		this.name = name;
	}

	@Override
	public void update(String message) {
		displayMessage(message);
	}
	
	public void displayMessage(String message) {
		System.out.println("Hey " + name + message);
	}
}
