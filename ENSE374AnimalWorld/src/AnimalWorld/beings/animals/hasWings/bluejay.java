package AnimalWorld.beings.animals.hasWings;

import java.util.ArrayList;

import AnimalWorld.beings.animals.wings;

public class bluejay extends wings{
	public bluejay(){
		setName("bluejay");
		prey = new ArrayList<String>();
		prey.add("grasshopper");
		prey.add("tree");
		prey.add("catepillar");
	}

}
