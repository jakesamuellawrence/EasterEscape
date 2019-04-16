package escape.rooms;

import escape.InteractionManager;

public class Lab extends DefaultRoom{
	
	public Lab(){
		name = "lab";
		items.add(InteractionManager.findRoom("basement").findItem("bookcase"));
	}

}
