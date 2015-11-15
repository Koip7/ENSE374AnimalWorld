package AnimalWorld;
import java.util.Random;

public class world {
	private int day = 0;
	private being[][]  map_of_beings= new being[150][150];
	
	world()
	{
		for(int i = 0; i < 150; i++)
			for (int j = 0; j <150; j++)
			{
				map_of_beings[i][j] = null;
			}
	}
	
	public void nextDay()
	{
		animal a;
		point p, tempp;
		int c;
		point up, down , left, right;
		Random dice = new Random();
		
		day++;
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		
		for(int i = 0; i < 150; i++)
		{
			for (int j = 0; j < 150; j++)
			{
				if(map_of_beings[i][j] != null && map_of_beings[i][j] instanceof animal)
				{
					a = (animal) map_of_beings[i][j];
					
					if(!a.hasEaten)
						a.reduceLifeSpan();
					else
						a.increaseLifeSpan();
					
					if(!a.isALive())
					{
						map_of_beings[i][j] = null;
					}
					else
					{
						for(int k = 0; k < a.getTravelDistance(); k++)
						{
							p = new point(i,j);
							tempp = p;
							up = new point(p);
							down = new point(p);
							left = new point(p);
							right = new point(p);

							if(p.y == 149)
								up = new point(p);
							else
								up = new point(up.x , up.y + 1);
							if(p.y == 0)
								down = new point(p);
							else	
								down = new point(down.x , up.y - 1);
							if(p.x == 149)
								left = new point(p);
							else
								left = new point(up.x + 1, up.y);
							if(p.x == 0)
								right = new point(p);
							else	
								right = new point(up.x - 1, up.y);
							
							
							c = dice.nextInt(4);
							
							switch(c)
							{
							case 0:
								p = new point(up);
								break;
							case 1:
								p = new point(down);
								break;
							case 2:
								p = new point(left);
								break;
							case 3:
								p = new point(right);
								break;
							}
							
							if(isfull(p))
							{
								if(a.isPrey(map_of_beings[p.x][p.y].getName()))
								{
									a.hasEaten = true;
									k =  a.getTravelDistance();								
									map_of_beings[p.x][p.y] = a;
									map_of_beings[i][j] = null;
									a.setPosition(p);
								}
								else
									map_of_beings[i][j] = a;
							}
							else
							{
								map_of_beings[p.x][p.y] = a;
								map_of_beings[i][j] = null;
								a.setPosition(p);
							}
						}
					}
				}
			}
		}
		
	}
	
		
	
	
	public int getDay(){
		return day;
	}
	public boolean occupy(being b, point p){
		
		if(map_of_beings[p.x][p.y] == null)
		{
			map_of_beings[p.x][p.y] = b;
			return true;
		}
		return false;
	}
	
	public void print()
	{
		char c;
		String name; 
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Day " + getDay());
		for(int i = 0; i < 150; i++)
		{
			for (int j = 0; j <150; j++)
			{
				if(map_of_beings[i][j] != null)
				name = map_of_beings[i][j].getName();
				else
					name = " ";
				
				switch(name)
				{
				case"catepillar":
					c = 'c';
					break;
				case"bluejay":
					c = 'b';
					break;
				case"grasshopper":
					c = 'g';
					break;
				case"mouse":
					c='m';
					break;
				case"tree":
					c='t';
					break;
				case"grass":
					c='g';
					break;
				case"deer":
					c='d';
					break;
				case"rabbit":
					c='r';
					break;
				case"squirrel":
					c='s';
					break;
				case"hawk":
					c='h';
					break;
				case"fox":
					c='f';
					break;
				case"wolf":
					c='w';
					break;
				default:
					c=' ';
					break;
				}
				System.out.print(c);
			
			}
			System.out.print('|');
			System.out.print('\n');
		}
		
	}
	
	public boolean isfull(point p){
		return (map_of_beings[p.x][p.y] != null);
	}
	
}
