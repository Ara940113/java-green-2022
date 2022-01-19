package srp;

// 종업원 - 요리사(의존성)
public class 종업원 {

    public 음식 주문받기(요리사 chef) { // 요리사의 레퍼런스를 받는 행위가 매개변수를 받는 이유 종업원은 요리사에 의존적이니까
        음식 jjajang = chef.음식생성(); // 메시지 전달
        return jjajang; // null 아무것도 없음.
    }

}
