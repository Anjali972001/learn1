public class test3 {
    void show(int a)
    {
        System.out.println("Integer method");
    }
   void show(String a)
   {
       System.out.println("String method");
   }

    public static void main(String[] args) {
        test3 tt3 = new test3();
        tt3.show('a');
    }// output ----> Integer Method
}
/* Automatic promotion  */