package loopsInjava;

import java.util.Scanner;

public class oddEvendigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddSum = 0,evenSum =0;
        while(n!=0){
            int d1 = n%10;
            oddSum+=d1;
            n/=10;
            int d2 = n%10;
            evenSum+=d2;

            n/=10;
        }
        System.out.println(oddSum);
        System.out.println(evenSum);
    }
}
