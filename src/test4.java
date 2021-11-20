public class test4 {
    void show(Object a)
    {
        System.out.println("Object Method.");
    }
    void show (String a)
    {
        System.out.println("String Method.");
    }

    public static void main(String[] args) {
        test4 tt4 = new test4();
        tt4.show('a');
    }
}// output --> Object Method (object is the parent class of all the method.)
