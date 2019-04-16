package escape.items;

import escape.InteractionManager;
import escape.rooms.Basement;
import escape.rooms.Lab;

public class BookCase extends DefaultItem{
	
	boolean solved = false;
	
	public BookCase(){
		name = "bookcase";
		description = "A large BOOKCASE built into one of the walls of the basement";
	}
	
	@Override
	public void lookAt(){
		InteractionManager.say("It's a set of shelves built into the wall, lined with books, dvds, and TV Show boxsets. Looking along the "
							 + "shelves you see the following titles:");
		InteractionManager.say("1) Whiplash");
		InteractionManager.say("2) In His Steps: What Would Jesus Do?");
		InteractionManager.say("3) The Cat in the hat");
		InteractionManager.say("4) The Battle of Algiers");
		InteractionManager.say("5) Amores Perros");
		InteractionManager.say("6) Norwegian Wood");
		InteractionManager.say("7) Lock, Stock and Two Smoking Barrels");
		InteractionManager.say("8) The Catcher in the Rye");
		InteractionManager.say("9) Judgment at Nuremburg");
		InteractionManager.say("10) Back to the Future Trilogy");
		InteractionManager.say("11) Inglorious Basterds");
		InteractionManager.say("12) There Will Be Blood");
		InteractionManager.say("13) Twelve Monkeys");
		InteractionManager.say("14) WALL.E");
		InteractionManager.say("15) The General");
		InteractionManager.say("16) House boxset");
		InteractionManager.say("17) Yu Dan's Insights on the Analects of Confucius");
		InteractionManager.say("18) The Great Escape");
		InteractionManager.say("19) Ben-Hur");
		InteractionManager.say("20) The Night of the Hunter");
	}
	
	@Override
	public void use(){
		if(!solved){
			lookAt();
			String book = InteractionManager.ask("Which title on the shelves would you like to take?");
			if(book.equals("10")){
				solved = true;
				InteractionManager.say("You slide the Back to The Future boxset out of the shelf, and hear a click. The entire bookcase begins "
									 + "to rotate, taking you with it, until eventually you find yourself in a new room entirely.");
				InteractionManager.switchRoom("lab");
				InteractionManager.say("");
				InteractionManager.say("Looking around the new room, it seems to be some sort of laboratory. Machines and blinking lights line "
									 + "the walls, and wires trail across the floor. Along on wall is a countertop, atop which sits a large "
									 + "whirring machine labelled 'Conduit Damper'. To the far side of the machine is a switch, encased in "
									 + "a protective cover, and even further along the counter is a large pile of tools. Embedded into the far "
									 + "wall is a safe.");
			}
			else{
				InteractionManager.say("You try to slide it out, but it won't even budge at all");
			}
		}
		else{
			if(InteractionManager.getCurrentRoom() instanceof Basement){
				InteractionManager.say("You tug on the Back To the Future Boxset and the door revolves round, back into the lab");
				InteractionManager.switchRoom("lab");
			}
			else if(InteractionManager.getCurrentRoom() instanceof Lab){
				InteractionManager.say("You tug on the Back To the Future Boxset and the door revolves round, back into the basement");
				InteractionManager.switchRoom("basement");
			}
		}
	}
	
	@Override
	public void pickUp(){
		use();
	}
	
	@Override
	public void open(){
		if(solved){
			if(InteractionManager.getCurrentRoom() instanceof Basement){
				InteractionManager.say("You tug on the Back To the Future Boxset and the door revolves round, back into the lab");
				InteractionManager.switchRoom("lab");
			}
			else if(InteractionManager.getCurrentRoom() instanceof Lab){
				InteractionManager.say("You tug on the Back To the Future Boxset and the door revolves round, back into the basement");
				InteractionManager.switchRoom("basement");
			}
		}
		else{
			super.open();
		}
	}

}
