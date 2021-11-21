import java.io.FileInputStream;

public class test9 {
    public static void main(String[] args) {
        FileInputStream aa = new FileInputStream("C:/ccc.txt");
    }
}//compile time exception (checked Exception)
//Java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown