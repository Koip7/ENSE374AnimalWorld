package AnimalWorld.beings;
import java.util.*;

import AnimalWorld.being;

public abstract class animal extends being{
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
	public boolean getHasEaten()
	{
		return hasEaten;
	}
	public void setHasEaten()
	{
		hasEaten = true;
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
