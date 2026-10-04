
import java.util.Scanner;
public class sumofNbyPara{
    static int f(int i, int sum){
        if(i<1){
            System.out.println(sum);
            return 1;
        }
        else{
            return f(i-1, sum+i);
        }
    }
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        f(n, 0);
         
    }
    
}
