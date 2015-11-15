package AnimalWorld;
import java.util.Scanner;

import AnimalWorld.beings.*;
import AnimalWorld.beings.animals.hasWings.*;
import AnimalWorld.beings.animals.noWings.*;
import AnimalWorld.beings.animals.insects.*;



public class main {
	public static void main(String[] args){
		world w = new world();
		point p = new point();
		Scanner in = new Scanner(System.in);
		int num;
		int numOfDays;
		
		System.out.println("Welcome to Animal World");
		
		System.out.println("How many trees do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			tree t = new tree();
			p.x = (int)(Math.random()*149);
			p.y = (int)(Math.random()*149);
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How much grass do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			grass t = new grass();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How many catepillars do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			catepillar t = new catepillar();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How many grasshoppers do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			grasshopper t = new grasshopper();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How many bluejays do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			bluejay t = new bluejay();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How many mice do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			mouse t = new mouse();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How many rabbits do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			rabbit t = new rabbit();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How many deer do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			deer t = new deer();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How many squirrels do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			squirrel t = new squirrel();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How many wolves do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			wolf t = new wolf();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How many fox do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			fox t = new fox();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		System.out.println("How many hawks do you want added to the system");
		num= in.nextInt();
		while(num > 0)
		{
			hawk t = new hawk();
			while(!(w.occupy(t, p))){
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			num--;
		}
		
		w.print();
		
		System.out.println("How many days do you want the system to run for?");
		numOfDays= in.nextInt();
		
		in.close();
		
		while(numOfDays > 0)
		{
			w.nextDay();
			w.print();
			numOfDays--;
		}
		
	}
	
}

