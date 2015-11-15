package AnimalWorld;

import java.util.ArrayList;

public class hawk extends wings{
	hawk(){
		setName("hawk");
		prey = new ArrayList<String>();
		prey.add("mouse");
		prey.add("squirrel");
	}
}
