// public class recursion {
//     public static void printNumb(int n){
//         if(n==6){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }

//     public static void main(String[] args) {
//         int n=1;
//         printNumb(n);
//     }
// }

// public class recursion {
//     public static void printSum(int i, int n,int sum){
//         if(i==n){
//             sum+=1;
//             System.out.println(sum);
//             return;
//         }
//         sum+=i;
//         printSum(i+1, n, sum);
//         System.out.println(i);
//     }

//     public static void main(String[] args) {
//         printSum(1, 5, 0);
//     }
// }


//factorial
//    public class recursion {
//     public static int calfactorial(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         int fact_nm1=calfactorial(n-1);
//         int fact_n=n * fact_nm1;
//         return fact_n;
//     }
   
//     public static void main(String[] args) {
//         int n =5;
//         int ans=calfactorial(n);
//         System.out.println(ans);
//     }
//    }    


   //fibonacci series
// public class recursion {
//     public static void printFib(int a,int b, int n){
//         if(n==0){
//             return;
//         }
//         int c=a+b;
//         System.out.println(c);
//         printFib(b, c, n-1);
//     }

//     public static void main(String[] args) {
//         int a=0,b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         printFib(a, b, n-2);
//     }
// }


//x^n
public class recursion {
    public static int calPoower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPowernm1=calPoower(x, n-1);
        int xPowern=x*xPowernm1;
        return xPowern;
    }
    public static void main(String[] args) {
        int x=2,n=5;
        int ans = calPoower(x, n);
        System.out.println(ans);
    }
}


17aug
18 aug
