import java.util.*;

public class array2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of Array: ");
        int size = sc.nextInt();

        int data[] = new int [size];

        for(int i=0; i<size; i++){
            System.out.printf("Enter data in Array at %sth index: ", i);
            data[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.printf("Your entered data at %sth index: ", i);
            System.out.println(data[i]);
        }

        System.out.print("Enter data to search: ");
        int num = sc.nextInt();

        for(int i=0; i<=num; i++){
            if(i == num){
                System.out.printf("%s is at %sth index", data[i], i);       //linear search
            }if(data[i] == num){
                System.out.printf("%s found at %sth index: ", num, i);      //linear search
            }
        }
    }
}