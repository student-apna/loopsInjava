package loopsInjava;
import java.util.*;
public class equation {
    public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int r1=0;
                int r2=0;

                int d = b*b -4*a*c;
                if(d==0){
                    r1= -b/(2*a);
                    r2= -b/(2*a);
                    System.out.println("Real and Equal ");
                    System.out.println(r1+" "+r2);
                }
                else if(d>0){
                    r1 = (-b-(int)Math.sqrt(d))/2*a;
                    r2 = (-b+(int)Math.sqrt(d))/2*a;
                    System.out.println("Real and Distinct");
                    System.out.println(r1+" "+r2);
                }
                else{
                    System.out.println("Imaginary");
                }
        }
}





