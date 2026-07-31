package chapter07;

import java.util.Scanner;

public class Tv extends RemoCon {
	int ch;
	int vol;

	Scanner sc = new Scanner(System.in);

	Tv(int ch, int vol) {

		this.ch = ch;
		this.vol = vol;

	}

	@Override
	void powerOn() {
		if (!this.state) {
			System.out.println("tv 전원을 켰습니다.");
			System.out.println("현재 채널은 '" + ch + "'이며 불륨은 '" + vol + "'입니다.");
			this.state = true;
		} else {
			System.out.println("이미 켜져있습니다.");
			System.out.println("현재 채널은 '" + ch + "'이며 불륨은 '" + vol + "'입니다.");
		}
	}

	@Override
	void powerOff() {
		if (this.state) {
			System.out.println("tv의 전원을 끕니다.");
			this.state = false;
		} else {
			System.out.println("tv전원을 먼저 키십시오.");
		}
	}

	void tvCh() {
		if (this.state) {
			System.out.println("'1' 채널을 올립니다.");
			System.out.println("'2' 채널을 내립니다.");
			System.out.println("'3' 채널을 정합니다.");
			System.out.println("'4' 채널 기능을 종료합니다.");
			int a = 0;
			while (a != 3) {
				a = sc.nextInt();
				if (a == 1) {
					ch++;
					System.out.println("현재채널는 " + ch + "번 입니다.");
				} else if (a == 2) {
					ch--;
					System.out.println("현재채널는 " + ch + "번 입니다.");
				} else if (a == 3) {
					System.out.print("원하는 채널 입력 : ");
					int b = sc.nextInt();
					ch = b;
					System.out.println("현재채널는 " + ch + "번 입니다.");
				} else if (a == 4) {
					System.out.println("채널 설정을 종료합니다.");

				} else
					System.out.println("잘못 입력되었습니다. 메뉴의 번호를 입력해주세요");
			}

		} else {
			System.out.println("tv의 전원을 먼저 키셔야 합니다.");
		}

	}

	void tvVol() {
		if (this.state) {
			System.out.println("'1' 불륨을 올립니다.");
			System.out.println("'2' 불륨을 내립니다.");
			System.out.println("'3' 불륨 조절을 종료합니다.");
			int a = 0;
			while (a != 3) {
				a = sc.nextInt();
				if (a == 1) {
					if (vol >= 10) {
						System.out.println("불륨은 최대 10입니다.");
						break;
					}
					vol++;
					System.out.println("현재불륨은 " + vol + " 입니다.");
				} else if (a == 2) {
					if (vol <= 0) {
						System.out.println("음소거 상태입니다.");
						break;
					}
					vol--;
					System.out.println("현재불륨은 " + vol + " 입니다.");
				} else if (a == 3) {
					System.out.println("불륨 조절을 종료합니다.");

				} else
					System.out.println("잘못 입력되었습니다. '1' 또는 '2'를 입력해주세요");
			}

		} else {
			System.out.println("tv의 전원을 먼저 키셔야 합니다.");
		}

	}

}
