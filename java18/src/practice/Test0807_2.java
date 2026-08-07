package practice;

import java.util.Scanner;

public class Test0807_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======N진수 게임=======");
		System.out.println("몇 진법 게임을 할껀가요? (ex 2, 8, 10, 16)");
		System.out.print(">>>>");
		String n = sc.nextLine();
		System.out.println("정답을 몇번 말할껀가요? (ex 0 < x <= 1000)");
		System.out.print(">>>>");
		String t = sc.nextLine();
		System.out.println("플레이어 수는 몇명인가? (ex 2 <= x <= 100");
		System.out.print(">>>>");
		String m = sc.nextLine();
		System.out.printf("당신은 몇번째 차례인가? 1 <= x <= %s\n",m);
		System.out.print(">>>>");
		String p = sc.nextLine();
		System.out.println("=======설정 확인=======");
		System.out.printf("'%s'진법 게임을 선택했습니다.\n",n);
		System.out.printf("'%s'번 정답을 맞춰야합니다.\n",t);
		System.out.printf("'%s'명이 게임을 시작합니다.\n",m);
		System.out.printf("'%s'번째 차례에 정답을 맞춥니다.\n",p);
		
		
		
		
		
		String a = "";
		while(a.length() != Integer.parseInt(t)) {
			
		}
		
		
		
		
		if(n.equals("2")) {
			String bin = Integer.toBinaryString(10);	
		}else if(n.equals("8")){
			String oct = Integer.toOctalString(10); 			
		}else if(n.equals("16")) {
			String hex = Integer.toHexString(10);			
		}
		
			
		

	}

}
