package class4;
import java.util.Scanner;
public class ScannerWithUser {
    public static void main(String[] args) {
        /*
         * Just using scanner to confuse Asma
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your name");
// takes a String type input from the keyboard and stores it in name variable
        String name=scanner.nextLine();
        System.out.println("Please Enter your age");
// takes an int from the keyboard and stores it in age variable
        int age=scanner.nextInt();
        System.out.println("Hi "+name+" you are "+age+" years old");
    }
}