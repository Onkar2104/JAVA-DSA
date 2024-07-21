public class pattern_half_pyramid_with_number {
    public static void main(String[] args) {
        
        int number;

        for(int i=0; i<=5; i++){
            number=1;
            for(int j=0; j<=i; j++){
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
