package loopsInjava;

import java.util.Scanner;

public class ShoppingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            int turn = 1;
            while (true) {
                if (turn % 2 != 0) {                                   // Aayush's turn
                    if (M >= turn) {
                        M -= turn;
                    } else {
                        System.out.println("Harshit");
                        break;
                    }
                } else {                                       // Harshit's turn
                    if (N >= turn) {
                        N -= turn;
                    } else {
                        System.out.println("Aayush");
                        break;
                    }
                }
                turn++;
            }


        }
    }
}
