public class test2 {
    void show (int a,String b)
    {
        System.out.println("My name is Anjali");
    }
    void show(String a,int b)
    {
        System.out.println("Anjali is computer science student");
    }

    public static void main(String[] args) {
        test2 tt2 = new test2();
        tt2.show("Anjali",12);// Output - Anjali is computer science student.
    }
}//example of method overloading (with different sequence of argument)