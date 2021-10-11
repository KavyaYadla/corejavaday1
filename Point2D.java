package point2D;

public class Point2D {
	private int x,y;
	public Point2D(int a,int b) {
		x=a;
		y=b;
	}
	public void getDetails() {
	
		System.out.println(" The Value of x_cord:"+x+"  "+"The Value of y_cord:"+y);
	}
	
	public boolean isEqual() {
		if(x==y)
			return true;
		else
			return false;
	}
		public void creatNewPoint(int xOff,int yOff) {
			x=x+xOff;
			y=y+yOff;
			System.out.println("x: "+x+" "+"y: "+y);
		}
}
