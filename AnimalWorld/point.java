package AnimalWorld;

public class point {
	public int x;
	public int y;
	
	
	public point(point p)
	{
		x=p.x;
		y=p.y;
	}
	public point(int x1, int y1)
	{
		x = x1;
		y = y1;
	}
	public point()
	{
		x = -1;
		y = -1;
	}
}
