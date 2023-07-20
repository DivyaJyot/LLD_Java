public class Rectangle {
	// write the code of Rectangle class here
	/*
	 * Create a class Rectangle
	 * 
	 * i. It should have 2 data-members
	 * 
	 * - 1. topLeft (Point) - 2. bottomRight (Point)
	 * 
	 * ii. Add a constructor with 4 parameters of type int: topLeftX, topLeftY,
	 * bottomRightX, bottomRightY iii. Add a constructor with 2 parameters of type
	 * Point: topLeft, bottomRight iv. Add a constructor with 1 parameter of type
	 * Rectangle v. Make sure that Rectangle constructors make deep copies
	 */

	Point topLeft;
	Point bottomRight;

	public Rectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY) {
		this.topLeft= new Point(topLeftX,topLeftY);
		this.bottomRight=new Point( bottomRightX,bottomRightY);

	}

	public Rectangle(Point p1, Point p2) {
		this.topLeft= new Point(p1.x,p1.y);
		this.bottomRight=new Point( p2.x,p2.y);
	}

	public Rectangle(Rectangle r) {
		this.topLeft= new Point(r.topLeft.x,r.topLeft.y);
		this.bottomRight=new Point( r.bottomRight.x,r.bottomRight.y);
	}
}
