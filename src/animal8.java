public class animal8 {
    void run()
    {
        System.out.println("Animal is running");
    }
}
class elephant extends animal8
{
    void eat()
    {
        System.out.println("elephant is eating");
    }
}
class monkey extends animal8{
    void play()
    {
        System.out.println("monkey is playing");
    }

    public static void main(String[] args) {
        animal8 aa = new animal8();
        aa.run();
        elephant ee = new elephant();
        ee.run();
        ee.eat();
        monkey mm = new monkey();
        mm.run();
        mm.play();
    }
// Example of hierarchical inheritance
}
