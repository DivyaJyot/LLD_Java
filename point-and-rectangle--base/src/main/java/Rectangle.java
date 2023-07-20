public class Rectangle {
    // write the code of rectangle class here
	Point topLeft;
	int height;
	int width;
	
	int getArea(){
		return height*width;
	}
	int getParameter(){
		return 2*(height+width);
	}
	
	Point getBottomRight(){
		Point p= new Point();
		p.x=topLeft.x+width;
		p.y=topLeft.y-height;
		return p;
		
	}
	
	
}
