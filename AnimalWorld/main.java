package AnimalWorld;
import java.util.Scanner;
public class main {
	public static void main(String[] args){
		world w = new world();
		point p = new point();
		Scanner in = new Scanner(System.in);
		int numOfTrees;
		int numOfGrass;
		int numOfCatepillars;
		int numOfBulejays;
		int numOfMice;
		int numOfRabbits;
		int numOfDeer;
		int numOfSquirrels;
		int numOfWolves;
		int numOfFox;
		int numOfHawks;
		
		System.out.println("Welcome to Animal World");
		System.out.println("How many trees do you want added to the system");
		numOfTrees= in.nextInt();
		
		System.out.println("How much grass do you want added to the system");
		numOfGrass= in.nextInt();
		
		System.out.println("How many catepillars do you want added to the system");
		numOfCatepillars= in.nextInt();
		
		System.out.println("How many bluejays do you want added to the system");
		numOfBulejays= in.nextInt();
		
		System.out.println("How many mice do you want added to the system");
		numOfMice= in.nextInt();
		
		System.out.println("How many rabbits do you want added to the system");
		numOfRabbits= in.nextInt();
		
		System.out.println("How many deer do you want added to the system");
		numOfDeer= in.nextInt();
		
		System.out.println("How many squirrels do you want added to the system");
		numOfSquirrels= in.nextInt();
		
		System.out.println("How many wolves do you want added to the system");
		numOfWolves= in.nextInt();
		
		System.out.println("How many fox do you want added to the system");
		numOfFox= in.nextInt();
		
		System.out.println("How many hawks do you want added to the system");
		numOfHawks= in.nextInt();
		//-----------------------------------------------------------------------------------------------------
		while(numOfTrees > 0)
		{
			tree t = new tree();
			p.x = (int)(Math.random()*149);
			p.y = (int)(Math.random()*149);
			while(!(w.occupy(t, p.x, (int)p.x))){
				t.setPosition(p);
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			numOfTrees--;
		}
		while(numOfGrass > 0)
		{
			grass t = new grass();
			while(!(w.occupy(t, p.x, (int)p.x))){
				t.setPosition(p);
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			numOfGrass--;
		}
		while(numOfCatepillars > 0)
		{
			catepillar t = new catepillar();
			while(!(w.occupy(t, p.x, (int)p.x))){
				t.setPosition(p);
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			numOfCatepillars--;
		}
		while(numOfBulejays > 0)
		{
			bluejay t = new bluejay();
			while(!(w.occupy(t, p.x, (int)p.x))){
				t.setPosition(p);
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			numOfBulejays--;
		}
		while(numOfMice > 0)
		{
			mouse t = new mouse();
			while(!(w.occupy(t, p.x, (int)p.x))){
				t.setPosition(p);
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			numOfMice--;
		}
		while(numOfRabbits > 0)
		{
			rabbit t = new rabbit();
			while(!(w.occupy(t, p.x, (int)p.x))){
				t.setPosition(p);
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			numOfRabbits--;
		}
		while(numOfSquirrels > 0)
		{
			squirrel t = new squirrel();
			while(!(w.occupy(t, p.x, (int)p.x))){
				t.setPosition(p);
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			numOfSquirrels--;
		}
		while(numOfWolves > 0)
		{
			wolf t = new wolf();
			while(!(w.occupy(t, p.x, (int)p.x))){
				t.setPosition(p);
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			numOfWolves--;
		}
		while(numOfFox > 0)
		{
			fox t = new fox();
			while(!(w.occupy(t, p.x, (int)p.x))){
				t.setPosition(p);
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			numOfFox--;
		}
		while(numOfHawks > 0)
		{
			hawk t = new hawk();
			while(!(w.occupy(t, p.x, (int)p.x))){
				t.setPosition(p);
				p.x = (int)(Math.random()*149);
				p.y = (int)(Math.random()*149);
			}
			numOfHawks--;
		}
		
		w.print();
	}

}

