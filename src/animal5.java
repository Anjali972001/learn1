public class animal5 {
    String colour;
    int age ;
    void play(String c,int a)
    {
       colour = c;
       age = a;

    }
    void display()
    {
        System.out.println(age);
        System.out.println(colour);
    }

    public static void main(String[] args) {
        animal5 cat = new animal5();
        animal5 dog = new animal5();
        cat.play("black",12);
        dog.play("white",1);
        cat.display();
        dog.display();

    }
}
