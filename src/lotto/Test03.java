package lotto;

import java.util.HashSet;
import java.util.Random;

public class Test03 {
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

        System.out.println(lottos);

    }
}
