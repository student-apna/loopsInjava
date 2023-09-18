package loopsInjava;

public class series {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        int count =0;
        int n=1;
        while(count<a) {
            int term = 3 * n + 2;
            if (term % b != 0){
                System.out.println(term);
                count++;
            }
            n++;
        }


    }
}
