import java.util.*;

public class sum {
    public static void main(String[] args) {
        
        int sum = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter n:");
            int n = sc.nextInt();
            
            for(int i=1; i<=n; i++){
                sum = sum + i;
            }
            
            // System.out.printf("Sum of First" + n  "numbers is:" + sum);
            System.out.printf("Sum of First %d numbers is: %d", n, sum);
        }
    }
}
