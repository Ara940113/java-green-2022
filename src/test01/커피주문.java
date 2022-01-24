package test01;

public class 커피주문 {
    public static void main(String[] args) {
        손님 costomer = new 손님();
        바리스타 baristar = new 바리스타();
        메뉴판 choose = new 메뉴판();
        커피 coffee = new 커피();

        costomer.order(baristar, choose, coffee);
    }

}
