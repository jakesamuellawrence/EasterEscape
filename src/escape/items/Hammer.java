package escape.items;

import escape.InteractionManager;

public class Hammer extends DefaultItem{
	
	public Hammer(){
		name = "hammer";
		description = "a HAMMER lying next to a large pile of tools";
	}
	
	@Override
	public void lookAt(){
		InteractionManager.say("It feels weighty and good in your hands. You feel like you "
							 + "could definitely fend off a zombie apocalypse with this if you needed to");
	}
	
	@Override
	public void pickUp(){
		InteractionManager.say("You grab the hammer and put it into your pocket");
		InteractionManager.addItemToInventory(this);
	}

}
