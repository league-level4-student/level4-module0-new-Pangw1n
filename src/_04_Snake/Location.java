package _04_Snake;

public class Location {
	private int x, y;
	
	public Location(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}

	public boolean positionsMatch(Location matchLocation)
	{
		if (matchLocation.getX() == this.x && matchLocation.getY() == this.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
