import java.util.*;

public class if_else {
    public static void main(String[] args) {
        System.out.print("Enter your age:");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");
        } else{
            System.out.println("Teen");
        }

        if(age%2 == 0){
            System.out.println("Age id Evan..!");
        } else{
            System.out.println("Age is Odd..!");
        }

        System.out.print("Enter value of A:");
        int a=sc.nextInt();

        System.out.print("Enter value of B:");
        int b=sc.nextInt();

        if (a==b) {
            System.out.println("The value of A & B is Equal.");
        } else if (a>b) {
            System.out.println("The value of A is Greater.");
        } else{
            System.out.println("The value of A is Lesser");
        }

        System.out.print("Press one button:");
        int button = sc.nextInt();

        if (button == 1) {
            System.out.println("Hello");
        } else if (button == 2) {
            System.out.println("Namaste");
        } else if(button == 3){
            System.out.println("Bonjore");
        } else{
            System.out.println("Invalid Button");
        }

    }
}
