package lottoex01;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        // Moke
        HashSet<Integer> lotto = new HashSet<>();
        lotto.add(20);
        lotto.add(7);
        lotto.add(3);
        lotto.add(45);
        lotto.add(5);
        lotto.add(6);

        System.out.println(lotto);

        // Test
        List<Integer> sl = new LinkedList<Integer>(lotto);
        Collections.sort(sl);

        // 눈으로 확인
        System.out.println(sl);

        // 검증
        int failCheck = 0;

        /*
         * if (sl.get(0) < sl.get(1)) {
         * System.out.println("0번지 1번지 비교 - 성공");
         * } else {
         * failCheck++;
         * }
         * if (sl.get(1) < sl.get(2)) {
         * System.out.println("1번지 2번지 비교 - 성공");
         * } else {
         * failCheck++;
         * }
         * if (sl.get(2) < sl.get(3)) {
         * System.out.println("2번지 3번지 비교 - 성공");
         * } else {
         * failCheck++;
         * }
         * if (sl.get(3) < sl.get(4)) {
         * System.out.println("3번지 4번지 비교 - 성공");
         * } else {
         * failCheck++;
         * }
         * if (sl.get(4) < sl.get(5)) {
         * System.out.println("4번지 5번지 비교 - 성공");
         * } else {
         * failCheck++;
         * }
         */

        // System.out.println("실패횟수" + failCheck);

        for (int i = 0; i < 5; i++) {
            if (sl.get(i) < sl.get(i + 1)) {
                System.out.println(i + "번지" + (i + 1) + "번지 비교 - 성공");
            } else {
                failCheck++;
            }
        }
        if (failCheck == 0) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
    }

}
