package AnimalWorld;

import java.util.ArrayList;

public class grasshopper extends insect{
	grasshopper()
	{
		setName("grasshopper");
		prey = new ArrayList<String>();
		prey.add("grass");
	}
}
