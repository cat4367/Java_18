package training;

import java.util.Scanner;

public class home01 {

	
	public static void main(String[] args) {
		
//		String name = "감자바";
//		int age = 25;
//		String tel1 = "010",tel2 = "123",tel3 = "4567";
//		System.out.println("이름: "+ name);
//		System.out.print("나이: " + age);
//		System.out.printf("\n전화: %1$s-%2$s-%3$s\n",tel1,tel2,tel3);
		
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("첫 번째 수:");
//		double num1 = Double.parseDouble(sc.nextLine());
//		System.out.print("두 번째 수:");
//		double num2 = Double.parseDouble(sc.nextLine());
//		
//		
//		Double result = num1 / num2;
//		
//		if (num2 == 0) { 
//			System.out.print("결과 : 무한대");
//		}
//		else if (num2 == 0.0) {
//			System.out.print("결과 : 무한대");
//		}
//		else {
//			System.out.println("나눈결과 :" + result);
//		}
		
		System.out.print("아이디 :");
		String name = sc.nextLine();
		
		System.out.print("패스워드 :");
		String strpassward = sc.nextLine();
		int passward = Integer.parseInt(strpassward);
		
		if("java".equals(name)) {
			if(passward == 12345) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("로그인 실패: 패스워드가 틀림");
			}
		} else {
			System.out.println("로그인 실패: 아이디 존재하지 않음");
		}
	
		
		

		
		
		
		
		
	}

}
