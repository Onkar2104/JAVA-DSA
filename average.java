import java.util.Scanner;

public class average {
    public static int averageOfThreeNumber(int a, int b, int c){

        int average = (a + b + c)/3;
        System.out.println("The Average is: " + average);

        return 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter value of A: ");
            int a = sc.nextInt();

            System.out.print("Enter value of B: ");
            int b = sc.nextInt();

            System.out.print("Enter value of c: ");
            int c = sc.nextInt();
            
            averageOfThreeNumber(a, b, c);
        }
    }
}
