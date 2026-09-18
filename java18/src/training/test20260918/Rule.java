package training.test20260918;

import java.util.Random;
import java.util.Scanner;

public class Rule {
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();

	public String[][] FrameMake() {
		System.out.print("세로의 길이를 입력하세요 : ");
		int a = sc.nextInt();
		System.out.print("가로의 길이를 입력하세요 :");
		int b = sc.nextInt();

		String[][] array = new String[a][b];

		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				char ch = (char) rd.nextInt(65, 76);
				array[i][j] = String.valueOf(ch);
				System.out.print("[" + array[i][j] + "]");
			}
			System.out.println();
		}
		return array;
	}

	public void FrameImg(String[][] array) {
		int a = array.length;
		int b = array[0].length;
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print("[" + array[i][j] + "]");
			}
			System.out.println();
		}
	}

}
