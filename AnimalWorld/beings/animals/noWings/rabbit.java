package AnimalWorld.beings.animals.noWings;

import java.util.ArrayList;

import AnimalWorld.beings.animals.wingless;

public class rabbit extends wingless{
	public rabbit(){
		setName("rabbit");
		prey = new ArrayList<String>();
		prey.add("grass");
	}

}
