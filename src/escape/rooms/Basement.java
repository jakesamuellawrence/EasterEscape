package escape.rooms;

import escape.items.Laptop;

public class Basement extends DefaultRoom{

	public Basement(){
		name = "basement";
		items.add(new Laptop());
	}
	
}
