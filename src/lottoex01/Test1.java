package lottoex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * 단위 테스트
 * 1. ArrayList에 숫자 6개 담기
 * 2. Scanner로 금액 입력받아서 횟수정하기 ex) 5000->5회
 * 3. HashSet으로 랜덤함 로또 번호 6개 받기
 * 4. GashSet은 순서를 보장하지 않고 데이터를 가지기 때문에 순차 정렬이 필요!!(구글링)
 * 5. 로또 세트(HashSet) 5개를 ArrayList에 담기
 * 6. ArrayList로또 2개 만들어서 비교해보기
 */

public class Test1 {

    public static void main(String[] args) {
        // 1. ArrayList에 숫자 6개 담기(Mock데이터)
        ArrayList<Integer> buyLotto = new ArrayList<>();

        // 모크 데이터
        buyLotto.add(1);
        buyLotto.add(5);
        buyLotto.add(10);
        buyLotto.add(20);
        buyLotto.add(25);
        buyLotto.add(35);

        // 눈으로 테스트

        // 검증

        /*
         * if (buyLotto.size() == 6) {
         * System.out.println("테스트 종료");
         * } else {
         * System.out.println("테스트 실패");
         * }
         */
        // 2. Scanner로 금액 입력받아서 횟수정하기 ex) 5000->5회
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int count = (int) money / 1000;
        // 눈으로 체크
        System.out.println("받음금액 : " + money);
        System.out.println("로또 횟수 : " + count);

        // 검증
        if (count == 5) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }
        // 3. HashSet으로 랜덤함 로또 번호 6개 받기
        HashSet<Integer> lotto = new HashSet<>();
        Random r = new Random();
        // 반복해서 lotto에 담기(6개)
        // HashSet 자료구조는 중복되는 데이터가 들어가면 허용하지 않음.
        while (true) {
            int n = r.nextInt(45) + 1;
            lotto.add(n);

            // 한줄 코드는 중괄호 생략 가능 if에서만!
            if (lotto.size() == 6)
                break;
        }

        System.out.println(lotto);

        /*
         * if (lotto.size() == 6) {
         * System.err.println("성공");
         * } else {
         * System.out.println("실패");
         * }
         */
        // 4. GashSet은 순서를 보장하지 않고 데이터를 가지기 때문에 순차 정렬이 필요!!(구글링)

    }

}
