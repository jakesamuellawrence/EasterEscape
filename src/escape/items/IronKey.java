package escape.items;

import escape.InteractionManager;

public class IronKey extends DefaultItem{

	public IronKey(){
		name = "iron key";
		description = "a large IRON KEY, sitting in an open safe.";
	}
	
	@Override
	public void lookAt(){
		InteractionManager.say("You turn the large iron key over in your hands. It's weighty, and looks like it came straight "
							 + "out of an old victorian house");
	}
	
	@Override
	public void pickUp(){
		InteractionManager.say("You grab the key and slip it into your pocket");
		InteractionManager.addItemToInventory(this);
	}
	
}
