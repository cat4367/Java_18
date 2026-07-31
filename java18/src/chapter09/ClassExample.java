package chapter09;

public class ClassExample {
	// 클래스 안에 클래스 *컴파일시* x :바깥클래스, y : 멤버클래스 x$y.class
	// 클래스의 메소드안의 클래스 *컴파일시* x : 바깥클래스, y : 메소드 , z : 로컬클래스   x$1z.class
	public static void main(String[] args) {
		
		Test test = new Test();					//Test 클래스호출
		Test.Apple apple = test.new Apple();	//Test 클래스안의 Apple 클래스(멤버클래스) 호출
		Test.Apple apple2 = test.new Apple();
		//Test.Apple2 staticApple = new test.Apple2();
		
		
		
		apple.appleCnt = 10;
		apple.appleprint();
		
		apple2.appleCnt = 20;
		apple.appleprint();
		apple2.appleprint();
		
		apple.appleTest();
	}

}
