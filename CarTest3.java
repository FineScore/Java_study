class Car2 {
	String color;
	String gearType;
	int door;

	Car2() {
//		Car1(String color, String gearType, int door)�� ȣ��
		this("white", "auto", 4);
	}

//	�ν��Ͻ��� ���縦 ���� ������
	Car2(Car2 c) {
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}

	Car2(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest3 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		Car2 c2 = new Car2(c1);

		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);

		c1.door = 100;
		System.out.println("c1.door=100; ���� ��");
		System.out.println("c1�� color=" + c1.color + ", gearType=" + c1.gearType + ", door=" + c1.door);
		System.out.println("c2�� color=" + c2.color + ", gearType=" + c2.gearType + ", door=" + c2.door);
	}

}
