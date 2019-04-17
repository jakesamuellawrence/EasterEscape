package escape.rooms;

import escape.InteractionManager;
import escape.items.Safe;

public class Lab extends DefaultRoom{
	
	public Lab(){
		name = "lab";
		items.add(InteractionManager.findRoom("basement").findItem("bookcase"));
		items.add(new Safe());
	}

}
