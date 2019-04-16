package escape.items;

import escape.InteractionManager;

public class DogBowl extends DefaultItem{

	public DogBowl(){
		name = "dog bowl";
		description = "a ceramic DOG BOWL sitting in the corner of the room";
	}
	
	@Override
	public void lookAt(){
		InteractionManager.say("It's an empty ceramic dog bowl. The name 'Einstein' is written on the front");
	}
	
}
