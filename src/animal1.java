public class animal1 {
    void eat()
    {
        System.out.println("I am eating.");
    }

    public static void main(String[] args) {
        animal1 a1 = new animal1();
        a1.eat();
        a1.run();
    }
    void run(){
        System.out.println("I am running.");
    }
}//I am running
//I am eating
