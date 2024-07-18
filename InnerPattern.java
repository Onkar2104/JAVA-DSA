// public class InnerPattern {
//     public static void main(String[] args) {
//         int i,j;

//         for(i=0; i<=3; i++){

//             for(j=0; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// public class InnerPattern {

//     public static void main(String[] args) {
        
//         for(int i=1; i<=6; i++){
//             for(int j=1; j<=i; j++){
//                 System.out.print(" ");
//             }
//             System.out.println("*");
//         }
//     }
// }

public class InnerPattern {

    public static void main(String[] args) {
        
        for(int i=1; i<=6; i--){
            for(int j=1; j>=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

