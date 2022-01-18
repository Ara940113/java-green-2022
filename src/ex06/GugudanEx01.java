package ex06;

public class GugudanEx01 {
    public static void main(String[] args) {

        int step;

        for (step = 2; step <= 9; step++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(step + "*" + i + "=" + (step * i));
            }
        }

    }
}