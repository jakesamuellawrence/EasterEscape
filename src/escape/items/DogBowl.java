package escape.items;

import escape.InteractionManager;

public class DogBowl extends DefaultItem{
	
	boolean smashed = false;

	public DogBowl(){
		name = "dog bowl";
		description = "a ceramic DOG BOWL sitting in the corner of the room";
	}
	
	@Override
	public void lookAt(){
		if(!smashed){
			InteractionManager.say("It's an empty ceramic dog bowl. The name 'Einstein' is written on the front");
		}
		else{
			InteractionManager.say("Hundreds of pieces of ceramic lay scattered across the floor. I hope you're happy you monster");
		}
	}
	
	@Override
	public void useWith(Item item){
		if(item instanceof Hammer){
			if(!smashed){
				String choice = InteractionManager.ask("Are you really sure you want to use the hammer on some dog's bowl?");
				if(choice.contains("yes")){
					choice = InteractionManager.ask("Are you ABSOLUTELY certain you really want to destory the bowl of some poor random dog?");
					if(choice.contains("yes")){
						choice = InteractionManager.ask("Okay, fine, you're in charge I guess... are you REALLY SUPER DUPER SURE though?");
						if(choice.contains("yes")){
							InteractionManager.say("You slam your hammer down onto the ceramic bowl. Shards fly everywhere. The shattered remains "
												 + "of what used to be a beautiful dog bowl now lie on the floor. I hope you're happy now.");
							smashed = true;
							return;
						}
					}
				}
				InteractionManager.say("Thank you, you've made the right choice.");
			}
			else{
				InteractionManager.say("You've already smashed it to pieces, what more do you want you monster?");
			}
		}
	}
	
}
