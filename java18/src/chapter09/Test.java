package chapter09;

public class Test {
	
	class Apple{
		
		int appleCnt;		//필드가 'static'인경우 값이 변경시킨 경우 다른곳에서 사용하는 appleCnt의 값이 변경됨
		
		void appleTest() {
			class Box{
				Box(){
					System.out.println("Box 생성됨");
				}
				int boxCnt;
				
				void boxPrint() {
					System.out.println("boxCnt : " + boxCnt);
				}
			}
			Box box = new Box();
			box.boxPrint();
		}
		
		void appleprint() {
			System.out.println("appleCnt : " + appleCnt);
		}
	}
	static class Apple2 {
		
		int appleCnt;
		
		void appleprint() {
			System.out.println("appleCnt : " + appleCnt);
		}
	}

}
