package ex06;

public class ForEx02 {
    // 2의 24승을 출력하시오.
    public static void main(String[] args) {
        long result = 1;
        for (int i = 1; i < 24 + 1; i = i + 1) {

            // 연산!!
            result = result * 2;

            System.out.println(result);

            // 조건을 걸어서 출력!! or
        }
        // 여기서 출력!!
        System.out.println(result);
    }

}