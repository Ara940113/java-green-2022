package lotto;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println("받은 금액: " + money);
        System.out.println("로또 줄 :" + money / 1000);

    }

}
