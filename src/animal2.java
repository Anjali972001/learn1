public class animal2 {
    void eat()
    {
        System.out.println("I am eating.");
    }

    public static void main(String[] args) {
        animal2 a2 = new animal2();
        a2.eat();
        a2.run();

        animal2 a = new animal2();
        a.eat();
        a.run();

    }
    void run()
    {
        System.out.println("I am running");
    }
}
