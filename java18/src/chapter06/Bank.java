package chapter06;

import java.util.Scanner;

public class Bank {
	static String[][] info = new String[100][3];
	static String number = "";
	static String name = "";
	static String money = "";
	static int count = 0;

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int cho = 0;
		while (cho != 6) {
			printMsg();

			cho = sc.nextInt();
			sc.nextLine();

			switch (cho) {
			case 1:
				System.out.println("계좌를 생성하겠습니다.");
				idMake();
				break;
			case 2:
				System.out.println("계좌 목록을 조회합니다.");
				idList();
				break;
			case 3:
				System.out.println("입금 합니다.");
				inputMoney();
				break;
			case 4:
				System.out.println("출금 합니다.");
				depotMoney();
				break;
			case 5:
				System.out.println("잔액을 조회 하겠습니다.");
				moneyMsg();
				break;
			case 6:
				System.out.println("은행 업무를 종료하겠습니다.");
				break;
			default:
				System.out.println("메뉴가 아닌 다른 번호를 선택하셨습니다.");
			}
		}

	}

	static void printMsg() {

		System.out.println("====== 은행 업무 프로그램 ======");
		System.out.println(" 1. 계좌 생성 ");
		System.out.println(" 2. 계좌 목록 조회 ");
		System.out.println(" 3. 입금 ");
		System.out.println(" 4. 출금 ");
		System.out.println(" 5. 잔액 조회");
		System.out.println(" 6. 종료 ");
		System.out.println("===========================");
		System.out.print("선택 >> ");

	}

	static void idMake() {
		while (true) {
			boolean flag = false;
			try {
				System.out.print("계좌번호 (*5자리를 입력해주세요) : ");
				number = sc.nextLine();
				if (number.length() != 5) {
					throw new Exception();
				}
				Integer.parseInt(number);

			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.");
				flag = true;
			}
			for (int a = 0; a < count; a++) {
				if (number.equals(info[a][0])) {
					flag = true;
					System.out.println("중복된 계좌입니다. 다시 입력해주세요.");
				}
			}
			if (!flag)
				break;
		}
		System.out.print("예금주 : ");
		name = sc.nextLine();
		System.out.print("잔액 : ");
		int d = 0;
		try {
			d = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("잘못 입력하여 메인으로 돌아갑니다.");
			System.out.println("계속하시려면 Enter를 입력해주세요...");
			sc.nextLine();
			return;
		}
		String money = Integer.toString(d);

		info[count][0] = number;
		info[count][1] = name;
		info[count][2] = money;

		System.out.println("계좌가 등록되었습니다.");

		count++;
	}

	static void idList() {
		System.out.printf("%s\t%s%10s\n", "계좌번호", "예금주", "잔액");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%s%11s\n", info[i][0], info[i][1], info[i][2]);
		}

	}

	static void inputMoney() {
		int b = 0;
		while (true) {
			boolean flag = false;
			System.out.println("입금할 계좌번호를 입력해 주세요");
			System.out.print(">>>");
			String sa = sc.nextLine();
			for (int a = 0; a < count; a++) {
				if (info[a][0].equals(sa)) {
					b = a;
					flag = true;
					break;
				}
			}
			if (flag == true) {
				break;
			} else {
				System.out.println("없거나 잘못된 계좌입니다");
				return;
			}

		}
		System.out.printf("%s\t%s%10s\n", "계좌번호", "예금주", "잔액");
		System.out.printf("%s\t%s%11s\n", info[b][0], info[b][1], info[b][2]);

		int c = Integer.parseInt(info[b][2]);

		while (true) {
			boolean flag = false;
			System.out.print("얼마를 입금 하시겠습니까? >> ");
			int d = 0;
			try {
				d = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("잘못 입력하여 메인으로 돌아갑니다.");
				System.out.println("계속하시려면 Enter를 입력해주세요...");
				sc.nextLine();
				return;
			}
			System.out.println(d + "이 금액이 맞습니까?");
			System.out.println("맞으면 'y' / 틀리면 'n' 을 입력해주세요.");
			String cho = sc.nextLine();
			if (cho.equals("n")) {
				flag = true;
			}
			if (cho.equals("y")) {
				c += d;
				break;
			}
		}
		String e = Integer.toString(c);
		System.out.println("현재 잔액 : " + c);

		info[b][2] = e;
	}

	static void depotMoney() {

		int b = 0;
		while (true) {
			boolean flag = false;
			System.out.println("출금할 계좌번호를 입력해 주세요");
			System.out.print(">>>");
			String sa = sc.nextLine();
			for (int a = 0; a < count; a++) {
				if (info[a][0].equals(sa)) {
					b = a;
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			} else {
				System.out.println("없거나 잘못된 계좌입니다");
				return;
			}
		}
		System.out.printf("%s\t%s%10s\n", "계좌번호", "예금주", "잔액");
		System.out.printf("%s\t%s%11s\n", info[b][0], info[b][1], info[b][2]);

		int c = Integer.parseInt(info[b][2]);

		while (true) {
			boolean flag = false;
			System.out.print("얼마를 출금 하시겠습니까? >> ");
			int d = 0;

			try {
				d = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("잘못 입력하여 메인으로 돌아갑니다.");
				System.out.println("계속하시려면 Enter를 입력해주세요...");
				sc.nextLine();
				return;
			}
			System.out.println(d + "이 금액이 맞습니까?");
			System.out.println("맞으면 'y' / 틀리면 'n' 을 입력해주세요.");
			String cho = sc.nextLine();
			if (cho.equals("n")) {
				flag = true;
			}
			if (cho.equals("y")) {
				if (c+100000 < d) {
					flag = true;
					System.out.println("출금하시려는 금액이 한도를 초과하였습니다.");
					System.out.println("다시 입력해주세요.");
				} else {
					c -= d;
					break;
				}
			}
		}
		String e = Integer.toString(c);
		System.out.println("현재 잔액 : " + c);

		info[b][2] = e;

	}

	static void moneyMsg() {
		System.out.println("조회 하려는 계좌번호를 입력하세요.");
		System.out.print(">>>\n");
		String money = sc.nextLine();
		int a = 0;
		for (int i = 0; i < count; i++) {
			info[i][0].equals(money);
			a = i;
		}
		System.out.printf("계좌번호'%s'의 고객인 %s님의 현재 잔액은 '%s원' 입니다.\n", info[a][0], info[a][1], info[a][2]);
		System.out.println("계속 진행하시려면 enter를 눌러주세요");
		sc.nextLine();

	}
}
