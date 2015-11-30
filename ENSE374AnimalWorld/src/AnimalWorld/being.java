package AnimalWorld;

public abstract class being {
	protected boolean alive;
	private String name;
	
	public being(){
		alive = true;
		name = null;
	}
	
	public boolean isALive(){
		return alive;
	}
	public void kill()
	{
		alive = false;
	}
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
}
