import java.util.Scanner;

public class fibonacci {
    static int fib (int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return 0;
        }
        else{
            return fib(n-1) + fib(n-2);
        }

        
    }
    public static void main(String[] args) {
        int n ;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int result = fib(n);
        System.out.println(result);
    }
    
}
