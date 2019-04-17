package escape.items;

import escape.InteractionManager;

public class Switch extends DefaultItem{
	
	boolean on = true;
	boolean open = false;
	
	public Switch(){
		name = "switch";
		description = "a SWITCH for the Conduit Damper, protected by a glass case";
	}
	
	@Override
	public void lookAt(){
		if(!open){
			InteractionManager.say("It's a switch which is linked up to the whirring machine labelled 'Conduit Damper'. A hard glass "
								 + "casing is covering the button so you can't reach it. The glass case has a keyhole at the front of it.");
		}
		else{
			if(on){
				InteractionManager.say("It's a switch for the machine next to it labelled 'Conduit Damper'. It seems to be in the on position "
									 + "currently");
			}
			else{
				InteractionManager.say("It's a switch for the machine next to it labelled 'Conduit Damper'. It seems to be in the off position "
						 			 + "currently");
			}
		}
	}
	
	@Override
	public void use(){
		if(open){
			if(on){
				InteractionManager.say("You flick the switch to the off position. You hear the whirring of the conduit damper slowing down "
									 + "until it's entirely silent");
				on = false;
			}
			else{
				InteractionManager.say("You flick the switch to the on position and hear the conduit damper whirring up to speed");
				on = true;
			}
		}
		else{
			InteractionManager.say("You try to use the switch but you can't reach it because of the protective casing.");
		}
	}
	
	@Override
	public void useWith(Item item){
		if(item instanceof Hammer){
			InteractionManager.say("You slam the hammer into the protective casing, throwing glass everywhere. You can reach the switch now :)");
			open = true;
		}
		else{
			super.useWith(item);
		}
	}
	
	@Override
	public void open(){
		if(!open){
			InteractionManager.say("You tug on the casing, but it won't budge");
		}
		else{
			InteractionManager.say("You've already 'opened' it, there's not really much more you can do with it");
		}
	}
	
	@Override
	public void close(){
		if(!open){
			InteractionManager.say("It's already closed...");
		}
		else{
			InteractionManager.say("You smahed into a thousand pieces when you 'opened' it, there's no going back from that.");
		}
	}
	
	@Override
	public void pickUp(){
		InteractionManager.say("It's nailed down, and wired in. No picking it up!");
	}
	
	public boolean isOn(){
		return on;
	}
	
}
