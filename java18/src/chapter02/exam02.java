package chapter02;

import java.util.Scanner;//자바에있는 유틸기능중 Scanner만 불러온 형식

public class exam02 {

	public static void main(String[] args) throws Exception {
		// "throws Excpetion" 메인 처음에 추가로 작성시 오류사용시 넘기겠다는 명렁어
		/* 기본타입-정수형
		 * byte : 1byte -> 256가지 > -128 ~ 127
		 * short : 2byte -> 65536 > -32,768 ~ 32,767
		 * int : 4byte -> 2의32제곱 
		 * long : 8byte -> 2의64제곱 (int범위를 벗어날때 'L표시')
		 * 
		 * char(문자형) : 2byte(유니코드) -> 65536가지 > 0 ~ 65535
		 */
		/* 기본타입-실수형
		 * float : 4byte (소수점 사용시 f 표시)
		 * double : 8byte
		 */
		/*클래스타입(기본타입x)
		 * String : 문자열 (크기x)
		 */
		/*논리형
		 * boolean : 2가지 종류의 값(true / fals)
		 */
		int a = 10, b = 5;
		boolean result = a < b;
		System.out.println(result);
		System.out.println(a < b);
		System.out.println(a > b);
		
		// 타입변환
		int num1;
		short num2 = 10;
		
		// 자동형 변환 (작은타입 -> 큰타입 대입)
		num1 = num2;
		System.out.println(num1);
		
		num1 = 50;
		//강제변환 (큰타입 -> 작은타입 대입)
		num2 = (short)num1;// int를 short로 강제로 변환시키는방법
		
		//작은타입 ------------------------------------- 큰타입
		//byte < short(char) < int < long < float < double
		
		char ch = 'A';
		int num3 = ch;
		
		System.out.println("num3 : " + num3);
		
		
		byte bt1 = 10, bt2 = 20;
		System.out.println("bt1 : " + bt1 + ", bt2 : " + bt2);
		
		byte btsum = (byte)(bt1 + bt2); //byte 사칙연산 사용시 강제변환 필요, 그래서 대부분 int를 사용
		System.out.println(btsum);
		
		//100p 예제 생각더하기
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		int sum = value1 + value2 + (int)value3; //long타입이 더커서 int로 강제변환하여 계산
		//int sum = (int)(value1 + value2 + value3); (int형)
		//long sum = value1 + value2 + value3; 도 사용가능 (long형)
		System.out.println(sum);
		
		System.out.println("계산결과는 : " + value1 + value2 + value3);
		System.out.println("계산결과는 : " + (value1 + value2 + value3));
		//문자가 포함되있을시 계산이 안됨 ()통해 사칙연산 먼저계산후 가능
		
		System.out.println("1" + 5 + 6); //ex '1'을 문자로 인식해서 사칙계산이 안됨
		System.out.println(Integer.parseInt("1") + 5);
		
		/*System.out.print
		 * Print 
		 * Println > ln > line(한줄)
		 * Printf > f > format(형식)
		 *  -> 형식지정자 %d(정수) %f(실수) %s(문자열) %c(문자) *113p
		 */
		System.out.printf("printf result : %d + %d + %d = %d\n" , value1, value2, value3, value1 + value2 +value3 );
		
		
		
		String st1 = "My name is ";
		String name = "Hyeongmin ";
		String st2 = "and I'm ";
		int age = 20;
		String st3 = "years old.";
		
		System.out.printf("%s%s%s%d%s\n" , st1, name, st2, age, st3);
	
		int year = 2026;
		int month = 6;
		int day = 29;
		
		System.out.println(year+"년 " + month+"월 " + day+"일");
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
		
		//"%10d", 123 = _ _ _ _ _ _ _ 1 2 3 
		System.out.printf("%10d원\n" , 123);
		System.out.printf("%10d원\n" , 1234);
		System.out.printf("%10d원\n" , 12345);
		System.out.printf("%10d\n" , 123456);
		
		
//		int keyCode = System.in.read();
//		System.out.println("keyCode : " + keyCode);
//		System.out.printf("keyCode : %c\n", keyCode);
		// 한글은 인식을 못함 115p
		
		Scanner scanner = new Scanner(System.in);
		String inputName = scanner.nextLine();
		System.out.println(inputName);
//		첫글자 클래스(대문자), 메소드(대문자 or 소문자) 변수(소문자)
		
		
		
		
	}

}
