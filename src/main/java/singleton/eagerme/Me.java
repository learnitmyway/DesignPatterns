package singleton.eagerme;

public class Me {

	private static Me me = new Me();
	private boolean isWalletStolen = false;
	
	private Me() { }

	public static Me getMe() {
		return me;
	}
	
	public void stealWallet() {
		System.out.println("stealing David's wallet...");
		if (isWalletStolen == false) {
			System.out.println("David's wallet is now stolen");
			isWalletStolen = true;
		} else {
			System.out.println("David's wallet has already been stolen");
		}
	}
}
