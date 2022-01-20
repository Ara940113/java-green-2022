package lotto;

import java.util.ArrayList;
import java.util.List;

public class Test06 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        boolean numCheck = false;
        for (int i = 0; i < 6; i++) {
            if (list1.get(i) != list2.get(i)) {
                numCheck = true;
                System.out.println("당첨되지 않으셨습니다");
                break;
            }
            if (numCheck == false) {
                System.out.println("1등 당첨");
            }
        }

    }

}
