package ex05;

public class VarEx04 {
    public static void main(String[] args) {
        // 대문자는 class 라이브러리
        // 1. 4가지 자료형 int,double,long,boolean : 메모리의 사이즈를 미리 정할수 있음
        // 2. 문자열 : 사이즈를 알 수 없다, 자료형이 아님!! 미리 세팅을 할 수 없다.
        String s1 = "안녕하세요";
        // 못정하는 데이터 타입 사이즈를 정할수 없음 사이즈를 정할 수 없는 아이들은 대문자로 시작
        System.out.println(s1);
        String s2 = s1; // 주소가 저장된다.
        s2 = "바보";

        System.out.println(s2);

    }

}
