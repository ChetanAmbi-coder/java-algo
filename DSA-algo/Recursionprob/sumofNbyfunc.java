import java.util.Scanner;
class sumofbyfunc{
      static int f(int n){
        if(n==0){
            
            return 0;
        }
        else{
             
            return (n + f(n-1));
           
        }
        
    }
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
           int result =  f(n);
           System.out.println(result);
         
    }

}