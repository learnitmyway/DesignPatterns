package composite.movies;

// Component
public abstract class MovieComponent {

	public void add(MovieComponent rMovies) {
		throw new UnsupportedOperationException();
	}

	public abstract void display();

}
