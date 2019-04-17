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

}
