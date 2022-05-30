
public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();

		if (f instanceof Unit)
			System.out.println("f는 Unit클래스의 자손입니다.");
		if (f instanceof Fightable)
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		if (f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		if (f instanceof Attackable)
			System.out.println("f는 Attackable인터페이스를 구현했습니다.");
		if (f instanceof Object)
			System.out.println("f는 Object클래스의 자손입니다.");
	}

}

/*
 * Fighter -> Unit -> Object
 * 		   -> Fightable -> Movable
 * 						-> Attackable
 */
class Fighter extends Unit implements Fightable {
//	오버라이딩 할 때는 조상의 메서드보다 넓은 범위의 접근 제어자를 저정해야 한다
	public void move(int x, int y) {
	}

	public void attack(Unit u) {
	}
}

class Unit {
	int currnetHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable {
}

interface Movable {
	void move(int x, int y); // public abstract void move
}

interface Attackable {
	void attack(Unit u); // public abstract void attack
}