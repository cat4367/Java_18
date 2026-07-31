package chapter07;

import java.util.Scanner;

public class Light extends RemoCon {

	int lg;
	Scanner sc = new Scanner(System.in);

	Light(int lg) {
		this.lg = lg;
	}

	@Override
	void powerOn() {
		if (!this.state) {
			System.out.println("에어컨을 켰습니다.");		
			System.out.println("현재 설정된 밝기는" + lg + " 입니다.");
			this.state = true;
		}else {
			System.out.println("이미 켜져있습니다.");		
			System.out.println("현재 설정된 밝기는" + lg + " 입니다.");			
		}
	}

	@Override
	void powerOff() {
		if (this.state) {
			System.out.println("조명의 전원을 끕니다.");
			this.state = false;
		} else {
			System.out.println("조명의 전원을 먼저 키십시오.");
		}
	}

	void light() {
		if (this.state) {
			System.out.println("'1' 밝기를 올립니다.");
			System.out.println("'2' 밝기를 내립니다.");
			System.out.println("'3' 밝기 조절을 종료합니다.");
			int a = 0;
			while (a != 3) {
				a = sc.nextInt();
				if (a == 1) {
					if(lg >= 10) {
						System.out.println("밝기는 10이 최고입니다.");
						break;
					}
					lg++;
					System.out.println("현재 밝기는 " + lg + " 입니다.");
				} else if (a == 2) {
					if(lg <= 0) {
						System.out.println("밝기는 0이 최저입니다.");
						break;
					}
					lg--;
					System.out.println("현재 밝기는 " + lg + " 입니다.");
				} else if (a == 3) {
					System.out.println("밝기 조절을 종료합니다.");

				} else
					System.out.println("잘못 입력되었습니다. '1' 또는 '2'를 입력해주세요");
			}
		} else {
			System.out.println("조명의 전원을 먼저 키셔야 합니다.");
		}

	}

}
