public class Test {

    public static void main(String[] args) {
        Circle c1 =new Circle();
        c1.center= new Point();
        c1.radius=5;
        Circle c2 =new Circle();
        c2.center=new Point();
        c2.radius=4;
        System.out.println(c1.isOverlapping(c2));


    }
}
