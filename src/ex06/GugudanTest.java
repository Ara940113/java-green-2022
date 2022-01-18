package ex06;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 0;
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        int step;
        for (step = 2; n1 <= n2; n1++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(n1 + "*" + i + "=" + (n1 * i));
            }
        }
    }
}
