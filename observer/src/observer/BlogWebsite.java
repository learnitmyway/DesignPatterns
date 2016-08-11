package observer;

public class BlogWebsite {

	public static void main(String[] args) {
		Blogger sciFiBlogger = new Blogger();
		sciFiBlogger.setMessage(", check out my first blog post about upcoming Sci-Fi books!");

		Fan sciFiFan = new Fan(sciFiBlogger, "Sam");
		Fan carFan = new Fan(sciFiBlogger, "Chris");
		
		sciFiBlogger.notifyObservers();
		
		sciFiBlogger.removeObserver(carFan);

		sciFiBlogger.setMessage(", glad to see you back!");
		sciFiBlogger.notifyObservers();
	}

}
