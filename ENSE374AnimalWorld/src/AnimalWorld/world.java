package AnimalWorld;
import java.util.Random;

import AnimalWorld.beings.animal;

public class world {
	private int day = 0;
	private static final int row = 150;
	private static final int col = 150;
	
	private being[][]  map_of_beings= new being[row][col];
	
	world()
	{
		for(int i = 0; i < row; i++)
			for (int j = 0; j <col; j++)
			{
				map_of_beings[i][j] = null;
			}
	}
	
	public void nextDay()
	{
		animal a;
		point p;
		int c;
		point up, down , left, right;
		Random dice = new Random();
		
		day++;
		
		for(int i = 0; i < 150; i++)
		{
			for (int j = 0; j < 150; j++)
			{
				if(map_of_beings[i][j] != null && map_of_beings[i][j] instanceof animal)// if the tile is an animal
				{
					a = (animal) map_of_beings[i][j];// type casting the being into animal if it is an animal all info is kept
					
					if(!a.getHasEaten())//if it has not eaten the day before
						a.reduceLifeSpan();
					else//if it has eaten the day before
						a.increaseLifeSpan();
					
					if(!a.isALive())//if it died
					{
						System.out.println("A " + a.getName() + " has died of starvation.");
						map_of_beings[i][j] = null;
					}
					else
					{
						for(int k = 0; k < a.getTravelDistance(); k++)//to make sure that it moves to it's fullest move distance
						{
							p = new point(i,j);
							up = new point(p);
							down = new point(p);
							left = new point(p);
							right = new point(p);

							if(p.y == 149)//top border checking
								up = new point(p);
							else
								up = new point(up.x , up.y + 1);
							
							if(p.y == 0)//bottom border checking
								down = new point(p);
							else	
								down = new point(down.x , up.y - 1);
							
							if(p.x == 149)//left border checking
								left = new point(p);
							else
								left = new point(up.x + 1, up.y);
							
							if(p.x == 0)//right border checking
								right = new point(p);
							else	
								right = new point(up.x - 1, up.y);
							
							
							c = dice.nextInt(4);//chooses a random direction to move in
							
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
							
							if(isfull(p))// if the position that is chosen is occupied
							{
								if(a.isPrey(map_of_beings[p.x][p.y].getName()))//if the object at that position is prey
								{
									System.out.println("A " + a.getName() + " has eaten a " + map_of_beings[p.x][p.y].getName() + ".");
									a.setHasEaten();
									k =  a.getTravelDistance();	//it fulfills it's movement requirements							
									map_of_beings[p.x][p.y] = a;//it now occupies that space
									map_of_beings[i][j] = null;
				
								}
								else
									map_of_beings[i][j] = a;//if it is not prey then it continues on 
							}
							else//if it is not full then it moves to the position
							{
								map_of_beings[p.x][p.y] = a;
								map_of_beings[i][j] = null;
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
		
		System.out.println("Day " + getDay());
		
		System.out.print('+');
		for(int i = 0; i < col; i ++)
			System.out.print('-');
		System.out.print('+');
		System.out.print('\n');
		
		for(int i = 0; i < row; i++)
		{
			System.out.print('|');
			for (int j = 0; j <col; j++)
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
		System.out.print('+');
		for(int i = 0; i < col; i ++)
			System.out.print('-');
		System.out.print('+');
		System.out.println();
		System.out.println();
		
	}
	
	public boolean isfull(point p){
		return (map_of_beings[p.x][p.y] != null);
	}
	
}
