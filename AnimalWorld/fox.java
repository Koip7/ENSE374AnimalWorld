package AnimalWorld;

import java.util.ArrayList;

public class fox extends wingless{
	fox(){
		setName("fox");
		prey = new ArrayList<String>();
		prey.add("squirrel");
		prey.add("rabbit");
		prey.add("mouse");
		prey.add("bluejay");
	}

}
