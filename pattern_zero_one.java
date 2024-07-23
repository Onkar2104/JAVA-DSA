public class pattern_zero_one{
    public static void main(String[] args) {
        
        int n=5;
        int number;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                number=j+i;
                if(number%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
