package chapter13;

import java.util.ArrayList;
import java.util.Scanner;

public class UserExample {

	public static void main(String[] args) {
		// User 객체가 담길 ArrayList 생성
		ArrayList<User> userList = new ArrayList<User>();

		// 총 사용자수 입력받기(Scanner)
		Scanner sc = new Scanner(System.in);
		int userCnt = 0;
		while (userCnt == 0) {
			try {
				System.out.println("추가할 사용자 수를 입력해주세요 : ");
				userCnt = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자가 아닌 문자가 입력됨");
			}

		}

		// User 객체 추가 (입력받은 갯수만큼)
		for (int i = 0; i < userCnt; i++) {
			userList.add(new User());
		}
//		System.out.println("userList의 size : " + userList.size());

		// 각 User객체의 정보 입력(Scanner)
		for (int i = 0; i < userList.size(); i++) {
			System.out.print("이름 : ");
			userList.get(i).setName(sc.nextLine());
			System.out.print("연락처 : ");
			userList.get(i).setTel(sc.nextLine());
			System.out.print("성별 : ");
			userList.get(i).setGender(sc.nextLine());
			System.out.print("나이 : ");
			userList.get(i).setAge(Integer.parseInt(sc.nextLine()));
			System.out.print("생년월일 : ");
			userList.get(i).setBirth(sc.nextLine());

			System.out.println("사용자 " + userList.get(i).getName() + " 등록되었습니다.");
		}
//			//향상된 for문 사용 getter setter사용안했을 경우
//		for(User user : userList) {
//			System.out.print("이름 : ");
//			user.name = sc.nextLine();
//			System.out.print("연락처 : ");			
//			user.tel = sc.nextLine();
//			System.out.print("성별 : ");
//			user.gender = sc.nextLine();
//			System.out.print("나이 : ");
//			user.age = Integer.parseInt(sc.nextLine());
//			System.out.print("생년월일 : ");
//			user.birth = sc.nextLine();		
//		}

		// UserList에 사용자 추가
		System.out.println("새로운 사용자를 리스트에 추가합니다.");
		User tempUser = new User();
		System.out.print("이름 : ");
		tempUser.setName(sc.nextLine());
		System.out.print("연락처 : ");
		tempUser.setTel(sc.nextLine());
		System.out.print("성별 : ");
		tempUser.setGender(sc.nextLine());
		System.out.print("나이 : ");
		tempUser.setAge(Integer.parseInt(sc.nextLine()));
		System.out.print("생년월일 : ");
		tempUser.setBirth(sc.nextLine());

		userList.add(tempUser);

		// 총 사용자가 몇명인지 출력
		System.out.println("tempUser를 추가한 userList의 size : " + userList.size());
		
		//등록된 사용자 정보 출력
		for(User user : userList) {
			System.out.println(user.getName());
			System.out.println(user.getTel());
			System.out.println(user.getAge());
			System.out.println(user.getGender());
			System.out.println(user.getBirth());
		}
		
		//전체 사용자 제거
		userList.clear();
		
		//제거가 잘 됐는지 확인
		System.out.println("clear한 후의 userList의 size : " + userList.size());
	}

}
