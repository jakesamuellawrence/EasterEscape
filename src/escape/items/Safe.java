package escape.items;

import escape.InteractionManager;

public class Safe extends DefaultItem{
	
	boolean open = false;

	public Safe(){
		name = "safe";
		description = "a SAFE built into the wall";
	}
	
	@Override
	public void lookAt(){
		InteractionManager.say("You look at the safe. There's a small display which reads 'please enter keycode'. Underneath is a keypad, but "
							 + "once you look at it up close, you realise it's all out of order:");
		InteractionManager.say("7|3|1");
		InteractionManager.say("-----");
		InteractionManager.say("8|2|5");
		InteractionManager.say("-----");
		InteractionManager.say("4|6|9");
		InteractionManager.say("  0  ");
	}
	
	@Override
	public void open(){
		if(!open){
			InteractionManager.say("You tug on the door but it's locked. Seeing the numberpad next to the door, you realise "
					             + "you're probably going to have to enter the right keycode to unlock it.");
			InteractionManager.say("");
			String combination = InteractionManager.ask("What combination do you want to enter?");
			if(combination.equals("6219")){
				open = true;
				InteractionManager.say("You enter the code and the display flashes green. After a moment, "
						             + "you hear a click and the door swings open, revealing a large IRON KEY "
						             + "sitting inside. It looks old, like it's come straight out of an old victorian "
						             + "house.");
				InteractionManager.getCurrentRoom().addItem(new IronKey());
			}
			else{
				InteractionManager.say("You enter the code and the the display flashes red. Looks like you "
						             + "didn't enter the right code.");
			}
		}
		else{
			InteractionManager.say("It's already open...");
		}
	}
	
	@Override
	public void close(){
		if(open){
			InteractionManager.say("You push on the door of the safe and it swings shut with a thud.");
			InteractionManager.getCurrentRoom().removeItem(InteractionManager.getCurrentRoom().findItem("iron key"));
			open = false;
		}
		else{
			InteractionManager.say("It's already closed...");
		}
	}
	
	@Override
	public void use(){
		open();
	}
	
	@Override
	public void pickUp(){
		InteractionManager.say("It's built into the wall...");
	}
	
}
