package loopsInjava;
import java.util.*;
public class repllace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans =0;
        long mul =1;
        while(n>0){
            long r = n%10;
            if(r ==0 ){
                r=5;
            }
            ans = ans+mul*r;
            n/=10;
            mul = mul*10;

        }

        System.out.println((ans==0)?5:ans);

    }
}
