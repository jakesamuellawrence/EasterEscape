package escape.items;

import escape.InteractionManager;

public class WoodenBox extends DefaultItem{
	
	boolean open = false;
	
	public WoodenBox(){
		name = "wooden box";
		description = "an old-looking WOODEN BOX sitting on top of a large table";
	}
	
	@Override
	public void lookAt(){
		if(!open){
			InteractionManager.say("It's looks ancient and beautiful. Two iron bands stretch across the back and lid of the box, attached to the "
					 			 + "hinges. A simple latch holds the box shut at the front");
		}
		else if(open){
			InteractionManager.say("You look inside but can't see anything.");
		}
		Switch damper_switch = (Switch)InteractionManager.findRoom("lab").findItem("switch");
		if(!damper_switch.isOn()){
			InteractionManager.say("You regularly feel pulses of energy emenating from the box");
		}
	}
	
	@Override
	public void useWith(Item item){
		Switch damper_switch = (Switch)InteractionManager.findRoom("lab").findItem("switch");
		if(open){
			if(!damper_switch.isOn()){
				InteractionManager.sayBoxed("You place the " + item.getName() + " into the box. There's a flash, you feel a wave of energy "
										  + "sweep through you, and the " + item.getName() + " dissapears before your "
										  + "very eyes!");
				InteractionManager.removeItemFromInventory(this);
			}
			else{
				InteractionManager.say("You place the item in the box, and nothing happens. After waiting a minute you decide to "
									 + "pick it back up again and put it in your pockets");
			}
		}
		else{
			InteractionManager.say("You try to place the " + item.getName() + "in the box but the box is closed.");
		}
	}
	
	@Override
	public void open(){
		if(!open){
			InteractionManager.say("You undo the latch and swing the box open. However, there doesn't seem to be anything inside");
			open = true;
		}
		else{
			InteractionManager.say("It's already open...");
		}
	}
	
	@Override
	public void close(){
		if(open){
			InteractionManager.say("You swing the lid of the box shut");
			open = false;
		}
		else{
			InteractionManager.say("it's already closed...");
		}
	}

}
