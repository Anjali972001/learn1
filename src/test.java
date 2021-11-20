public class test {
    void show()
    {
        System.out.println("My name is Anjali kumari.");
    }
    void show(int a)
    {
        System.out.println("MY NAME IS ANJALI KUMARI.");
    }

    public static void main(String[] args) {
        test t = new test();
        t.show();// output-- My name is Anjali Kumari.
        t.show(122);// output--> MY NAME IS ANJALI KUMARI.
    }
}// example of method overloading
