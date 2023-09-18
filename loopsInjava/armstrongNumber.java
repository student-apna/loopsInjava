package loopsInjava;
import java.util.*;
public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isArmstrong(n));



    }
    static boolean isArmstrong(int n){
        int count =(int) Math.log10(n)+1;
        int temp =n;
        int num=0;
        while(n>0){
            num+=Math.pow(n%10,count);
            n/=10;
        }
      return temp==num;

    }

}
