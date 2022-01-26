package Coffee;

public class Customer {
	// 1번
	public void order(String menuName, Menu menu, Barista barista) {

		MenuItem menuItem = menu.choose(menuName);
		if (menuItem == null) {
			System.out.println("찾은 메뉴가 없습니다");
		}
		Coffee coffee = barista.makeCoffee(menuItem);

		System.out.println("커피를 받았습니다.");
		System.out.println("커피이름 : " + coffee.getName());
		System.out.println("커피가격 : " + coffee.getPrice());
	}
}
