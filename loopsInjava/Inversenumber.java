package loopsInjava;
import java.util.*;
public class Inversenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int op=1;
        int inverse = 0;
        while(n>0){
            int od = n%10;
            int id = op;
            int ip = od;
            // make change to inverse using ip and id
            inverse+=id*(int)Math.pow(10,ip-1);
            n/=10;
            op++;
        }
        System.out.println(inverse);
    }
}
