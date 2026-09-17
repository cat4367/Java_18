package training.test20260917;

public class Test_0917 {
	
//	int speed;
//	String color;
//	
//	생성자 임명시 기본 생성된 'Test_0917(){}'는 사라짐
	
//	Test_0917(int s){
//		speed = s;
//	}
//	
//	Test_0917(int speed, String color){
//		this.speed = speed;
//		this.color = color;
//	}
	
//	overload는 같은 생성자이름으로 다양하게 만드는거(파라미터를 다르게함)
//	Override는 같은 이릐 메서드를 덮어씌움 ( 상속받은 메소드를 변경할때 쓰임)+

	
/*	객체지향의 특징
	1. 다형성(오버로딩) 2. 캡슐화 3. 상속 4. 추상화
	
	접근제한자
	- public : 외부클래스 O 다른패키지 O
	- protect : 다른패키지 -> 자식클래스O or 같은패키지O
	- private : 외부클래스 X 외부패키지 X -> 오직 해당 클래스 내에서만 사용
	- default : 같은패키지 O
	
*/	
	
	
	public static void main(String[] args) {
		
		Board pr = new Board();
//		pr.println(10);
		pr.println(true);
		pr.println(5.7);
		pr.println("홍길동");
	}
}
