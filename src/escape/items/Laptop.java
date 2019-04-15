package escape.items;

import escape.InteractionManager;

public class Laptop extends DefaultItem{
	
	public Laptop(){
		name = "laptop";
		description = "a LAPTOP sitting open on a table in the centre of the room";
	}
	
	@Override
	public void lookAt(){
		InteractionManager.say("The screen is black, but you tap some keys and it flickers to life. It seems whoever "
							 + "last used this computer left their emails open. It's logged in as 'rose.clarckson@archeon.org'");
		InteractionManager.say("");
		String choice = InteractionManager.ask("Do you want to read them?");
		if(choice.contains("yes")){
			readEmails();
		}
		else{
			InteractionManager.say("You decide it's probably best not to snoop in other people's bussiness. After all, you "
								 + "don't even know who's bussiness you'd be snooping in.");
		}
	}
	
	void readEmails(){
		InteractionManager.say("You look through the list of available emails:");
		InteractionManager.say("1) Subject: Strange box...");
		InteractionManager.say("2) Subject: Finally translated those runes!");
		InteractionManager.say("3) Subject: Ready to begin testing");
		InteractionManager.say("4) Subject: You're going to need to come see this");
		InteractionManager.say("5) Subject: FUCK! I AM SUCH A CLUTZ! GRRRRR");
		InteractionManager.say("");
		String email = InteractionManager.ask("Which email would you like to read?");
		try{
			readEmail(Integer.parseInt(email));
		}
		catch(NumberFormatException e){
			InteractionManager.say("You must enter a number.");
		}
		String choice = InteractionManager.ask("Would like to continue reading emails?");
		if(choice.contains("yes")){
			readEmails();
		}
		else{
			InteractionManager.say("You decide to stop look at this random person's emails, and continue looking for whatever it is "
								 + "you're supposed to be doing here");
		}
	}
	
	void readEmail(int email){
		if(email == 1){
			InteractionManager.say("You click on 'Strange box...' and the computer whirrs into action, then displays the following emails: ");
			InteractionManager.say("TO: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: Strange box...");
			InteractionManager.say("Finally finished going through all the stuff from the latest dig. Most of it is old tablets "
								 + "and writings which I'm sending your way (Good luck with the translation these glyphs are unlike "
								 + "any language I've ever seen before!). The only thing I've kept here is this weird wooden box. "
								 + "It seemed pretty standard to me, just a primitive wooden storage device, but as soon as I touched "
								 + "it I felt this... weird feeling. I know it sounds like total mumbo jumbo but it genuinely felt "
								 + "like it was regularly pulsing out some sort of energy wave? There's no way that's possible though "
								 + "this civilisation is from like 3 thousand years ago. Definitely worth investigating though.");
			InteractionManager.ask("");
			InteractionManager.say("FROM: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: RE: Strange box...");
			InteractionManager.say("Well, you know how all the stories go. Legends say this civilisation had technology far beyond "
								 + "what we're capable of now ;). Looks like you've discovered the first piece of their ancient "
								 + "super powerful tech! Now we must go to the four corners of the land to recover the missing pieces!"
								 + "(Get some sleep Rose, then run some tests in the morning) ");
			InteractionManager.ask("");
			InteractionManager.say("TO: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: RE: Strange box...");
			InteractionManager.say("Cmon David you know I don't believe in any of that stuff! I'll get back to you after I've run those "
								 + "tests.");
			InteractionManager.ask("");
			InteractionManager.say("TO: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: RE: Strange box...");
			InteractionManager.say("Okay so I've run some tests and the results are... weird????? "
								 + "I was right, it does seem to be emitting some kind of energy pulse, which is fucking ridiculous "
								 + "in and of itself. (how was an acient civilisation able to build something like this?) "
								 + "But it get's weirder. It's completely unlike any other energy signature I've ever seen "
								 + "before. We seriously need to get those tablets translated, and soon. I've found a way to "
								 + "dampen the energy pulses for now, just in case they're dangerous. I wanna find out more about "
								 + "this thing before we even consider trying to use it.");
		}
		else{
			InteractionManager.say("Sorry, that's not a valid email number :(");
		}
		InteractionManager.say("");
	}
	
}
