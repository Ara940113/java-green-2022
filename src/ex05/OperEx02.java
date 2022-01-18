package ex05;

public class OperEx02 {
    public static void main(String[] args) {
        System.out.println(1 == 1); // 같다
        System.out.println(!(1 == 1));
        // 괄호로 전체를 부정해줘야 한다 1==1 true를 부정했으니 아래코드와 같다
        // 괄호는 우선순위를 지정할 수 있다.
        System.out.println(!true); // ! 느낌표는 부정
        System.out.println(1 != 1); // 같지않나요?
        System.out.println(1 < 2);
        System.out.println(1 > 2);

    }

}
