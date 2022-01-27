package Coffee;

class Customer {
	String customerName() {
		return "";
	}
	// 1번

	class 홍길동 extends Customer {
		String name = "홍길동";

		String customerName() {
			return name;
		}
	}

	public void order(String menuName, Menu menu, Barista barista) {
		Customer g1 = new 홍길동();

		MenuItem menuItem = menu.choose(menuName);
		if (menuItem == null) {
			System.out.println("찾은 메뉴가 없습니다");
		}
		Coffee coffee = barista.makeCoffee(menuItem);

		System.out.println(g1.customerName() + "이" + coffee.getPrice() + "원" + coffee.getName() + "를(을) 받았습니다.");

		// System.out.println("커피를 받았습니다.");
		// System.out.println("커피이름 : " + coffee.getName());
		// System.out.println("커피가격 : " + coffee.getPrice());
	}
}