package escape.items;

import escape.InteractionManager;

public class Laptop extends DefaultItem{
	
	public Laptop(){
		name = "laptop";
		description = "a LAPTOP sitting open on a table in the centre of the room";
	}
	
	@Override
	public void close(){
		InteractionManager.say("You can't see how closing the laptop would help you");
	}
	
	@Override
	public void open(){
		InteractionManager.say("It's already open");
	}
	
	@Override
	public void use(){
		lookAt();
	}
	
	@Override
	public void lookAt(){
		InteractionManager.say("The screen is black, but you tap some keys and it flickers to life. It seems whoever "
							 + "last used this computer left their emails open. It's logged in as 'rose.clarkson@archeon.org'");
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
		InteractionManager.say("2) Subject: Finally translated those runes");
		InteractionManager.say("3) Subject: Great Scot! The first test was a success? (Sort of...)");
		InteractionManager.say("4) Subject: FUCK! I AM SUCH A CLUTZ! GRRRRR");
		InteractionManager.say("5̴̯̇̈͗̃)̴̨͈̭̯̖̣͒̽̎̊͝ ̸̲͖̤́ͅS̶̡̖̄͠ų̷̥̩̮̮̅͝b̴̼̟͖̈̂̂͑͛̿́ERRORCORRUPTEDFILEc̸͈̜̍͒͘t̴̢̡̖̰̂̏̔:̸̣̟̗̠̯̔͑̀̊͋ ̵̺͎͓͔̃͊̇̍̆͜͝r̶̡̤̲͓̺̤̥̀̄͆̓ū̶͉̽̐̍͝n̵̩̤̞͉̬̗̏̏̉̆̕̚.̶͕͇͈͔̀́́");
		InteractionManager.say("");
		String email = InteractionManager.ask("Which email would you like to read?");
		try{
			readEmail(Integer.parseInt(email));
		}
		catch(NumberFormatException e){
			InteractionManager.say("You must enter a number.");
		}
		String choice = InteractionManager.ask("Would you like to continue reading emails?");
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
		else if(email == 2){
			InteractionManager.say("You click on 'Finally translated those runes' and the computer whirrs into action, "
								 + "then displays the following emails: ");
			InteractionManager.say("FROM: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: Finally translated those runes");
			InteractionManager.say("Alright so I'm pretty srue I've finished translating the writings on all the tablets you sent me. "
								 + "The thing is though, you're not going to believe me when I tell you what it says...");
			InteractionManager.ask("");
			InteractionManager.say("TO: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: RE: Finally translated those runes");
			InteractionManager.say("David I've been waiting 6 months to find out what this thing is just bloody tell me already.");
			InteractionManager.ask("");
			InteractionManager.say("FROM david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: RE: Finally translated those runes");
			InteractionManager.say("Okay so the entire text seems to be talking about... other worlds. "
								 + "Like paralell dimensions, and entire other universes sitting side-by-side with ours. "
								 + "Most of the text seems to be speculation and theories and I can't see any direct references "
								 + "to a box within the text, but they keep referring to something I can best translate as "
								 + "'The Conduit'. They talk about it as if it has some kind of connection with these other worlds, "
								 + "and seem to heavily imply it can carry things BETWEEN the worlds. I know this all sounds "
								 + "farfetched, but I've checked eveything a hundred times and I'm pretty damn certain of my translations.");
			InteractionManager.ask("");
			InteractionManager.say("TO: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: RE: Finally translated those runes");
			InteractionManager.say("You're absolutely right I don't believe you! I mean these guys were THOUSANDS OF YEARS OLD. "
								 + "However, I do trust you, and I know you will have translated those texts right, so honestly I have "
								 + "no fucking clue what to believe right now, especially what with the weird energy signatures it's "
								 + "giving off. If it really is some connection to another world (and that's a bloody massive if), "
								 + "we need to find out. I mean this could be MASSIVE if it's true!");
			InteractionManager.ask("");
			InteractionManager.say("FROM: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: RE: Finally translated those runes");
			InteractionManager.say("Agreed. I'd say let's make sure it's completely safe, then begin testing!");
			
		}
		else if(email == 3){
			InteractionManager.say("You click on 'Great Scot! The first test was a success? (sort of...)' and the computer whirrs into action, "
								 + "then displays the following emails: ");
			InteractionManager.say("TO: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: Great Scot! the first test was a success? (sort of...)");
			InteractionManager.say("Okay so I know for certain this box has some capacity to transport items! The only "
								 + "thing is, it wasn't exactly me who did this test? I had just finished making sure the box "
								 + "was safe to interact with, so I deactivated the damper. Before I could even begin any testing "
								 + "though, I pick up a massive spike in the box's energy signatures, and hear a 'woosh' kind of sound "
								 + "coming from the other room. "
								 + "I run through to the other room and check the box AND THERE'S BLOODY SOMETHING IN THERE THAT WASN'T "
								 + "THERE BEFORE. At the bottom of the box there's just this big iron key, looks like it came right out "
								 + "the victorian era (or just some victorian era house I suppose). I've picked it up and put it in the safe "
								 + "in the secret lab. I'm going to be real I'm bloody terrified but also out of my mind excited.");
			InteractionManager.ask("");
			InteractionManager.say("FROM: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: RE: Great Scot! the first test was a success? (sort of...)");
			InteractionManager.say("Oh my god! The texts were absolutely right I bloody knew it! This is fucking massive Rose! "
								 + "I'm heading over to you so we can find out more about this, should be there in like a week.");
		}
		else if(email == 4){
			InteractionManager.say("You click on 'FUCK! I AM SUCH A CLUTZ! GRRR' and the computer whirrs into action, "
								 + "then displays the following emails: ");
			InteractionManager.say("TO: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: FUCK! I AM SUCH A CLUTZ! GRRR");
			InteractionManager.say("ARGHARGAHSGDH I'M SO FUCKING DUMB. Right so you know how I keep that wee note "
							     + "that's got the clue to the combination for the safe? And you know how I've got "
							     + "two bloody left feet? And am completely ambi-undextrous? Well guess which idiot "
							     + "dropped the note INTO THE BLOODY CONDUIT BOX. I was like it's fine the damper is "
							     + "on, BUT NO APPARENTLY EARLIER I ALSO STUMBLED INTO THAT AND TURNED IT OFF. I guess "
							     + "that key is stuck in the safe forever now then. I'm gonna put a protective cover "
							     + "that requires a key on the switch for the damper, so I don't accidentally turn it off"
							     + "in future.");
			InteractionManager.ask("");
			InteractionManager.say("TO: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: RE: FUCK! I AM SUCH A CLUTZ! GRRR");
			InteractionManager.say("David? You don't usually take more than a day to reply to your emails, are you alright?");
			InteractionManager.ask("");
			InteractionManager.say("TO: david.brickson@archeon.org");
			InteractionManager.say("SUBJECT: RE: FUCK! I AM SUCH A CLUTZ! GRRR");
			InteractionManager.say("David it's been a week and you still haven't arrived here. Where are you? I'm starting to get "
								 + "really worried.");
		}
		else if(email == 5){
			InteractionManager.say("You click on the strange corrupted email chain, the computer freezes for a solid minute, before displaying:");
			InteractionManager.say("FROM: thro?a?ay.a??ount@sh??downet.n?t");
			InteractionManager.say("SUBJECT: run.");
			InteractionManager.say("Ros?. I d???t kno? how ?r w?o, ??? they ?ound?us, ??d they ?ant us to stop? ? d?n't have lo?g??"
								 + "using a burner, but I ??ed to you to ?un. Don'? let ??em f??d you? ??d de?t?oy this ?mail once "
								 + "you??e read i?. I l?????ou");
		}
		else{
			InteractionManager.say("Sorry, that's not a valid email number :(");
		}
		InteractionManager.say("");
	}
	
}
