
import java.util.Scanner;
        
public class HelloKid {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Inputlah Nama Mu Yang ke 2");
        
        String name = input.nextLine();
        System.out.println("Hello " + name);
        
    }
}
