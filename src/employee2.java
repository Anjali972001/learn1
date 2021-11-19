public class employee2 {

    String name;
    int age;
    employee2(String name,int age)
    {
       this.name = name;
       this.age =age;
    }
    void display()
    {
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) {
        employee2 e2 = new employee2("Anjali",23);
        employee2 e3 = new employee2 ("Aman",45);
        e2.display();
        e3.display();

    }
}
