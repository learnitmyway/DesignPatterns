package composite.movies;

public class MoviesTest {
	
	public static void main(String[] args) {
		// movie groups
		final MovieComponent rMovies = new MovieGroup(Rating.R);
		final MovieComponent pgMovies = new MovieGroup(Rating.PG);
		final MovieComponent gMovies = new MovieGroup(Rating.G);

		final MovieComponent allMovies = new MovieGroup();
		
		// add movies to groups
		rMovies.add(new Movie("Deadpool"));
		rMovies.add(new Movie("Saving Private Ryan"));
		
		pgMovies.add(new Movie("Home Alone"));
		pgMovies.add(new Movie("Jumanji"));
		
		gMovies.add(new Movie("WALL-E"));
		gMovies.add(new Movie("Aladdin"));
		
		// add groups
		allMovies.add(rMovies);
		allMovies.add(pgMovies);
		allMovies.add(gMovies);
		
		final MovieTheater movieTheater = new MovieTheater(allMovies);
		
		movieTheater.displayMovies();

	}

}
