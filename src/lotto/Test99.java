package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test99 {
    public static void main(String[] args) {
        Random r = new Random();
        // 당첨번호
        ArrayList<Integer> lottos = new ArrayList<>();
        lottos.add(13);
        lottos.add(17);
        lottos.add(18);
        lottos.add(20);
        lottos.add(42);
        lottos.add(45);
        // ArrayList<List<Integer>> getLottos = new ArrayList<>();
        // 스캐너 금액 입력
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int getmoney = money / 1000;
        System.out.println("받은 금액: " + money);
        System.out.println("로또 줄 :" + getmoney);
        //
        // 번호받기
        for (int i = 0; i < 5; i++) {
            HashSet<Integer> numLottos = new HashSet<>();
            while (true) {
                int n = r.nextInt(45) + 1;
                numLottos.add(n);
                if (numLottos.size() == 6) {
                    break;
                }
            }

            List<Integer> lottoList = new LinkedList<Integer>(lottos);
            Collections.sort(lottoList);

            // lottos.add(lottoList);

            // System.out.println(lottos);
        }
        // 번호 리스트
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        boolean numCheck = false;
        for (int i = 0; i < 6; i++) {
            if (list1.get(i) != list2.get(i)) {
                numCheck = true;
                System.out.println("다음기회에");
                break;
            }
            if (numCheck == false) {
                System.out.println("1등 당첨");
            }
        }

    }
}
