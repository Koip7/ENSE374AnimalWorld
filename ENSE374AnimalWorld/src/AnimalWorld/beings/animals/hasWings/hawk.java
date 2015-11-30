package AnimalWorld.beings.animals.hasWings;

import java.util.ArrayList;

import AnimalWorld.beings.animals.wings;

public class hawk extends wings{
	public hawk(){
		setName("hawk");
		prey = new ArrayList<String>();
		prey.add("mouse");
		prey.add("squirrel");
	}
}
