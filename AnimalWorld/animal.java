package AnimalWorld;
import java.util.*;

public class animal extends being{
	private int lifeSpan = 2;
	protected int travelDistance;
	protected List<String> prey;
	protected boolean hasEaten = false;
	
	public int getLifeSpan()
	{
		return lifeSpan;
	}
	
	public void reduceLifeSpan()
	{
		lifeSpan--;
		
		if(lifeSpan < 0)
		{
			this.kill();
		}
	}
	
	public int getTravelDistance()
	{
		return travelDistance;
	}
	public void increaseLifeSpan()
	{
		lifeSpan = 2;
		hasEaten = false;
	}
	
	public boolean isPrey(String name)
	{
		return prey.contains(name);
	}
	
	

}
