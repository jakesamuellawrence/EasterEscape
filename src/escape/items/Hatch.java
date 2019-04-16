package escape.items;

import escape.InteractionManager;

public class Hatch extends DefaultItem{
	
	public Hatch(){
		name = "hatch";
		description = "a trapoor-styled HATCH built into the ceiling of the room";
	}
	
	@Override
	public void lookAt(){
		InteractionManager.say("It looks like the hatch would probably lead out of the basement and into the rest of the house");
	}
	
	@Override
	public void open(){
		InteractionManager.say("You push on the hatch but it just won't budge. You reckon it's probablt deadbolted from the "
							 + "other side.");
	}
	
	@Override
	public void close(){
		InteractionManager.say("It's already closed...");
	}
}
