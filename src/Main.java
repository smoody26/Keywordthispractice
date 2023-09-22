// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    
    int a;
    int b;
    
    public void setData(int a, int b) {        // This is a method :D
        this.a = a;  // this. keyword cannot be called unless the method is dynamic.
        this.b = b;  //
    }
    
    public static void main(String[] args) {
        
        Main x = new Main();
        x.setData(4, 3);
        System.out.println(x.a);
        System.out.println(x.b);
        
    }
}