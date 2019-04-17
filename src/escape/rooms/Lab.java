package escape.rooms;

import escape.InteractionManager;
import escape.items.ConduitDamper;
import escape.items.Safe;
import escape.items.Switch;
import escape.items.Tools;

public class Lab extends DefaultRoom{
	
	public Lab(){
		name = "lab";
		items.add(InteractionManager.findRoom("basement").findItem("bookcase"));
		items.add(new Safe());
		items.add(new Tools());
		items.add(new Switch());
		items.add(new ConduitDamper());
	}

}
