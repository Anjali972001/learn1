public class test5 {
   void show(Object a)
   {
       System.out.println("Object method");
   }
   void show(String a)
   {
       System.out.println("String Method.");
   }

    public static void main(String[] args) {
        test5 tt5 = new test5();
        tt5.show("Anjali");// output ---> String Method
    }
    // More preference  is given to the child type argument than as compared o the parent type argument.
}
