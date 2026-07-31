package chapter05;

import java.util.Random;
import java.util.Scanner;

public class exam5_02 {

	public static void main(String[] args) {

//		String str1 = ""; // 그릇은 만들었는데 아무 메모리없는 참조를 가져옴
//		String str2 = null; // 그릇은 만들었는데 아무것도없음 (메모리조차없음)
//		// int i = //없다! 라는 의미는 값이 될 수 없음!
//
//		// "" / null 비교
//		// 화장실에 갔는데 휴지심은 있고 휴지가 없는상태 > ""
//		// 화장실에 갔는데 휴지심 조차 없는 경우 > null
//
//		System.out.println("str1 : " + str1);
//		System.out.println("srt2 : " + str2);
//
////		int[] num = null;		//아무것도없는 num[0...~] 만듬
////		num[0] = 3;				//들어갈 장소가 없음
//
////		int[] num = new int[5];
////		
////		for(int i = 0;i <5; i++) {
////			num[i] = i;
////		}
////		int num[] = { 0, 1, 2, 3, 5, 7 };
////
////		System.out.println(num.length);
//
//		int array[][] = new int[5][5];
////		System.out.println(array.length); // array는 줄 갯수
////		System.out.println(array[0].length);
////		System.out.println(array[1].length);
////		System.out.println(array[2].length);
//
//		// 1 2 3 4 5
//		// 6 7 8 9 10
//		// 11 12 13 14 15
//		// 16 17 18 19 20
//		// 21 22 23 24 25
//
////		int n = 1;
////
////		for (int i = 0; i < 5; i++) {
////			for (int j = 0; j < 5; j++) {
////				array[i][j] += n;
////				n++;
////				
////			}
////		}
////		for (int i = 0; i < 5; i++) {
////			for (int j = 0; j < 5; j++) {
////				System.out.printf("%2d ", array[i][j]);
////			}
////			System.out.println();
////		}
//
//		// 1)
//		// 25 24 23 22 21
//		// 20 19 18 17 16
//		// 15 14 13 12 11
//		// 10 9 8 7 6
//		// 5 4 3 2 1
//		System.out.println("-------------------------------");
//		int a = 25;
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				array[i][j] = a;
//				a--;
//			}
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("%2d ", array[i][j]);
//			}
//			System.out.println();
//		}
//
//		// 2)
//		// 1 3 5 7 9
//		// 11 13 15 17 19
//		// 21 23 25 27 29
//		// 31 33 35 37 39
//		// 41 43 45 47 49
//		System.out.println("-------------------------------");
//		int b = 1;
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				array[i][j] = b;
//				b += 2;
//			}
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("%2d ", array[i][j]);
//			}
//			System.out.println();
//		}
//
//		// 3)
//		// 25 20 15 10 05
//		// 24 19 14 09 04
//		// 23 18 13 08 03
//		// 22 17 12 07 02
//		// 21 16 11 06 01
//
//		System.out.println("-------------------------------");
//		int c = 25;
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				array[i][j] = (c-i)-(5*j);
//				
//				
//			}
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("%2d ", array[i][j]);
//			}
//			System.out.println();
//		}
//
//		// 4)
//		// 1 6 11 16 21
//		// 2 7 12 17 22
//		// 3 8 13 18 23
//		// 4 9 14 19 24
//		// 5 10 15 20 25
//
//		System.out.println("-------------------------------");
//		int d = 1;
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				array[i][j] = (d+i)+(5*j);
//
//			}
//		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("%2d ", array[i][j]);
//			}
//			System.out.println();
//		}
//
//		// 5) +
//		// 01 02 03 04 05
//		// 16 17 18 19 06
//		// 15 24 25 20 07
//		// 14 23 22 21 08
//		// 13 12 11 10 09
//		System.out.println("-------------------------------");
//		int e = 1;
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				array[i][j] = e++;
//				if (i == 0) {
//					array[i][j] = j + 1;
//				} else if (j == 4) {
//					array[i][j] = i + 5;
//				} else if (i == 4) {
//					array[i][j] = 13 - j;
//				} else if (j == 0) {
//					array[i][j] = 17 - i;
//				} else if (i == 1) {
//					array[i][j] = j + 16;
//				} else if (j == 3) {
//					array[i][j] = i + 18;
//				} else if (i == 3) {
//					array[i][j] = 24 - j;
//				} else if (i == 2) {
//					array[i][j] = j + 23;
//				}
//
//			}
//		}
//
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.printf("%2d ", array[i][j]);
//			}
//			System.out.println();
//		}

		System.out.println("-------------------------------");

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.print("몇 칸 짜리로 만드시겠습니까? >> : ");
		int n = Integer.parseInt(sc.nextLine());

		int array[][] = new int[n][n];

//		int a = 1;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				array[i][j] = a;
//				a++;
//			}
//		}

//		int b = 1;
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				array[i][j] = b;
//				b += 2;
//			}
//		}

		int a = 1;
		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;
		while (a <= n * n) {
			for (int i = left; i < right; i++) {
				array[top][i] = a++;
			}
			left++;
			for (int i = top; i <= bottom; i++) {
				array[i][right] = a++;
			}

		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", array[i][j]);
			}
			System.out.println();
		}

	}

}
