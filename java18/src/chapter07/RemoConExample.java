package chapter07;

import java.util.Scanner;

public class RemoConExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aircon airCon = new Aircon(18);
		Tv tv = new Tv(5, 5);
		Light light = new Light(5);

		int cho = 0;
		while (cho != 4) {
			System.out.println("=========================");
			System.out.println("1. 에어컨");
			System.out.println("2. TV");
			System.out.println("3. 전등");
			System.out.println("4. 종료");
			System.out.println("=========================");
			System.out.println("사용할 리모콘 번호를 선택해주세요");
			System.out.print(">>>");

			cho = sc.nextInt();
			sc.nextLine();

			if (cho == 1) {
				System.out.println("에어컨 리모콘을 선택하셨습니다.");
				int tel = 0;
				while (tel != 3) {
					System.out.println("=========================");
					System.out.println("1. 전원 ON");
					System.out.println("2. 온도 조절");
					System.out.println("3. 전원 OFF");
					System.out.println("=========================");
					System.out.print(">>>");
					tel = sc.nextInt();
					if (tel == 1) {
						airCon.powerOn();
					} else if (tel == 2) {
						airCon.TmUpDown();
					} else if (tel == 3) {
						airCon.powerOff();
					} else {
						System.out.println("메뉴얼에 있는 번호를 입력해주세요");
					}

				}

			} else if (cho == 2) {
				System.out.println("tv 리모콘을 선택하셨습니다.");
				int air = 0;
				while (air != 4) {
					System.out.println("=========================");
					System.out.println("1. 전원 ON");
					System.out.println("2. 채널 조정");
					System.out.println("3. 불륨 조절");
					System.out.println("4. 전원 Off");
					System.out.println("=========================");
					System.out.print(">>>");
					air = sc.nextInt();
					if (air == 1) {
						tv.powerOn();
					} else if (air == 2) {
						tv.tvCh();
					} else if (air == 3) {
						tv.tvVol();
					} else if (air == 4) {
						tv.powerOff();
					} else {
						System.out.println("메뉴얼에 있는 번호를 입력해주세요");
					}

				}

			} else if (cho == 3) {
				System.out.println("조명 리모콘을 선택하셨습니다.");
				int hi = 0;
				while (hi != 3) {
					System.out.println("=========================");
					System.out.println("1. 전원 ON");
					System.out.println("2. 밝기 조절");
					System.out.println("3. 전원 OFF");
					System.out.println("=========================");
					System.out.print(">>>");
					hi = sc.nextInt();
					if (hi == 1) {
						light.powerOn();
					} else if (hi == 2) {
						light.light();
					} else if (hi == 3) {
						light.powerOff();
					} else {
						System.out.println("메뉴얼에 있는 번호를 입력해주세요");
					}

				}

			} else if (cho == 4) {

				System.out.println("프로그램을 종료합니다.");
				break;

			} else
				System.out.println("리모콘 종류를 다시 선택해주세요.");

		}

	}

}
