package adapter;

public class Hans implements German {

	@Override
	public void schaueSport() { // watch Soccer
		// Hans will be so happy if Germany wins the Euro 2016
		System.out.println("Hans wird sich tierisch darüber freuen, wenn Deutschland die EM gewinnt"); 
	}

	@Override
	public void esseLieblingsEssen() { // eatAsparagus
		// Hans loves his Asparagus
		System.out.println("Hans liebt seinen Spargel"); 
	}

}
