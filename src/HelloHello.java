import java.util.Scanner;

public class HelloHello {

    public static void main(String[] args) {
        System.out.println("Enter your name, please");
        String userName = new Scanner(System.in).nextLine();
        System.out.println("Hello " + userName + "!");
    }

}
