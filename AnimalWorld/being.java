package AnimalWorld;

public abstract class being {
	private boolean alive;
	private point position;
	private String name;
	
	public boolean isALive(){
		return alive;
	}
	public point getPosition(){
		return position;
	}
	public void setPosition(point p){
		position = p;
	}
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
}
