import java.util.Scanner;

public class function_add {
    
    public static int addition(int a, int b){
        System.out.println("Addition is: " + (a + b));
        // int sum = a+b;
        return 1;
    }

    public static int multi(int a, int b){
        System.out.println("Multiplication is: " + (a * b));
        return 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter value of A: ");
            int a = sc.nextInt();

            // addition(a);
            
            System.out.print("Enter value of B: ");
            int b = sc.nextInt();

            addition(a,b);
            multi(a,b);
        }

    }
}
