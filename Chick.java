class Chick implements Animal//implements Animal 
{     
	private String myType;
 	private String mySound;
 	public Chick(String type, String sound, String sound2) {
 		myType = type;
		if(Math.random() > .5) {
			mySound = sound2;
		} else {
			mySound = sound;
		}
 	}
 	public String getSound(){
 		return mySound;
 	}
 	public String getType(){
 		return myType;
 	}
}
