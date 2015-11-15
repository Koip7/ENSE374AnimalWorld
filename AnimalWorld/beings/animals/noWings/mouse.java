package AnimalWorld.beings.animals.noWings;

import java.util.ArrayList;

import AnimalWorld.beings.animals.wingless;

public class mouse extends wingless{
	public mouse()	{
		setName("mouse");
		prey = new ArrayList<String>();
		prey.add("grass");
		prey.add("trees");
	}

}
