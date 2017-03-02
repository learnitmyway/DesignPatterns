package composite.movies;

// Leaf
public class Movie extends MovieComponent {

	private String title;

	public Movie(String title) {
		this.title = title;
	}

	@Override
	public void display() {
		System.out.println(title);
	}

}
