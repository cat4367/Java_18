package chapter02;

public class exam01 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int sum = a + b;
		int sum2 = (a * 10) + (b + 3);
		
		a = 50;// a = b; 를 이용할경우 교환이 안되고 a값이 사라진다
		
		int sum3 = a + b;
		
		System.out.println("sum : " + sum);
		System.out.println(sum2);
		
		System.out.println("sum : " + sum3);
		
		
		int x = 3;
		int y = 5;
		System.out.println("x : " + x + "/ y : " + y);
		int temp = x;
		x = y;
		y = temp;
		// 변수 교환
		System.out.println("x : " + x + "/ y : " + y);
		
		byte bt1 = 100;
		byte bt2 = -100;
		//byte bt3 = +-128; // 범위 벗어남
		short st1 = 128;
		short st2 = 30000;
		//short st3 = 1000000; // 범위 벗어남
		int it1 = 150000;
		int it2 = 95000000;
		//int it3 = 2200000000; // 범위 벗어남
		
		long ln1 = 100000000000L; //int 보다 큰숫자일시 L붙여야 오류안남
		
		char ch1 = 'A';
		char ch2 = 'B';
		System.out.println("ch1 : " + ch1);
		
		sum = a + (int)ch1;  // 형변환 알파벳을 숫자로 변환 (잘쓰진않는거같음)
		System.out.println("sume : " + sum);
		System.out.println((int)ch1);
		System.out.println((int)ch2);
		
		String str = "I Like Apple";
		System.out.println(str);
		// char '' 사용, String "" 사용
		
		
		String name = "정형민";
		String job = "학생";
		
		String str1 = "내 이름은 " + name + "이고요,\n직업은 " + job + "입니다";
		System.out.println(str1);
		
		String str2 = "정형민은 말을 했습니다.\"안녕하세요.\"";
		System.out.println(str2);
		
		String str3 = "정형민은 생각을 했습니다.\t\t\t'집에가고싶다...'";
		//"\t"사용하는 이유가 탭과 스페이스바 구분 및 확실하게 탭 개수를 알기위해
		System.out.println(str3);
		
		
		float num1 = 10.4f, num2 = 5.7f;
	
		//int div = num1 / num2;
		float div = num1 / num2;
		// int는 정수, float는 실수   "정수나누기 정수는 정수", "정수나누기 실수는 실수"
		System.out.println(div);
		
		double db1 = 3.14, db2 = 7.5;
		
		double dbsum = db1 + db2;
		
		System.out.println(dbsum);
	}

}
