package loopsInjava;
import java.util.*;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int pow=1;
        int ans=0;
        while(n!=0){
            int rs = n%6;
             ans+=(pow*rs);
             pow*=10;
             n/=6;
        }
        System.out.println(ans);


    }
}
