package chapter04;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {
		/*
		 * <미니 계산기 만들기>
		 * - 조건 -
		 * 1. 계산은 덧셈, 뺄셈, 곱셈, 나눗셈 만 잘 동작하면 됨
		 * 2. 숫자 두개는 입력받기
		 * 3. 간단한 설명 출력해주기
		 * 4. 코드마다 주석달기
		 * 5. 소수로도 계산이 가능해야 함
		 * 6. 출력형태는 소수점 둘째자리까지만
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1:");   //콘솔에 '숫자 1'입력
		Double du1 = sc.nextDouble(); // 'du1'에 실수값 입력부여
		double x = du1; //x = 'du1'
//		double x = Double.parseDouble(sc.nextLine());
		System.out.print("숫자 2:");   //콘솔에 엔터후 '숫자 2' 자동입력
		Double du2 = sc.nextDouble(); // 'du2'에 실수값 입력부여
		double y = du2; //y = 'du2'
//		double y = Double.parseDouble(sc.nextLine());
		System.out.print("계산 기호 :"); //콘솔에 엔터후 '계산 기호 : ' 자동입력
		String num = sc.next(); // 문자열 'num'에 계산기호 부여
		
		if(num.equals("+")) {								//만약 입력된 num이 '+'이면 다음 내용 프린트
			System.out.printf("더한결과 : %.2f", (x + y));		// 'x + y' 값에 소수점2까지 표현 (%.2f)
		}else if(num.equals("-")) {							//아닐경우 만약 num이 '-'면 다음 내용 프린트
			System.out.printf("뺄셈결과 : %.2f", (x - y));		// 'x - y' 값에 소수점2까지 표현 (%.2f)
		}else if(num.equals("*")) {							//아닐경우 만약 num이 '*'면 다음 내용 프린트
			System.out.printf("곱셈결과 : %.2f", (x * y));		// 'x * y' 값에 소수점2까지 표현 (%.2f)
		}else if(num.equals("/")) {							//아닐때 만약 '/'기호인데 'y'가 '0'이면 무한대가 나오므로 오류표시 
			if(y == 0) {									//
				System.out.println("오류 : 무한대 입니다.");
			}else {												//아니라면 다음 시스아웃 실행
				System.out.printf("나눗셈결과 : %.2f", (x / y));
			}
			
		}else {
			System.out.println("잘못된 계산 입니다.");			//이것도 아니면 잘못된 계산인 경우
		}
//		
		
//		switch(num) {
//		case "+":											// 'num'이 '+'일 경우 다음 내용을 프린트
//			System.out.printf("더한결과 : %.2f", (x + y));
//			break;											// 전 단계에서 프린트 된경우 여기서 멈춤
//		case "-":											// 'num'이 '-'일 경우 다음 내용을 프린트
//			System.out.printf("뺄셈결과 : %.2f", (x - y));	
//			break;											// 전 단계에서 프린트 된경우 여기서 멈춤
//		case "*":											// 'num'이 '*'일 경우 다음 내용을 프린트
//			System.out.printf("곱셈결과 : %.2f", (x * y));
//			break;											// 전 단계에서 프린트 된경우 여기서 멈춤
//		case "/":											// 'num'이 '/'일 경우 다음 내용을 프린트
//			if(y == 0) {									// 만약 y가 0일 경우에는 무한대이므로 아래 내용으로 프린트
//				System.out.println("오류 : 무한대 입니다.");
//			} else {										// 아닐경우에는 다음 프린트내역 실행
//				System.out.printf("나눈결과 : %.2f", (x / y));
//			}
//			break;											// 전 단계에서 프린트 된경우 여기서 멈춤
//		default :											// 케이스들이 아닌경우 아래프린트 내용을 기본으로함.
//			System.out.println("잘못된 계산 입니다.");			
//					
//		}
		System.out.println("\n끝");
					
		}

				
			
	}
	

