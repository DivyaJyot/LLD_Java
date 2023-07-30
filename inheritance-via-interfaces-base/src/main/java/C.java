public class C implements I{
    @Override
    public void fun() {
        System.out.println("inside fun");
    }

    @Override
    public void fun2() {
        System.out.println("inside fun2");
    }

    @Override
    public void fun1() {
        System.out.println("inside fun3");
    }
    /*
    Create the set of classes and interfaces to meet the following requirements
An interface I1 with following methods
fun1():void
fun(): void
An interface I2 with following methods
fun2():void
fun():void
An interface I extending both I1 and I2 with no methods
A class C implementing interface I
     */
}
