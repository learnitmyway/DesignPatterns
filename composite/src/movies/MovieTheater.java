package movies;

// Client
public class MovieTheater {

	private MovieComponent movies;

	public MovieTheater(MovieComponent movies) {
		this.movies = movies;
	}

	public void displayMovies() {
		movies.display();
	}

}
