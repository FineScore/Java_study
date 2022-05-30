
public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();

		if (f instanceof Unit)
			System.out.println("f�� UnitŬ������ �ڼ��Դϴ�.");
		if (f instanceof Fightable)
			System.out.println("f�� Fightable�������̽��� �����߽��ϴ�.");
		if (f instanceof Movable)
			System.out.println("f�� Movable�������̽��� �����߽��ϴ�.");
		if (f instanceof Attackable)
			System.out.println("f�� Attackable�������̽��� �����߽��ϴ�.");
		if (f instanceof Object)
			System.out.println("f�� ObjectŬ������ �ڼ��Դϴ�.");
	}

}

/*
 * Fighter -> Unit -> Object
 * 		   -> Fightable -> Movable
 * 						-> Attackable
 */
class Fighter extends Unit implements Fightable {
//	�������̵� �� ���� ������ �޼��庸�� ���� ������ ���� �����ڸ� �����ؾ� �Ѵ�
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