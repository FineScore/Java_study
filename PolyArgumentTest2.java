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
	Product3[] item = new Product3[10]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product �迭�� ���� ī����

	void buy(Product3 p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; // ��ǰ�� Product[] item�� ����
		System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
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
		System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
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
