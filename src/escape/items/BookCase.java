package escape.items;

import escape.InteractionManager;
import escape.rooms.Basement;
import escape.rooms.Lab;

public class BookCase extends DefaultItem{
	
	boolean solved = false;
	
	public BookCase(){
		name = "bookcase";
		description = "A large BOOKCASE built into the wall";
	}
	
	@Override
	public void lookAt(){
		InteractionManager.say("It's a set of shelves built into the wall, lined with books, dvds, and TV Show boxsets. Looking along the "
							 + "shelves you see the following titles:");
		InteractionManager.say("Whiplash");
		InteractionManager.say("In His Steps: What Would Jesus Do?");
		InteractionManager.say("The Cat in the hat");
		InteractionManager.say("The Battle of Algiers");
		InteractionManager.say("Amores Perros");
		InteractionManager.say("Norwegian Wood");
		InteractionManager.say("Lock, Stock and Two Smoking Barrels");
		InteractionManager.say("The Catcher in the Rye");
		InteractionManager.say("Judgment at Nuremburg");
		InteractionManager.say("Back to the Future Trilogy");
		InteractionManager.say("Inglorious Basterds");
		InteractionManager.say("There Will Be Blood");
		InteractionManager.say("Twelve Monkeys");
		InteractionManager.say("WALL.E");
		InteractionManager.say("The General");
		InteractionManager.say("House boxset");
		InteractionManager.say("Yu Dan's Insights on the Analects of Confucius");
		InteractionManager.say("The Great Escape");
		InteractionManager.say("Ben-Hur");
		InteractionManager.say("The Night of the Hunter");
		if(!solved){
			InteractionManager.say("");
			String choice = InteractionManager.ask("Would you like to take one of them off the shelf to get a better look?");
			if(choice.contains("yes")){
				InteractionManager.say("");
				use();
			}
		}	
	}
	
	@Override
	public void use(){
		if(!solved){
			String book = InteractionManager.ask("Which title on the shelves would you like to take?");
			if(book.toLowerCase().contains("back to the future")){
				solved = true;
				InteractionManager.say("You slide the Back to The Future boxset out of the shelf, and hear a click. The entire bookcase begins "
									 + "to rotate, taking you with it, until eventually you find yourself in a new room entirely.");
				InteractionManager.switchRoom("lab");
				InteractionManager.say("");
				InteractionManager.say("Looking around the new room, it seems to be some sort of laboratory. Machines and blinking lights line "
									 + "the walls, and wires trail across the floor. Along one wall is a countertop, atop which sits a large "
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
