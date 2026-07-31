package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentExample {
	static Scanner sc = new Scanner(System.in);
	static boolean flag = true;
	public static void main(String[] args) {
		ArrayList<Student> stList = new ArrayList<Student>();
		int selectMenu = 0;
		while(selectMenu != 6) {
			System.out.println("실행할 메뉴를 선택해 주세요.");
			System.out.println("1. 학생정보등록");
			System.out.println("2. 연락처등록");
			System.out.println("3. 성적입력");
			System.out.println("4. 학생정보수정");
			System.out.println("5. 학생정보");
			System.out.println("6. 종료");
			selectMenu = Integer.parseInt(sc.nextLine());
			switch(selectMenu) {
			case(1):
				classinfo(stList);
				break;
			case(2):
				numr(stList);
				break;
			case(3):
				jr(stList);
				break;
			case(4):
				strf(stList);
				break;
			case(5):
				check(stList);
				break;
			case(6):
				break;
			}
			
			
		}

	}

	static void classinfo(ArrayList<Student> stList) {

		Student std = new Student();

		System.out.println("학생의 정보를 입력해주세요.");

		System.out.print("이름 : ");
		std.setName(sc.nextLine());
		System.out.print("성별 : ");
		std.setGender(sc.nextLine());
		System.out.print("학년 : ");
		std.setSc1(sc.nextLine());
		System.out.print("반 : ");
		std.setSc2(sc.nextLine());
		System.out.print("번호 : ");
		std.setSc3(sc.nextLine());
		System.out.println("학번은 : " + std.getInfo());

		System.out.println("학생 " + std.getName() + "(이)가 등록되었습니다.");
		stList.add(std);

	}

	static void numr(ArrayList<Student> stList) {

		flag = true;
		while (flag) {
			System.out.print("연락처를 등록할 학생의 학번을 입력해주세요 : ");
			String rg = sc.nextLine();
			for (Student i : stList) {
				if (i.getInfo().equals(rg)) {
					System.out.println(i.getName() + "학생의 연락처를 등록하시겠습니까 (y/n)?");
					String cho = sc.nextLine();
					if (cho.equals("y")) {
						System.out.print("연락처를 입력해주세요 : ");
						i.setTel(sc.nextLine());
						flag = false;
					} else if (cho.equals("n")) {
						flag = false;
					}
				} else {
					System.out.println("잘못된 학번입니다.");
				}
			}

		}
	}

	static void jr(ArrayList<Student> stList) {

		flag = true;
		while (flag) {
			System.out.print("점수를 기입할 학생의 학번을 입력해주세요 : ");
			String rg = sc.nextLine();
			for (Student i : stList) {
				if (i.getInfo().equals(rg)) {
					System.out.printf("%s학생의 점수를 기입해주세요.\n", i.getName());
					System.out.print("국어 : ");
					i.setKjum(sc.nextLine());
					System.out.print("영어 : ");
					i.setEjum(sc.nextLine());
					System.out.print("수학 : ");
					i.setMjum(sc.nextLine());
					System.out.print("사회 : ");
					i.setSojum(sc.nextLine());
					System.out.print("과학 : ");
					i.setScjum(sc.nextLine());
					flag = false;
				} else {
					System.out.println("잘못된 학번입니다.");
				}
			}
		}
	}

	static void strf(ArrayList<Student> stList) {

		flag = true;

		while (flag) {
			System.out.print("정보를 수정할 학생의 학번을 입력해주세요 : ");
			String rg = sc.nextLine();
			for (Student i : stList) {
				if (i.getInfo().equals(rg)) {
					System.out.println("어느 정보를 수정하시겠습니까??");
					System.out.println("================================");
					System.out.println("1. 이름\t 2. 학년");
					System.out.println("3. 반\t 4. 번호");
					System.out.println("5. 성별\t 6. 연락처 ");
					System.out.println("================================");
					System.out.print("번호를 입력해주세요 : ");
					String num = sc.nextLine();
					if (num.equals("1")) {
						System.out.print("현재이름은 '"+ i.getName() + "' 변경할 이름을 입력해주세요 : ");
						i.setName(sc.nextLine());
						flag = false;
					} else if (num.equals("2")) {
						System.out.print("현재학년은'"+ i.getSc1() + "' 변경할 학년을 입력해주세요 : ");
						i.setSc1(sc.nextLine());
						flag = false;
					} else if (num.equals("3")) {
						System.out.print("현재반은'"+ i.getSc2() + "' 변경할 반을 입력해주세요 : ");
						i.setSc2(sc.nextLine());
						flag = false;
					} else if (num.equals("4")) {
						System.out.print("현재번호는'"+ i.getSc3() + "' 변경할 번호를 입력해주세요 : ");
						i.setSc3(sc.nextLine());
						flag = false;
					} else if (num.equals("5")) {
						System.out.print("현재성별은'"+ i.getGender() + "' 변경할 성별을 입력해주세요 : ");
						i.setGender(sc.nextLine());
						flag = false;
					} else if (num.equals("6")) {
						System.out.print("현재연락처는'"+ i.getTel() + "' 변경할 연락처를 입력해주세요 : ");
						i.setTel(sc.nextLine());
						flag = false;

					}
				} else {
					System.out.println("잘못된 학번입니다.");
				}
			}
		}
		
	}

	static void check(ArrayList<Student> stList) {

		for (Student i : stList) {
			System.out.printf("%s	|학번%s	|연락처%s	|평균%.2f점", i.getName(), i.getInfo(), i.getTel(), i.getAvg());
		}
	}

}
