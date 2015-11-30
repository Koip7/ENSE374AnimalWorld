package AnimalWorld.beings.animals.noWings;

import java.util.ArrayList;

import AnimalWorld.beings.animals.wingless;

public class squirrel extends wingless{
	public squirrel(){
		setName("squirrel");
		prey = new ArrayList<String>();
		prey.add("tree");
	}

}
