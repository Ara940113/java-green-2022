package ex00;

// 계산기
// 상태와 행위는 꼭 필요한 것은 아니다.

class Calculator {

    // add 뒤에 있는 ()는 입구
    // void는 출구가 없다
    void add(int n1, int n2) { // 입구만 있는 메서드, 투입구는 콤마로 구분
        System.out.println("더하기 메서드 입니다.");
        System.out.println(n1 + n2); // 어떤 역할을 수행하는 메서드
    }

    // minus
    void minus(int n1, int n2) {// 이름이 똑같은데 적을 수 있는 이유는 공간이 다르기 때문, add stack/minus stack
        System.out.println("빼기 메서드 입니다.");
        System.out.println(n1 - n2);
    }

    // multi (곱하기)
    void multi(int n1, int n2) {
        System.out.println("곱하기 메서드 입니다.");
        System.err.println(n1 * n2);
    }

    // divide (나누기)
    void divide(int n1, int n2) {
        System.out.println("나누기 메서드 입니다");
        System.out.println(n1 / n2);
    }
}

public class MethEx01 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(10, 5);
        c1.minus(10, 5);
        c1.multi(10, 5);
        c1.divide(10, 5);
    }

}
