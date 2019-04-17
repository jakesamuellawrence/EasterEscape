package escape.items;

import escape.InteractionManager;

public class Tools extends DefaultItem{
	
	boolean found_hammer = false;

	public Tools(){
		name = "tools";
		description = "a large pile of TOOLS sitting on top of the counter";
	}
	
	@Override
	public void lookAt(){
		InteractionManager.say("You look through the pile of tools but none of it is stuff you recognise. There's a strange L-shaped rod "
							 + "labelled 'BiffleWomper - for whomping biffles', a small gadget labelled 'Mainframe Bypasser - for all your "
							 + "hacking needs', a spanner covered in flashing lights labelled 'Sonic Spanner - for... anything the plot "
							 + "requires', and many many more. Eventually, at the bottom of the pile, you find a HAMMER labelled 'Hammer - "
							 + "for knocking in nails'");
		InteractionManager.getCurrentRoom().addItem(new Hammer());
	}
	
	@Override
	public void pickUp(){
		InteractionManager.say("You can't possibly fit all of the tools in your pocket. You'll probably need to look through them all "
							 + "and just choose one. (Besides, you wouldn't even know how to use them)");
	}
	
}
