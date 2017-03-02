package composite.movies;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Composite
public class MovieGroup extends MovieComponent {

	private Rating rating;
	private List<MovieComponent> movieComponents;

	public MovieGroup(Rating rating) {
		this.rating = rating;
		movieComponents = new ArrayList<>();
	}

	public MovieGroup() {
		movieComponents = new ArrayList<>();
	}

	@Override
	public void add(MovieComponent movieComponent) {
		movieComponents.add(movieComponent);
	}

	@Override
	public void display() {
		if (null != rating) {
			System.out.println(rating);
		}

		final Iterator<MovieComponent> movieIterator = movieComponents.iterator();
		
		while(movieIterator.hasNext()) {
			final MovieComponent movieComponent = movieIterator.next();
			movieComponent.display();
		}
	}

}
