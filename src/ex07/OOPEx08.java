package ex07;

class Person2 {
    String name;
    int height;
    int weight;

    // 디폴트 생성자 = 객체의 초기화를 위해 필요!!
    // constructor (생성자) : 클래스 이름과 동일해야 한다. (첫글자 대문자) , 반환타입이 없으니 메서드 아니고 생성자
    Person2(String d1, int d2, int d3) { // 생성자 (매개변수)
        name = d1;
        height = d2;
        weight = d3;

    }
}

public class OOPEx08 {
    public static void main(String[] args) {
        Person2 s1 = new Person2("홍길동", 170, 70); // 메세지를 보낼때 아규먼트를 통해서 전달받고 보낼 수 있다.
        Person2 s2 = new Person2("임꺽정", 150, 200);

        System.out.println(s1.name);
        System.out.println(s2.name);
    }

}
