package escape;

public class Main{
	public static void main(String[] args){
		InteractionManager.say("You find yourself in an unfamiliar room. Looking around, it seems to be some sort of basement. "
							 + "To one side of you is a set of stairs leading up to a trapdoor hatch. In the centre of the room is a "
							 + "large table, with a laptop sitting on top, and old-looking wooden box to the side of it. Built into "
							 + "the far wall is a bookshelf filled with books, dvds and TV boxsets. In the far corner is dog's food bowl.");
		InteractionManager.say("");
		InteractionManager.initialise();
	}
}
