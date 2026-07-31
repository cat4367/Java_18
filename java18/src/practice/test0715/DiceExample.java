package practice.test0715;

import java.util.Random;
import java.util.Scanner;

public class DiceExample {

	public static void main(String[] args) {

		Child chi = new Child();
		Rule rule = new Rule();
		Random r = new Random();

		
		
		
		rule.rulemsg();
		int dex[] = rule.choice();
		int com[] = chi.childMsg();
		



		
		while (chi.point[0] < 1000 || chi.point[1] < 1000 || chi.point[2] < 1000) {
			chi.user(dex);
			chi.computer1();
			chi.computer2(com);
		
		}
		System.out.println("=================결과===================");
		System.out.printf(" 플레이어는 %d번째 %d점 입니다\n", chi.count[0], chi.point[0]);
		System.out.printf(" 컴퓨터'1'는 %d번째 %d점 입니다\n", chi.count[1], chi.point[1]);
		System.out.printf(" 컴퓨터'2'는 %d번째 %d점 입니다\n", chi.count[2], chi.point[2]);
		System.out.println("=======================================");

		if (chi.count[0] < chi.count[1] && chi.count[0] < chi.count[2]) {
			System.out.println("플레이어의 승리입니다.");
		} else if (chi.count[1] < chi.count[0] && chi.count[1] < chi.count[2]) {
			System.out.println("컴퓨터1의 승리입니다.");
		} else if (chi.count[2] < chi.count[0] && chi.count[2] < chi.count[1]) {
			System.out.println("컴퓨터2의 승리입니다.");
		} else {
		    System.out.println("공동 승리 또는 무승부입니다.");
		}
		
		
		
		
		

	}

}
