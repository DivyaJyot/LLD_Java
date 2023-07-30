public class Client {
   /* Write code to achieve the following
    A class Client with main method that prints: I am the main class
    Client class should create a new thread and invoke code in a class called Adder.
    The Adder class should print: I am the Adder class
    Client class should create a new thread and invoke code in a class called Subtractor.
    The Subtractor class should print: I am the Subtractor class

    Important Note - Use the ScalerThread class to create new threads. This is necessary for testing your code.*/

    public static void main(String[] args) {
        System.out.println("I am the main class");
        ScalerThread t1= new ScalerThread(new Adder());
        ScalerThread t2= new ScalerThread(new Subtractor());
        t1.start();;
        t2.start();
        System.out.println("I am the main class ended" );
    }

}
