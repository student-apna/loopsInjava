package loopsInjava;
import java.util.*;
public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(btod(n));

    }
    static int btod(int n){
        int i=0;
        int ans =0;
        while(n>0){
            ans+= n%10*(int)Math.pow(2,i++);
            n/=10;
        }
       return ans;
    }
}
