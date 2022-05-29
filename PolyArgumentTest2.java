class Product3 {
	int price;
	int bonusPoint;

	Product3(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}

	Product3() {
	}
}

class Tv3 extends Product3 {
	Tv3() {
		super(100);
	}

	public String toString() {
		return "Tv3";
	}
}

class Computer3 extends Product3 {
	Computer3() {
		super(200);
	}

	public String toString() {
		return "Computer3";
	}
}

class Audio3 extends Product3 {
	Audio3() {
		super(50);
	}

	public String toString() {
		return "Audio3";
	}
}

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	Product3[] item = new Product3[10]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; // Product 배열에 사용될 카운터

	void buy(Product3 p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // 제품을 Product[] item에 저장
		System.out.println(p + "을/를 구입하셨습니다.");
	}

	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i = 0; i < item.length; i++) {
			if (item[i] == null)
				break;
			sum += item[i].price;
			itemList += item[i] + ", ";
		}
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 제품은 " + itemList + "입니다.");
	}
}

public class PolyArgumentTest2 {

	public static void main(String[] args) {
		Buyer3 b = new Buyer3();

		b.buy(new Tv3());
		b.buy(new Computer3());
		b.buy(new Audio3());
		b.summary();


	}

}
