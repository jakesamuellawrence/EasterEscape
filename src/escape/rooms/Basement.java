package escape.rooms;

import escape.items.BookCase;
import escape.items.DogBowl;
import escape.items.Hatch;
import escape.items.Laptop;
import escape.items.WoodenBox;

public class Basement extends DefaultRoom{

	public Basement(){
		name = "basement";
		items.add(new Laptop());
		items.add(new Hatch());
		items.add(new WoodenBox());
		items.add(new DogBowl());
		items.add(new BookCase());
	}
	
}
