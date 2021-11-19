public class animal7 {
    void run(){
        System.out.println("Animal is run");
    }
}
class Dog extends animal7{
    void eat()
    {
        System.out.println("Dog is eating");
    }
}
class Cat extends Dog{
    void play()
    {
        System.out.println("Cat am playing");
    }

    public static void main(String[] args) {
        animal7 aa = new animal7();
        Dog dd = new Dog();
        Cat cc = new Cat();
        aa.run();
        dd.run();
        dd.eat();
        cc.play();
        cc.eat();
        cc.run();
    }
}// Multilevel Inheritance Example
