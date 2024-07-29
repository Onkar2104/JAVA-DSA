import java.util.Scanner;

public class factorial {
    
    public static void fact(int a){

        if(a<0){
            System.out.println("Invalid Number..! Number must be positive.");
            return;
        }
        
        int factorial = 1;

        for(int i=a; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of given no is: " + factorial);

        return;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        fact(a);
    }
}
