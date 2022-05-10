package week07;

class Point {
	int x, y;
	public void set(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public void print()
	{
		System.out.println("p("+x+","+y+")");
	}
	
}
public class PointTest {	
	public static void main(String[] args){
		Point p = new Point();
		p.set(100, 200);
		p.print();
	}
}
