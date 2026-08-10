package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test0807Method {

	String n;
	int t;
	int m;
	int p;

	Scanner sc = new Scanner(System.in);

	void msg() {
		System.out.println("=======N진수 게임=======");
		System.out.println("사용할 n진법을 선택해주세요 (ex 2, 8, 10, 16)");
		System.out.print(">>>>");
		while (true) {
			try {
				this.n = sc.nextLine();
				if (!n.equals("2") && !n.equals("8") && !n.equals("10") && !n.equals("16")) {
					throw new Exception();	//if문에 걸리면 예외처리되어서 catch로 넘어가고 false상태로 다시 반복함
				}
				break;
			} catch (Exception e) {
				System.out.println("잘못 입력되었습니다. 2, 8, 10, 16 중 선택해주세요.");
				System.out.print(">>>>");
			}
		}
		System.out.println("정답을 몇번 말할껀가요? (ex 0 < x <= 1000)");
		System.out.print(">>>>");
		this.t = Integer.parseInt(sc.nextLine());
		System.out.println("플레이어 수는 몇명인가? (ex 2 <= x <= 100");
		System.out.print(">>>>");
		this.m = Integer.parseInt(sc.nextLine());
		System.out.printf("당신은 몇번째 차례인가? 1 <= x <= %d\n", m);
		System.out.print(">>>>");
		this.p = Integer.parseInt(sc.nextLine());
		System.out.println("=======설정 확인=======");
		System.out.printf("'%s'진법 게임을 선택했습니다.\n", n);
		System.out.printf("'%d'번 정답을 맞춰야합니다.\n", t);
		System.out.printf("'%d'명이 게임을 시작합니다.\n", m);
		System.out.printf("'%d'번째 차례에 정답을 맞춥니다.\n", p);
	}

	List<String> type(String a) {
		List<String> list = new ArrayList<>();

		for (int i = 0; i <= 100; i++) {
			if (a.equals("2")) {
				for (char ch : Integer.toBinaryString(i).toCharArray()) {
					list.add(Character.toString(ch));
				}
			}
			if (a.equals("8")) {
				for (char ch : Integer.toOctalString(i).toCharArray()) {
					list.add(Character.toString(ch));
				}

			}
			if (a.equals("10")) {
				for (char ch : Integer.toString(i).toCharArray()) {
					list.add(Character.toString(ch));
				}
			}
			if (a.equals("16")) {
				for (char ch : Integer.toHexString(i).toCharArray()) {
					list.add(Character.toString(ch).toUpperCase());
				}
			}
		}
		return list;

	}
}
