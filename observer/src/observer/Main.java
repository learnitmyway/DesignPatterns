package observer;

public class Main {

	public static void main(String[] args) {

		Blogger blogger = new Blogger();

		Fan sciFiFan = new Fan(blogger, "iBleedStarTrek");
		Fan carFan = new Fan(blogger, "iHeartTesla");
		
		System.out.println("");

		blogger.displayMessage("Hey, check out my latest blog post on upcoming Sci-Fi books!");

		System.out.println("");

		blogger.notifyObservers();

		System.out.println("");

		blogger.removeObserver(carFan);

	}

}
