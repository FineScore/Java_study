
public class DefaultMethodTest {

	public static void main(String[] args) {
		Child5 c = new Child5();
		c.method1();
		c.method2();
		MyInterface.staticMethod();
		MyInterface2.staticMethod();

	}

}

class Child5 extends Parent5 implements MyInterface, MyInterface2 {
//	�������̵�
	public void method1() {
		System.out.println("method1() in Child");
	}
}

class Parent5 {
	public void method2() {
		System.out.println("method2() in Parent");
	}
}

interface MyInterface {
//	����Ʈ �޼���
	default void method1() {
		System.out.println("method1() in MyInterface");
	}
	
//	����Ʈ �޼���
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	
//	static �޼���
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}

interface MyInterface2 {
//	����Ʈ �޼���
	default void method1() {
		System.out.println("method1() in MyInterface2");
	}
	
//	static �޼���
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface2");
	}
}