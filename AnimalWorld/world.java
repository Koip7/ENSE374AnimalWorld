package AnimalWorld;

public class world {
	private int day = 0;
	private String[][] spaceName = new String[150][150];
	
	world()
	{
		for(int i = 0; i < 150; i++)
			for (int j = 0; j <150; j++)
			{
				spaceName[i][j] = null;
			}
	}
	public void nextDay()
	{
		day++;
	}
	public int getDay(){
		return day;
	}
	
	public boolean occupy(being b, int x, int y){
		String n = b.getName();
		if(spaceName[x][y] == null)
		{
			spaceName[x][y] = n;
			return true;
		}
		return false;
	}
	
	public void print()
	{
		for(int i = 0; i < 150; i++)
			for (int j = 0; j <150; j++)
			{
				if(spaceName[i][j] != null)
				{
					System.out.println("At location " + i + " " + j);
					System.out.println("There is a " + spaceName[i][j]);
				}
			}
	}

}
