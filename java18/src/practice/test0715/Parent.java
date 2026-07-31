package practice.test0715;

import java.util.Random;
import java.util.Scanner;

public class Parent {
//	Rule rule = new Rule();
	DiceMake_ver2 rd = new DiceMake_ver2();
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	int ch[] = new int[3]; // 플레이어가 고를 주사위 변수를 3개 만듬
	int com[] = new int[3]; // 컴퓨터가 고를 주사위 변수를 3개 만듬
	int point[] = new int[3]; // [0] = 플레이어, [1] = 컴퓨터1, [2] = 컴퓨터2
	int count[] = new int[3]; // [0] = 플레이어, [1] = 컴퓨터1, [2] = 컴퓨터2
	int player = 0;
	int computer1 = 0;
	int computer2 = 0;

	
	void user(int[] dex) {
		

		if (point[0] < 1000) {
			
			count[0]++;
			System.out.println("플레이어가 3번 굴립니다.");

			for (int i = 0; i < 3; i++) {
				if (dex[i] == 1) {
					ch[i] = rd.Dice1();
				} else if (dex[i] == 2) {
					ch[i] = rd.Dice2();
				} else if (dex[i] == 3) {
					ch[i] = rd.Dice3();
				} else if (dex[i] == 4) {
					ch[i] = rd.Dice4();
				} else if (dex[i] == 5) {
					ch[i] = rd.Dice5();
				} else if (dex[i] == 6) {
					ch[i] = rd.Dice6();
				}
			}
			player = ch[0] + ch[1] + ch[2];
			point[0] += player;
			System.out.printf("주사위가 %d,%d,%d 나와서 현재 %d번째 %d점입니다.\n", ch[0], ch[1], ch[2], count[0], point[0]);
		}
	}

}
