import java.util.Scanner;

public class factorial {
    static int fact(int n){
        if(n<=0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
            int result = fact(n);
            System.out.println(result);
            in.close();
    }
    
}
