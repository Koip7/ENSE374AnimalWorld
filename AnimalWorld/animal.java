package AnimalWorld;
import java.util.*;

public abstract class animal extends being{
	private int lifeSpan = 2;
	protected int travelDistance;
	private List<String> prey;
	
	public int getLifeSpan()
	{
		return lifeSpan;
	}
	
	public void reduceLifeSpan()
	{
		lifeSpan--;
	}
	
	public void increaseLifeSpan()
	{
		lifeSpan = 2;
	}
	
	public boolean isPrey(String name)
	{
		return prey.contains(name);
	}
	
	public void addPrey(String preyName)
	{
		prey.add(preyName);
	}

}
