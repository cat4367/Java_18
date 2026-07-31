package practice.test0715;

public class Child extends Parent {


	void computer1() {
		if (point[1] < 1000) {
			count[1]++;
			System.out.println("컴퓨터1이 3번 굴립니다.");
			int a1 = rd.Dice1();
			int a2 = rd.Dice1();
			int a3 = rd.Dice1();
			computer1 = a1 + a2 + a3;

			point[1] += computer1;
			System.out.printf("주사위가 %d,%d,%d 나와서 현재 %d번째 %d점입니다.\n", a1, a2, a3, count[1], point[1]);
		}
	}

	void computer2(int com[]) {
		int comin[] = new int[3];

		if (point[2] < 1000) {
			count[2]++;

			System.out.println("컴퓨터2이 3번 굴립니다.");
			for (int i = 0; i < 3; i++) {
				if (com[i] == 1) {
					comin[i] = rd.Dice1();
				} else if (com[i] == 2) {
					comin[i] = rd.Dice2();
				} else if (com[i] == 3) {
					comin[i] = rd.Dice3();
				} else if (com[i] == 4) {
					comin[i] = rd.Dice4();
				}
			}
			computer2 = comin[0] + comin[1] + comin[2];
			point[2] += computer2;
			System.out.printf("주사위가 %d,%d,%d 나와서 현재 %d번째 %d점입니다.\n", comin[0], comin[1], comin[2], count[2], point[2]);
		}

	}
	int[] childMsg() {
		
		for (int k = 0; k < 3; k++) {
			com[k] = r.nextInt(1, 5); // 밸런스를 위해 1부터 4까지의 주사위만 사용함
		}
		System.out.println("컴퓨터'1'은 1번 주사위만 사용합니다.");
		System.out.printf("컴퓨터'2'는 %d번 %d번 %d번을 선택했습니다.\n", com[0], com[1], com[2]);
		System.out.println("게임을 진행하시려면 'enter'를 실행해주세요....");
		sc.nextLine();
		
		return com;
	}
	

}
