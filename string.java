import java.util.*;

public class string {
    public static void main(String[] args) {

        //Strings are Immutable
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter First Name: ");
            String firstName = sc.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = sc.nextLine();

            String fullName = firstName + " " + lastName;       //concatenation
            System.out.println("Your Name is " + fullName);
            
            System.out.println(fullName.length());

            // //charAt
            // for(int i=0; i<=fullName.length(); i++){
            //     System.out.println(fullName.charAt(i));
            // }

            //compare
            if(firstName.compareTo(lastName) == 0){
                System.out.println("Strings are equal..");
            } else{
                System.out.println("Strings are not equal..");
            }
        }
    }
}
