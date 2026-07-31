package chapter05;

import java.util.Random;

public class exam5_01 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello World";
		
		
		
		String[] str3 = str2.split(" "); // 'str2'의 '스페이스바'부분을 자름으로 표시
		System.out.println("str3[0] :" + str3[0]);	 // 잘린 Hello(0), World(1)
		System.out.println("str1 : " + str1);
		System.out.println(str1 == str3[0]);
		System.out.println(str1.equals(str3[0]));
		
		/*
		 * 배열?? : 같은 타입의 변수를 여러개 선언하고 싶을때 사용
		 * 	-> 같은 타입의 변수 여러개를 묶은 데이터 뭉텅이
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
//		int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5, num6 = 6, num7 =7,
//				num8 = 8, num9 = 9, num10 = 10;
		int num[] = {1605, 122, 1605, 573, 1235, 579, 6871, 2236, 55846, 2348};
		
		for(int i = 0; i < 10; i++)
			System.out.println("num[" +  i + "] : " + num[i]);  //만들어진거 확인

		String strarr[] = {"Hello", "Apple", "Computer", "Java"};
		for(int i = 0; i < 4; i++) {
			System.out.println("strarr[" + i + "] : " + strarr[i]);
		}
		
		Random r = new Random();
		
		// 야구게임 숫자 4개 (아직 중복제거 없음)
		int numarr[] = new int[4];	// 4칸짜리 빈 배열
		for (int i = 0; i < 4; i++) {
			numarr[i] = r.nextInt(0,9);
			System.out.println("numarr[" + i + "] : " + numarr[i]);
//			System.out.println(r.nextInt(0, 9));
		}
		
		
		// 빙고게임 숫자 25개 뽑아서 숫자판 (아직 중복제거 없음)
		String bingo[][] = new String[5][5]; // 빙고 5x5칸
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				bingo[i][j] = String.valueOf(r.nextInt(1,25));
			}
		}
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3s ", bingo[i][j]);
			}
			System.out.println();
		}
		
		
		// 영화관 좌석 모두 예약가능 상태로 셋팅
		char sitArr[][] = new char[2][5];
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				sitArr[i][j] = 'O';
			}
		}
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%3c ", sitArr[i][j]);
			}
			System.out.println();
			}
		
		
		
	}

}
