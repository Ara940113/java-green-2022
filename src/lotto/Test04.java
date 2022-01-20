package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
        Random r = new Random();
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

        System.out.println(lottoList);
    }
}
