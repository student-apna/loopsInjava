package loopsInjava;

import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {
            public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            for(int i=0;i<t;i++){
                int n = in.nextInt();
                int[] arr = new int[n];
                for(int j=0;j<n;j++){
                    arr[j] = in.nextInt();
                }
                int price = in.nextInt();
                Arrays.sort(arr);
                int s = 0;
                int e = arr.length-1;
                int ans1 =0;
                int ans2=0;
                while(s<e){
                    if(arr[s] + arr[e] == price){
                        ans1 = s;
                        ans2 =e;
                        s++;
                        e--;
                    }
                    else if(arr[s] + arr[e] > price)
                        e--;
                    else
                        s++;

                }
                System.out.println("Deepak should buy roses whose prices are "+ arr[ans1] +" and " + arr[ans2]+".");
            }


}
    }


