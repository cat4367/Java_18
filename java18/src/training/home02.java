package training;


import java.util.Random;
import java.util.Scanner;

public class home02 {

	public static void main(String[] args) {
//		<각 프로그램에 대한 조건>
//		1. 숫자야구
//		 - 이지/노말/하드 모드
//		 - 이지모드 20회/노말모드 10회/하드모드 5회 이내로 못맞추면 “실패” 문구 출력
//		 - 숫자 4개 사용(중복x / 0포함)
//		 - 숫자는 해당되지만 위치가 맞지않는다면  “볼”
//		 - 숫자의 위치가 옳다면 “스트라이크”
//		 - 각각의 볼과 스트라이크는 숫자로 알려준다.
//		 - 숫자가 볼, 스트라이크 모두 없을 시 “아웃”
//
//		ex) 
//		<5 7 2 3>
//		1 4 8 9 > out
//		1 2 3 4 > 2B
//		5 6 7 8 > 1S 1B
//
//		+) 초이지모드/도전모드
//		 - 초이지모드 : 숫자 3개로 20회 이내에 맞추기
//		 - 도전모드 : 숫자 5개를 사용자가 지정한 횟수 이내로 맞추기

		Scanner sc = new Scanner(System.in);
		Random r = new Random();


		System.out.println("난이도를 입력해주세요");
		System.out.println("----------------------");
		System.out.println("'초이지모드' 20회");
		System.out.println("'이지모드' 20회");
		System.out.println("'노말모드' 10회");
		System.out.println("'하드모드' 5회");
		System.out.println("'도전모드' *숫자 5개를 맞춰야합니다. 횟수는 선택*");
		System.out.println("----------------------");

		boolean flag = true; // flag에 true 지정
		String menu = ""; // menu에 문자열 지정
		while (flag) {
			menu = sc.nextLine(); // 입력창에 적는 문자가 문자열 menu에 영향을 끼치게 설정
			int cho = 0; // cho에 정수 지정
			int n = 0;
			// 스위치문을 사용하여 난이도를 입력하여 해당난이도를 실행합니다.
			// 'while'문이 'false'가 되었을때 'switch'문을 멈추고 다음단계로 진행
			switch (menu) {
			case "초이지모드":
				cho = 20;
				n = 3;
				flag = false;
				break;
			case "이지모드":
				cho = 20;
				n = 4;
				flag = false;
				break;
			case "노말모드":
				cho = 10;
				n = 4;
				flag = false;
				break;
			case "하드모드":
				cho = 5;
				n = 4;
				flag = false;
				break;
			case "도전모드":
				System.out.print("원하는 도전 횟수를 입력해주세요 : ");
				cho = sc.nextInt();
				sc.nextLine();
				n = 5;
				flag = false;
				break;
			default:
				System.out.println("잘못입력하셨습니다.");
				continue;
			}

			int num[] = new int[n]; // num[]를 4개의 영역을만듭니다.
			for (int i = 0; i < n; i++) { // i 값이 0부터 3일때,
				num[i] = r.nextInt(0, 10); // num[i갯수만큼]일때, 0 부터 9까지 임의의 숫자를 넣습니다.

				for (int j = 0; j < i; j++) {
					if (num[i] == num[j]) { // 만약 중복이라면 i--를 통해 전단계로 돌아가서 다시 랜덤숫자를 뽑습니다.
						i--;
						break;
					}
				}
			}
			for (int i = 0; i < n; i++) { // 'for'문을 써서 i 0부터 n보다 작을때까지 반복
				System.out.print("[" + num[i] + "]"); // 반복된 num[0 < n]까지 프린트
			}
			System.out.println(); // 다음 글에 영향없애기위해 공백출력
			System.out.println(menu + "를 선택하셨습니다.");

			for (int i = 1; i <= cho + 1; i++) { // 난이도별 도전(cho)횟수만큼 반복한다

				int me[] = new int[n]; // 변수 me[]를 n개만큼 만들어줌 0부터시작
				if (cho == i) {
					System.out.println("마지막 기회입니다 :");
				} else {
					System.out.print("숫자 " + n + "개를 입력해주세요 " + i + "번째 : ");
				}
				boolean flag1 = true;
				String pr = ""; // 입력창에 입력시 'pr'로 저장됨
				String aaa[] = null;
				while (flag1) {
					pr = sc.nextLine();
					aaa = pr.split(""); // 입력된 문자를 하나씩 쪼갬

					if (aaa.length != n) {
						System.out.println("잘못된 입력입니다. 숫자 " + n + "개를 입력해주세요");
						continue;
					}
					for (int co = 0; co < n; co++) {
						flag1 = true;
						char a = pr.charAt(co);
						int ch = a;
//		        			 System.out.println(a + ":" + ch);
						for (int z = 48; z <= 57; z++) {
							if (ch == z) {
								flag1 = false;
								break;
							}
						}
//		        			 System.out.println("a : " + a);
//		        			 System.out.println("ch : " + ch);
//		        			 System.out.println("flag1 : " + flag1);
						if (flag1) {
							System.out.println("이 글자는 숫자가 아닙니다. 다시 입력해주세요 : ");
							break;
						}
					}
					if (flag1)
						continue;

					for (int j = 0; j < n; j++) {
						me[j] = Integer.parseInt(aaa[j]);

					}
					int st = 0;
					int ba = 0;

					for (int j = 0; j < n; j++) {
						for (int k = 0; k < n; k++) {
							if (num[j] == me[k]) {
								if (j == k) {
									st++;
								} else {
									ba++;
								}
							}
						}
					}
					if (st == 0 && ba == 0) {
						System.out.println("아웃");
					} else if (st == n) {
						System.out.println("정답입니다.");
						break;
					} else {
						System.out.printf("스트라이크 : %d, 볼 : %d\n", st, ba);
					}

				}
				if (i == cho) {
					System.out.println("횟수를 전부 소진하셨습니다.");
					break; // 'i'가 'cho' 와 같아질경우 'for'문을 빠져나와서 게임이 끝나버립니다
				}
			}

		}
	}

}