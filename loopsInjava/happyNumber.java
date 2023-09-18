package loopsInjava;
import java.util.*;
public class happyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n = sc.nextInt();
        int temp = n;
        while(temp>9){
            temp = sumSqDigit(temp);
        }
        if(temp==1) System.out.println("Happy Number");
        else System.out.println("Not a Happy Number");

    }
    static int sumSqDigit(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d*d;
            n/=10;
        }
        return sum;
    }
}
