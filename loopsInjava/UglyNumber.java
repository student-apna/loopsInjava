package loopsInjava;

public class UglyNumber {
    public static void main(String[] args) {
        int n=35;
        factors(n);
    }
    static void factors(int n){
        for(int i=2; i<n; i++){
            if(n%i==0) System.out.print(i+" ");
        }
    }
}
