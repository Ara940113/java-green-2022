package srp;

// 손님 - 종업원 (의존성,의존적 관계)
public class 손님 {

    public void 주문하기(종업원 manager, 요리사 chef) { // 주문을 하기 위해서는 주문 받기를 호출해야한다
        음식 jjajang = manager.주문받기(chef);
        System.out.println(jjajang.getName() + "을 먹습니다");
        // 주문받기();
    }

}
