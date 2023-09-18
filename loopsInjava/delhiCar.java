package loopsInjava;

import java.util.Scanner;

public class delhiCar {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        while(N!=0){
            int n = sc.nextInt();
            int oddSum = 0,evenSum = 0;
            while(n>0){
                int d = n%10;
                if(d%2==0) evenSum+=d;
                else oddSum+=d;
                n/=10;
            }
            if(evenSum%4==0 || oddSum%3 ==0) System.out.println("Yes");
            else System.out.println("No");
            N--;

        }
        sc.close();

    }
}
