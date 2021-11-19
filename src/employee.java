public class employee {
    String name;
    int age;
    employee(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println(name + " "+ age);
    }

    public static void main(String[] args) {
        employee e1 = new employee("Anjali",34);
        employee e2 = new employee("Akash",45);
        e1.display();
        e2.display();



    }
}
