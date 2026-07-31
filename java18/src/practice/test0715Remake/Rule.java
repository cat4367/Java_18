package practice.test0715Remake;

import java.util.Random;
import java.util.Scanner;

public class Rule extends Player {
	Scanner sc = new Scanner(System.in);
	DiceMake rd = new DiceMake();
	Random r = new Random();
	int dex[] = new int[3];


	public Rule(String player) {
		this.player = player;
		this.diceroll = 0;
		this.count = 0;
		this.grade = 0;
		this.win = 0;
	}

	public Rule() {
	}

	void rulemsg() {
		System.out.println(" 주사위 게임을 시작합니다. ");
		System.out.println(" 사용할 주사위 3개를 선택해주세요.\n *컴퓨터1 : 1번 주사위만 사용.\n *컴퓨터2 : 주사위 3개를 랜덤으로 사용합니다.(5,6번제외)");
		System.out.println("1 . (1,2,3,4,5,6)");
		System.out.println("2 . (1,1,1,1,6,6)");
		System.out.println("3 . (3,3,3,4,4,4)");
		System.out.println("4 . (2,2,2,5,5,5)");
		System.out.println("5 . (1,2,2,2,3,3,3,4,4,4,4,12)");
		System.out.println("6 . (1,2,3,4,9,10,11,12)");
		System.out.println("================================================");

	}

	void start() {

		System.out.println("계속 진행하려면 'enter'를 입력해주세요");
		sc.nextLine();

	}

	void choice() { // 사용할 주사위를 입력해서 사용

		while (true) {

			try {
				System.out.println("주사위 3개를 선택해주세요 ex)'1 3 6' or '2 4 4'");
				System.out.print(">>>");

				String input[] = sc.nextLine().split(" ");
				if (input.length != 3) {
					throw new Exception();
				}

				dex[0] = Integer.parseInt(input[0]);
				dex[1] = Integer.parseInt(input[1]);
				dex[2] = Integer.parseInt(input[2]);

				if (dex[0] > 6 || dex[1] > 6 || dex[2] > 6) {
					throw new Exception();
				} else if (dex[0] < 1 || dex[1] < 1 || dex[2] < 1) {
					throw new Exception();
				}

				break; // 오류가 아니어서 안잡힐경우 while문 밖으로 출력

			} catch (NumberFormatException e) { // 먼저 숫자가아닌경우의 오류를잡어서 오류내용을 알려줌
				System.out.println("숫자를 입력하셔야 합니다.");
			} catch (Exception e) { // 위에서 안잡힌 나머지 오류가 입력되었을때 해당내용을 출력함
				System.out.println("잘못 입력하였습니다 다시입력해주세요.");
			}

		}
		System.out.printf("%s는 [%d번, %d번, %d번]을 선택하셨습니다.\n", player, dex[0], dex[1], dex[2]);
	}

	void choice(int num) { 

		if (num == 1) {			//1번 주사위 3개를 사용
			this.dex[0] = 1;
			this.dex[1] = 1;
			this.dex[2] = 1;
			System.out.printf("%s는 [%d번] 주사위만 사용합니다.\n", player, dex[0], dex[1], dex[2]);

		} else if (num == 2) {	//1~4번 까지 랜덤으로 주사위 3개를 뽑아서 사용
			for (int i = 0; i < 3; i++) {
				dex[i] = r.nextInt(1, 5);
			}
			System.out.printf("%s는 [%d번, %d번, %d번] 주사위를 사용합니다.\n", player, dex[0], dex[1], dex[2]);
		}
	}

	void play() {

		int De[] = new int[3];
		int point = 0;

		if (grade < 1000) {

			count++;
			System.out.printf("%s가 주사위 3개를 굴립니다.  --->  ", player);

			for (int i = 0; i < 3; i++) {
				if (dex[i] == 1) {
					De[i] = rd.Dice1();
				} else if (dex[i] == 2) {
					De[i] = rd.Dice2();
				} else if (dex[i] == 3) {
					De[i] = rd.Dice3();
				} else if (dex[i] == 4) {
					De[i] = rd.Dice4();
				} else if (dex[i] == 5) {
					De[i] = rd.Dice5();
				} else if (dex[i] == 6) {
					De[i] = rd.Dice6();
				}
			}
			point = De[0] + De[1] + De[2];
			grade += point;
			System.out.printf("주사위눈이 %d,%d,%d 나와서 현재 %d번째 %d점입니다.\n", De[0], De[1], De[2], count, grade);
		}
	}

}
