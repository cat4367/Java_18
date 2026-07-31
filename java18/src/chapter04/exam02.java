package chapter04;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		System.out.println("메뉴를 선택해주세요");
		System.out.println("----------------------");
		System.out.println("1. 아메리카노(Hot)");
		System.out.println("2. 아메리카노(Ice)");
		System.out.println("3. 카페라떼(Hot)");
		System.out.println("4. 카페모카(Hot)");
		System.out.println("----------------------");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
//		if (menu == 1) {
//			System.out.println("아메리카노 (Hot)을 선택하셨습니다.");
//		}else if (menu == 2) {
//			System.out.println("아메리카노 (Ice)를 선택하셨습니다.");
//		}else if (menu == 3) {
//			System.out.println("카페라떼 (Hot)을 선택하셨습니다.");
//		}else if (menu == 4) {
//			System.out.println("카페모카 (Hot)을 선택하셨습니다.");
//		}else {
//			System.out.println("메뉴가 아닌 다른 번호를 선택하셨습니다.");
//		}
		
		/*
		 * switch 문
		 * switch(변수){
		 * case ~ :
		 * 		//case 에 해당되면 실행할 문장
		 *} 
		 * 
		 * ※ case에 입력해주는 값은 변수의 자료형과 맞춰서 작성해 주어야 한다!
		 * ※ 각 case 들의 마지막에 break;를 넣어 주지 않는다면 중단하지 않고 계속 진행된다.
		 * ※ switch문은 단순 동등비교 밖에 못함.(대소비교 x)
		 */
		
		
		
		switch(menu) {
		case 1:
			System.out.println("아메리카노 (Hot)을 선택하셨습니다.");
			break;
		case 2:
			System.out.println("아메리카노 (Ice)를 선택하셨습니다.");
			break;
		case 3:
			System.out.println("카페라떼 (Hot)을 선택하셨습니다.");
			break;
		case 4:
			System.out.println("카페모카 (Hot)을 선택하셨습니다.");
			break;
		default:
			System.out.println("메뉴가 아닌 다른 번호를 선택하셨습니다.");
						
		}
		

	}

}
