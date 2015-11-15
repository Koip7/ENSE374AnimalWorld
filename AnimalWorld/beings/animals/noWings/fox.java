package AnimalWorld.beings.animals.noWings;

import java.util.ArrayList;

import AnimalWorld.beings.animals.wingless;

public class fox extends wingless{
	public fox(){
		setName("fox");
		prey = new ArrayList<String>();
		prey.add("squirrel");
		prey.add("rabbit");
		prey.add("mouse");
		prey.add("bluejay");
	}

}
