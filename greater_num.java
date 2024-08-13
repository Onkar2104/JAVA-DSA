import java.util.Scanner;

public class greater_num {
    
    public static int greaterNum(int a, int b){

        if(a > b){
            // System.out.println("A is greate than B");
            return a;
        } else{
            // System.out.println("B is greater than A");
            return b;
        }
        // return 1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter value of A: ");
            int a = sc.nextInt();

            System.out.print("Enter value of B: ");
            int b = sc.nextInt();

            System.out.println("Greater numbers is: " + greaterNum(a, b));
        }
    }
}
