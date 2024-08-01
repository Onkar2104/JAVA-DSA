import java.util.*;

public class DArray {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row Index: ");
        int row = sc.nextInt();
        System.out.print("Enter Column Index: ");
        int col = sc.nextInt();

        int data[][] = new int [row][col];

        // for(int i=0; i<row; i++){
        //     System.out.printf("Enter data in Array at %sth index: ", i);
        //     data[i] = sc.nextInt();
        // }

        // for(int i=0; i<col; i++){
        //     System.out.printf("Enter data in Array at %sth index: ", i);
        //     data[i] = sc.nextInt();
        // }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("Enter data in Array at %sth row & %sth column index: ", i, j);
                data[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.printf("Your entered data at %sth row & %sth column index: ", i, j);
                System.out.println(data[i][j]);
            }
        }

        System.out.print("Enter Row number to search: ");
        int find = sc.nextInt();
        System.out.print("Enter Column number to search: ");
        int findd = sc.nextInt();

        for(int i=0; i<=find; i++){
            for(int j=0; j<=i; j++){
                if(find == i & findd == j || find ==j & findd == i){
                    // System.out.printf("%s found at %sth row & %sth column: ", find, i,j);
                    System.out.printf("At %sth Row & %sth column %s value is stored..!", i, j, data[i][j]);
                }
                // if(data[i][j] == finddd){
                //     System.out.printf("%s found at %sth row & %sth column column", finddd, i, j);
                // }
            }
            // System.out.printf("%s found at %sth row & column: ", find, i);
        }

        System.out.print("\nEnter number to search: ");
        int finddd = sc.nextInt();

        for(int i=0; i<=finddd; i++){
            for(int j=0; j<=i; j++){
                if(data[i][j] == finddd){
                    System.out.printf("%s found at %sth row & %sth column..!", finddd, i, j);
                }
            }
            // System.out.printf("%s found at %sth row & column: ", find, i);
        }
    }
}