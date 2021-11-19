public class animal6 {
    void eat()
    {
        System.out.println("Animal is eating");
    }
}
class dog extends animal6
{
    void run()
    {
        System.out.println("Dog is running");
    }

    public static void main(String[] args) {
        dog d = new dog();
        d.eat();
        d.run();
    }
}// Animal is eating    Dog is running   -----> Example of inheritance
