package practice.test0715;

import java.util.Scanner;

public class Rule {


	public int[] choice() {			//int계열의 배열함수를 받기위해서 int[]를 void자리에 집어넣음

		Scanner sc = new Scanner(System.in);
		boolean flag = true;		//while문 작동을위해 생성
		int dex[] = new int[3];		//int가 담긴 dex배열 3개생성

		while (flag) {				//오류일경우 false이므로 true의 값이 출력될때까지 해당입력을 반복

			try {
				System.out.println("주사위 3개를 선택해주세요 'ex)1 3 6'");
				System.out.print(">>>");
				
				
				String input[] = sc.nextLine().split(" ");	//입력한값의 공백부분을 기준으로 자른다
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

				break;									//오류가 아니어서 안잡힐경우 while문 밖으로 출력

			} catch (NumberFormatException e) {			//먼저 숫자가아닌경우의 오류를잡어서 오류내용을 알려줌
				System.out.println("숫자를 입력하셔야 합니다.");
			} catch (Exception e) {						//위에서 안잡힌 나머지 오류가 입력되었을때 해당내용을 출력함
				System.out.println("잘못 입력하였습니다 다시입력해주세요.");
			}

		}
		System.out.printf("플레이어는 %d번 %d번 %d번을 선택하셨습니다.\n", dex[0], dex[1], dex[2]);
		return dex;										//return은 한가지 값만 받을 수 있으므로 dex[]로 묶여있는값을 받음

	}

	void rulemsg() {
		System.out.println(" 주사위 게임을 시작합니다. ");
		System.out.println(" 사용할 주사위 3개를 선택해주세요.\n *컴퓨터1 : 1번 주사위만 사용.\n *컴퓨터2 : 주사위 3개를 랜덤으로 사용합니다.(5,6번제외)");
		System.out.println("1 . (1,2,3,4,5,6)");
		System.out.println("2 . (1,1,1,1,6,6)");
		System.out.println("3 . (3,3,3,4,4,4)");
		System.out.println("4 . (2,2,2,5,5,5)");
		System.out.println("5 . (1,2,3,4,5,6,7,8,9,10,11,12)");
		System.out.println("6 . (5,6,7,8,9,10,11,12) ! 사기주사위 !");
		System.out.println("================================================");

	}
	
	

}
