package AnimalWorld.beings.animals.insects;

import java.util.ArrayList;

import AnimalWorld.beings.animals.insect;

public class catepillar extends insect {
	public catepillar(){
		setName("catepillar");
		prey = new ArrayList<String>();
		prey.add("tree");
	}
}
