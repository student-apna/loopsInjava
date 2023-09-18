package loopsInjava;
import java.util.*;
public class chewbaccaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long n = sc.nextLong();

        long ans=0;
        long m=1;
        while(n>0){
            long r = n%10;
            if(r>=5 && n!=9){
                long k = 9-r;
                ans +=k*m;
            } else ans +=r*m;
            n/=10;
            m =m*10;
        }
        System.out.println(ans);


    }
}
