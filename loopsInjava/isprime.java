package loopsInjava;

public class isprime {
    public static void main(String[] args) {
        int n=2;
        if(isPrime(n)){
            System.out.println("Prime");
        }
        else System.out.println("Not Prime");

    }
    static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
