package singleton.synchronizedme;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		Me me = Me.getMe();
		me.stealWallet();
	}
}
