package chapter07;



public class Aircon extends RemoCon {

	int tm;


	Aircon(int tm) {

		this.tm = tm;
	}

	@Override
	void powerOn() {
		if (!this.state) {
			System.out.println("에어컨을 켰습니다.");		
			System.out.println("현재 설정된 온도는" + tm + " 도 입니다.");
			this.state = true;
		}else {
			System.out.println("이미 켜져있습니다.");		
			System.out.println("현재 설정된 온도는" + tm + " 도 입니다.");			
		}
		
	}
	@Override
	void powerOff() {
		if(this.state) {
			System.out.println("에어컨의 전원을 끕니다.");
			this.state = false;
		}else {
			System.out.println("전원을 먼저 키십시오.");
		}
	}

	void TmUpDown() {
		
		if(this.state) {
			System.out.println("'1' 온도를 올립니다.");
			System.out.println("'2' 온도를 내립니다.");
			System.out.println("'3' 종료합니다.");
			int a = 0;
			while (a != 3) {
				a = sc.nextInt();
				if (a == 1) {
					if(tm >= 30) {
						System.out.println("30도가 최대입니다.");
						break;
					}
					tm++;
					System.out.println("현재온도는 " + tm + "도 입니다.");
				} else if (a == 2) {
					if(tm <= 18) {
						System.out.println("18도가 최저입니다.");
						break;
					}
					tm--;
					System.out.println("현재온도는 " + tm + "도 입니다.");
				} else if (a == 3) {
					System.out.println("온도 설정을 종료합니다.");
					
				}
				
				else
					System.out.println("잘못 입력되었습니다. '1' 또는 '2'를 입력해주세요");
			}
			
		} else {
			System.out.println("에어컨의 전원을 먼저 키셔야 합니다.");
		}

	}

}
