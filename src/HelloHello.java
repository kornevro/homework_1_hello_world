import java.util.Scanner;

public class HelloHello {

    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
        System.out.println("Enter your name, please");

        String userName = inputText.nextLine();
        System.out.println("Hello " + userName + "!");
    }

}
