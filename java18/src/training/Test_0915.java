package training;

import java.util.Scanner;

public class Test_0915 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%d",'A'+3);
		System.out.println();
		System.out.printf("%s",'A'+3);
		System.out.println();
		System.out.printf("%c",'A'+3);

//		System.out.printf("%d","A"+3);	오류
		System.out.println();
		System.out.printf("%s","A"+3);
		System.out.println();
//		System.out.printf("%c","A"+3);	오류
	
		int a ='A';
		System.out.printf("%c",a);
		
		System.out.println("");
		
		System.out.printf("%.20f\n", 0.1f);
		
		int x = 10, y = 20;
		int z = (++x) + (y--);	// y--  :  y = y - 1  '20'
		
		System.out.println(x+","+y+","+z);
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * height)/(double)2;
		System.out.println(area);
		
//		byte vat = 200;
//		char var = 'AB';
		char var = 65;
//		long var1 = 50000000000;
//		float var1 = 3.14;
		double var1 = 100.1;
//		String var2 = "나의 직업은 "개발자"입니다.";
//		boolean var2 = 0;
//		int v2 = le2;
//		float = le2f;
//		double value = 2e-350;
		
		if('A' == 65) System.out.println("같다");
		
		a = 0;
		int cnt = 0;
		for(a=0; a<=10; a++) {
			a*=a;
			cnt++;
		}
		System.out.println(cnt);
		System.out.println(a);
		
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%3==0) {
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println(sum);
		
		int max = 0;
		int[] array = { 1, 5, 3, 8, 2};
		for(int i : array) {
			if(max < i) {
				max = i;
			}
		}
		System.out.println("max: " + max);
		
		int[][] array1 = {{95,86},{83,92,96},{78,83,93,87,88}};
		
		sum = 0;
		double avg = 0.0;
		cnt = 0;
		
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array1[i].length; j++) {
				cnt++;
				sum = sum + array1[i][j];
				
			}
		}
		avg = sum/(double)cnt;
		
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}


}
