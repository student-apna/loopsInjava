package loopsInjava;
import java.util.*;
public class magicNumber {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();
        int n= num;
        int sum=0;
        while(n!=0 || sum>9){
            if(n==0){
                n=sum;
                sum=0;
            }
            sum+=n%10;
            n/=10;
        }
        if(sum==1) System.out.println(num+" is a Magic number");
        else System.out.println(num+ " is not a Magic number");
    }
}
