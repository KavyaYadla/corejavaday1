package mypro;

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
			System.out.println("x : "+x+" "+"y: "+y);
		}
	

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Point2D p=new Point2D(10,20);
				p.getDetails();
				boolean b=p.isEqual();
				System.out.println(b);
				p.creatNewPoint(5,-2);
				p.getDetails();

			}

		}



