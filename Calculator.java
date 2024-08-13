import java.util.Scanner;

public class Calculator {
        public static void main(String[] args) {
        int a, b, c;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a=");
            a = sc.nextInt();

            System.out.print("Enter b=");
            b = sc.nextInt();
        }
        c = a + b;
        System.out.println("Addition is=" + c);

        c = a * b;
        System.out.println("Multiplication is=" + c);

        if (b != 0) {
            c = a / b;
            System.out.println("Division is=" + c);
        } else {
            System.out.println("Cannot divide by zero.");
        }

        c = a - b;
        System.out.println("Subtraction is=" + c);

    }
}
