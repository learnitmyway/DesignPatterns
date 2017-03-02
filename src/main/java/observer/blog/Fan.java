package observer.blog;

public class Fan implements Observer {
	private final Subject blogger;
	private final String name;
	
	public Fan(Subject blogger, String name) {
		this.blogger = blogger;
		this.name = name;
		this.blogger.registerObserver(this);
	}

	@Override
	public void update() {
		System.out.println(name + " reads the message");
	}
	
	@Override
	public String getName() {
		return name;
	}

}
