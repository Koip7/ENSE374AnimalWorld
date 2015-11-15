package AnimalWorld;

import java.util.ArrayList;

public class wolf extends wingless{
	wolf(){
		setName("wolf");
		prey = new ArrayList<String>();
		prey.add("deer");
		prey.add("rabbit");
	}
}
