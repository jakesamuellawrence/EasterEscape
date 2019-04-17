package escape.items;

import escape.InteractionManager;

public class ConduitDamper extends DefaultItem{
	
	public ConduitDamper(){
		name = "conduit damper";
		description = "a large machine whirring and spinning and blinking, labelled 'CONDUIT DAMPER'";
	}
	
	@Override
	public void lookAt(){
		Switch damper_switch = (Switch)InteractionManager.getCurrentRoom().findItem("switch");
		if(damper_switch.isOn()){
			InteractionManager.say("The machine whirrs and spins and many lights on it blink. You figure it's probably on right now");
		}
		else{
			InteractionManager.say("The machine is still and silent. You figure it's probably been switched off");
		}
	}
	
	@Override
	public void useWith(Item item){
		if(item instanceof Hammer){
			InteractionManager.say("You swing your hammer into the conduit damper, which begins to groan and creak, sparks flying everywhere. "
								 + "You expected it to slow down after you smashed it, but it gets faster and faster an faster, something inside "
								 + "clearly very broken. More and more sparks fly, before eventually you see an brilliant green flash and feel "
								 + "a shockwave blast through you. You shield your eyes from the flash, and when you open them again you find "
								 + "yourself stadning in front of the fully-functional conduit damper, hammer in hand, and feeling a strange "
								 + "sense of deja vu.");
		}
	}

}
