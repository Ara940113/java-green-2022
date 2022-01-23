package lottoex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {
        // 6. ArrayList로또 2개 만들어서 비교해보기
        // Mock
        List<Integer> lotto1 = Arrays.asList(1, 3, 5, 7, 9, 10);
        ArrayList<Integer> lotto2 = new ArrayList<>();
        lotto2.add(1);
        lotto2.add(3);
        lotto2.add(5);
        lotto2.add(7);
        lotto2.add(9);
        lotto2.add(10);

        // 두개 비교하는 코드
        int failCheck = 0;
        final int LOTTOCTCLE = lotto1.size(); // final이 붙은 변수는 대문자로 정의한다.

        for (int i = 0; i < LOTTOCTCLE; i++) {
            if (lotto1.get(i) == lotto2.get(i)) {
                System.out.println("일치");
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
