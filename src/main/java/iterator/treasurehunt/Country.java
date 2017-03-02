package iterator.treasurehunt;

import java.util.Iterator;

public interface Country {
	Iterator<City> createIterator();
}
