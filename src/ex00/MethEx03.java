package ex00;

/**
 * 메서드 규칙
 * 1. 투입구와 출구가 있다. 단 출구는 항상 필요하지는 않다.
 * 2. 메서드는 하나의 모듈(특정한 역할(목적)을 수행하는)이 될 수 있다.
 * 3. 출구가 없을 때 void 사용, 출구가 있을 때는 타입을 동일하게 해준다. (return에서 내가 뱉어내는 애와 동일하게!)
 * 4. 메서드 내부(Queue)를 몰라도 사용 할 수 있다.(캡슐화)
 * 5. 메서드는 1급 객체인가? -> 아니다. 자바에서는 1급 객체가 class밖에 없다.
 * 6. 메서드를 왜 만드는가!-> 특정한 목적을 수행하는 코드 꾸러미를 만들기 위해서
 * - 캡슐화, 재사용, 코드관리도 편함, 메모리관리에도 엄청나게 효과적임. (호출할 때만 뜨니까)
 * static내부에는 heap데이터를 참조할 수 없다. => 타이밍때문에 컴파일러가 미리 금지시킴
 * static이 안붙으면 heap에 떠있다는 거니까!
 * 7. static 메서드 내부에서는 heap에 있는 데이터(상태)를 찾을 수 없다.
 * 
 */

public class MethEx03 {

    int sum = 0;

    void start() {
        int n1 = 10;
        int n2 = 20;
        int result = n1 + n2;
        sum = result; // heap 영역은 동적이기 때문에 언제 뜰지 몰라서 금지

    }

    public static void main(String[] args) {
        MethEx03 m = new MethEx03();
        System.err.println("전" + m.sum);
        m.start(); // 클래스명 생략 가능(같은 클래스에 있기 때문에)
        System.err.println("후" + m.sum);

    }

}
