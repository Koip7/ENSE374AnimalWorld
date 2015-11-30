package AnimalWorld.beings.animals.noWings;

import java.util.ArrayList;

import AnimalWorld.beings.animals.wingless;

public class wolf extends wingless{
	public wolf(){
		setName("wolf");
		prey = new ArrayList<String>();
		prey.add("deer");
		prey.add("rabbit");
	}
}
