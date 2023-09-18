package loopsInjava;
import java.util.*;
public class charct {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch>=65 && ch<=90) System.out.println("upper");
        else if(ch>=97 && ch<=122) System.out.println("lower");
        else System.out.println("invalid");
    }
}
