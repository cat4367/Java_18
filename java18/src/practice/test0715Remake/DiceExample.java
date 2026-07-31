package practice.test0715Remake;

import java.util.Scanner;

public class DiceExample {

	public static void main(String[] args) {

		Rule rule = new Rule();
		Rule user1 = new Rule("유저1");
//		Rule user2 = new Rule("유저2");
		Rule com1 = new Rule("컴퓨터1");
		Rule com2 = new Rule("컴퓨터2");
		Scanner sc = new Scanner(System.in);

		while (true) {

			rule.rulemsg();
			user1.choice();
//		user2.choice();
			com1.choice(1);
			com2.choice(2);
			Player list[] = {user1,com1,com2};
			for(int i = 0; i < list.length; i++) {
				list[i].grade = 0;
				list[i].count = 0;
			}
			rule.start();

			while (user1.grade < 1000 && com1.grade < 1000 && com2.grade < 1000) {

				user1.play();
//			user2.play();
				com1.play();
				com2.play();

			}
			System.out.println("=================결과===================");
			System.out.printf(" %s는 %d번째 %d점 입니다\n", user1.player, user1.count, user1.grade);
//		System.out.printf(" %s는 %d번째 %d점 입니다\n", user2.player, user2.count, user2.grade);
			System.out.printf(" %s는 %d번째 %d점 입니다\n", com1.player, com1.count, com1.grade);
			System.out.printf(" %s는 %d번째 %d점 입니다\n", com2.player, com2.count, com2.grade);
			System.out.println("=======================================");

			if (user1.grade >= 1000 && com1.grade < user1.grade && com2.grade < user1.grade) {
				System.out.printf("%s의 승리입니다.\n", user1.player); user1.win++;
			} else if (com1.grade >= 1000 && user1.grade < com1.grade && com2.grade < com1.grade) {
				System.out.printf("%s의 승리입니다.\n", com1.player); com1.win++;
			} else if (com2.grade >= 1000 && user1.grade < com2.grade && com1.grade < com2.grade) {
				System.out.printf("%s의 승리입니다.\n", com2.player); com2.win++;
			} else {
				System.out.println("공동 승리 또는 무승부입니다.");
			}
			System.out.printf("현재 [%s는 %d점], [%s는 %d점], [%s는 %d점]\n", user1.player, user1.win, com1.player, com1.win,
					com2.player, com2.win);
			System.out.println("계속 진행하시려면 아무키나입력해주세요.\n만약 그만하시려면 'end'를 입력해주세요");
			String a = sc.nextLine();
			if(a.equals("end")) {
				break;
			}
		}

	}

}
