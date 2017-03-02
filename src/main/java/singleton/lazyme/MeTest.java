package singleton.lazyme;

public class MeTest {

	public static void main(String... args) {
		Runnable myRunnable1 = new MyRunnable();
		Runnable myRunnable2 = new MyRunnable();
		new Thread(myRunnable1).start();
		new Thread(myRunnable2).start();
	}
}
