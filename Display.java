package point2D;

public class Display {

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
