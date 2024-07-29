import java.util.Scanner;

public class sum_of_odd {
    
    public static int oddNumSum(int a){

        int sum=0;

        for(int i=1; i<=a; i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println("Addition of odd numbers is: " + sum);

        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of odd number: ");
        int a = sc.nextInt();

        oddNumSum(a);
    }
}
