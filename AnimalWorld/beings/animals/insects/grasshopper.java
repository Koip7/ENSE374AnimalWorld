package AnimalWorld.beings.animals.insects;

import java.util.ArrayList;

import AnimalWorld.beings.animals.insect;

public class grasshopper extends insect{
	public grasshopper()
	{
		setName("grasshopper");
		prey = new ArrayList<String>();
		prey.add("grass");
	}
}
