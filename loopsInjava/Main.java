package loopsInjava;
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
      while(t!=0){
       int nor = sc.nextInt();
       int [] arr = new int[nor];
       for(int i=0; i<arr.length; i++) {
           arr[i] = sc.nextInt();
        }
       int m = sc.nextInt();
       for(int i=0;i<arr.length-1; i++){
           if(m==arr[i]+arr[i+1]){
               System.out.println(arr[i]+" "+ arr[i+1]);
           }
       }
          t--;
          System.out.println();
       }
    }
}
