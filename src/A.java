public class A {
    void show()
    {
        System.out.println("A class of method.");
    }
}
class B extends A
{
    void show1()
    {
        System.out.println("Class B method.");
    }

    public static void main(String[] args)
    {
        A a = new A();
        a.show();
        B b = new B();
        b.show1();
        b.show();
    }
}
