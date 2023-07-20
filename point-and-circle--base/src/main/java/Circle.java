public class Circle {
    // write the code of circle class here
    /*Create a class Circle.
    It should have 2 data-members
    center:Point
    radius:int
    It should have 3 methods
    getArea: It should return area of circle as a double
    getParameter: It should return parameter of circle as a double
    isOverlapping: It should take another Circle as parameter and return true if the current circle overlaps with the circle passed as parameter and false otherwise.

*/
    Point center;
    int radius;

    double getArea(){
        return Math.PI * radius *radius;
    }

    double getParameter(){
        return 2 * Math.PI* radius;
    }

    boolean isOverlapping(Circle c2) {
       int distx= Math.abs(this.center.x - c2.center.x);
       int disty= Math.abs(this.center.y -c2.center.y);
       double dist= Math.sqrt(distx*distx +disty*disty) ;
       if(dist<this.radius+c2.radius)
             return true;
       else
           return false;

    }


        boolean isTowardsRight(Circle c2 ){
            int rx1 = this.center.x + radius;
            int rx2 = c2.center.x + c2.radius;
            if (rx1 > rx2) {
                return true;
            }
            return false;
        }

    }
