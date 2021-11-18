public class animal {
    void eat()
    {
        System.out.println("I am eating");
    }

    public static void main(String[] args) {
        animal dog = new animal();
        dog.eat();
    }// output ---> I am eating
}/* the method eat() will not perform any task without an object.*/
