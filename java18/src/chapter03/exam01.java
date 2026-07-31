package chapter03;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		/*
		 * 연산자란?? 128p
		 *       a       +       b
		 *   피연산자(항)  연산자    피연산자(항)
		 * 
		 * <연산자>
		 * 단항연산자 : 항이 한개인 식
		 *  ex)a++, !a ...
		 * 이항연산자 : 항이 두개인 식
		 *  ex)a + b, a - b ...
		 * 삼항연산자 : 항이 세개인 식
		 *  ex) x == 3 ? a : b
		 */
		//증감연산자 ++ : +1,  -- : -1
		int a = 100;
		int b1 = ++a; // ++를 먼저 계산한 후 매입한다
		int b2 = a++; // 대입 하고나서 ++를 계산한다
		
		System.out.println("a : " + a + " / b1 : " + b1 + " / b2 : " + b2);
		
		
		int x = 10;
		int y = 20;
		int result = ++x + y--;
		System.out.println("x : " + x);
		System.out.println("y : " + y);
		System.out.println("result : " + result);
		
		// 논리 부정 연산자   !(값) : true는 false, false는 true로 바꿈
		boolean r = x > y;
		System.out.println("r : " + r);
		boolean r2 = !r;
		System.out.println("r2 : " + r2);
		
		// 이항연산자
		// 산술연산자 : 사친연산 (+ - * / %) % : 나머지 계산
		
		int p = 15 % 4; // 15를 4로 나눈 나머지 : 3
		System.out.println("p : " + p);
		
		// 결합연산자(문자열) : +
		// 문자열에서 + 기호 사용시 연결시켜주는 연산자이다
		String str = "x : " + x + y;
		System.out.println(str);
		
		// 비교연산자 : == != >= <= > < → 결과 : true / false
		boolean b = x > y;
		System.out.println("b : " + b);
		
		String str1 = "Apple";
		String str2 = "I like Apple";     //다른공간에 있는 Apple을 가져오려고 다른내용을 저장함
		String str3 = str2.split(" ")[2]; //[2]는 문장열 2번째    I[0] / like[1] /Apple[2]
		System.out.println(str3);
		
		System.out.println(str1 == str3);		//메모리 주소 비교
		System.out.println(str1.equals(str3));  //내용 비교  .equals
		
		// 논리연산자 : && || & | ^ !    boolean   (&&, ||[앞조건이 안맞으면 바로끝냄] 가 &, |[앞 뒤 둘다 확인] 보다 효율적임)
		// 논리곱(AND) : && & → 모두 true이면 true  그리고
		boolean ba = 10 < 20 && 5 < 3;  
		System.out.println("ba : " + ba);
		
		// 논리합(OR) : || | → 하나라도 true 이면 true
		boolean bb = 10 < 20 || 5 < 3;
		System.out.println("bb : " + bb);
		
		// 베타적 논리합(XOR) : ^ → 두개의결과가 같으면 false, 다르면 true
		
		
		int i = 5;
		int j = 8;
		if (i % 2 == 0 && j % 2 == 0)
		{System.out.println("i와 j는 모두 짝수입니다.");}
		
		if (i % 2 == 0 || j % 2 == 0)
		{System.out.println("i와 j는 짝수입니다.");}
		
		
		int k = 3;
		int l = 5;
		l += k;
		System.out.println("l : " + l);
		l = l + k;
		System.out.println("l : " + l);
		
		/*
		 * 복합 대입 연산자
		 *  += : 더해서 대입   l = l + k
		 *  -= : 빼서 대입    l = l - k
		 *  *= : 곱해서 대입   l = l * k
		 *  /= : 나눠서 대입   l = l / k
		 *  %= : 나눈 나머지를 대입 l = l % k
		 */
		
		//삼항 연산자

		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / 30;
		System.out.println(pencilsPerStudent);
		int pencilsLeft = pencils % 30;
		System.out.println(pencilsLeft);
		
		int u = 20;
		boolean stop = 20 == u;
		while(stop == false) {System.out.println("*");}
		
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / (double)var2;
		System.out.println(var3);
		double var4 = var3 * var2;
		System.out.println(var4);
		
		int value = 356;
		System.out.println(value - value%100);
	
		float var5 = 10f;
		float var6 = var5 / 100;
		System.out.println(var6);
		if(var6 == 0.1f) {System.out.println("10%입니다.");
		} else {System.out.println("10%가 아닙니다");}		
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom)* height / 2f);
		System.out.println(area);
		
		Scanner scanner = new Scanner(System.in);
		
		//첫 번째 수 : 7.3
		//두 번째 수 : 2.5
		
		//Integer.parseInt(str3)
		int ba1 = 10;
		int ba2 = 3;
		int ba3 = 14;
		String ba5 = ba2 +"." + ba3;
		
		Double.parseDouble(ba5);
		//double ba4 = ba1 * ba1 * ba5;
		//System.out.println("원의넓이 : " + ba4);
		
		
		int m = 10;
		int n = 5;
		System.out.println( (m>7) && (n<=5));
		System.out.println( (m%3 ==2 ) || (n%2 != 1)); // n%2 = 1 이므로 1과 같음
		
		
		int val = 0;
		val += 10;
		System.out.println(val);
		val -= 10;
		System.out.println(val);
		val *= 10;
		System.out.println(val);
		val /= 10;
		System.out.println(val);
		
		
		int score = 85 ;
		String aaa = (!(score>90)) ? "가" : "나";
		System.out.println(aaa);
		
		
		
		
		
		
		
	}

}
