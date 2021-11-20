public class test1 {
    void show(int a){
        System.out.println("ANJALI ");
    }
    void show(int a, int b)
    {
        System.out.println("anjali");
    }

    public static void main(String[] args) {
        test1 tt  = new test1();
        tt.show(12);// output-->anjali
        tt.show(12,34);// output --->ANJALI
    }
}//method overloading with different number of arguments
