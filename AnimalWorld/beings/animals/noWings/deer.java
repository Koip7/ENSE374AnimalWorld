package AnimalWorld.beings.animals.noWings;

import java.util.ArrayList;

import AnimalWorld.beings.animals.wingless;

public class deer extends wingless{
	public deer(){
		setName("deer");
		prey = new ArrayList<String>();
		prey.add("grass");
		prey.add("tree");
	}

}
