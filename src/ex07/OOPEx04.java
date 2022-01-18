package ex07;

// 1. 자바는 모든 코드가 class내부에 있어야 한다.
// 2. 자바는 즉 class만 1급
// 3. class = 설계도
// 4. 클래스는 상태(변수)와 행위(메서드)를 가진다. 
// 5. static은 찾을 때 클래스명.변수명
// 6. static이 아닌 애들을 메모리에 띄우는 법 new 클래스명() =>heap에 뜬다.
//     heap은 동적 메모리 공간

class Dog {
    static int 배고픔 = 100; // 0~100 배고픔의 지수를 낮춰야 하니까 밥을 먹는 행위가 필요

    void 밥먹기() { // 메서드 = 행위
        배고픔 = 0; // 행위

    }
}

public class OOPEx04 {
    public static void main(String[] args) {
        Dog d = new Dog(); // 이렇게만 하면 뜨긴 뜨는데 그 공간은 쓰레기 공간이 된다.
        System.out.println(d.배고픔);
        d.밥먹기(); // 행위
        System.err.println(d.배고픔);
    }

}
