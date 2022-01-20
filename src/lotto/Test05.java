package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test05 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<List<Integer>> getLottos = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            HashSet<Integer> lottos = new HashSet<>();
            while (true) {
                int n = r.nextInt(45) + 1;
                lottos.add(n);
                if (lottos.size() == 6) {
                    break;
                }
            }
            List<Integer> lottoList = new LinkedList<Integer>(lottos);
            Collections.sort(lottoList);

            getLottos.add(lottoList);
            System.out.println(lottoList);
        }

    }
}
