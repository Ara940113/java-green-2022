package Coffee;

class Barista {
	String baristaName() {
		return "";
	}

	class 공유 extends Barista {
		String baristaName = "공유";
	}

	// 3번
	public Coffee makeCoffee(MenuItem menuItem) {
		Coffee coffee = new Coffee(menuItem);
		return coffee;
	}
}