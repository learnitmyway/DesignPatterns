package culturalDifferences;

public class Hans implements German {

	@Override
	public void schaueSport() { // watch sport
		// Hans is watching football
		System.out.println("Hans guckt fußball"); 
	}

	@Override
	public void esseLieblingsEssen() { // eat favorite food
		// Hans loves his Asparagus
		System.out.println("Hans liebt seinen Spargel"); 
	}

}
