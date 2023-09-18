package loopsInjava;

public class BostonNumber {
    public static void main(String[] args) {
        // 27 58 94 378 85
        int n =378;
        int numSum = digitSum(n);
        int factSum = factorSum(n);
       if(numSum==factSum) System.out.println(1);
       else System.out.println(0);
    }

     static int factorSum(int n) {
        int sum =0;

        for(int i=2;i<=n; i++ ){
            while(n%i==0){
                n=n/i;
                sum +=digitSum(i);
            }


        }
        return sum;
    }

     static int digitSum(int n) {
        int sum =0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
