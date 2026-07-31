package chapter11;

import java.util.Date;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
			// System.exit(0);
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		} else {
			System.out.println("obj1과 obj3은 동등하지 안습니다.");
		}

		System.out.println(obj1.toString());
		System.out.println(System.currentTimeMillis());

		Date d = new Date(); // 날짜 관련 클래스 불러오기
		System.out.println(d.toLocaleString());
		// 방법 1
		Class clazz = Member.class;
		// 방법 2
//		Class clazz = Class.forName("chapter11.Member");
		// 방법 3
//		Member m = new Member();
//		Class clazz = m.getClass();

		// 패키지 + 클래스
		System.out.println(clazz.getName());
		// 클래스
		System.out.println(clazz.getSimpleName());
		// 패키지
		System.out.println(clazz.getPackage().getName());

//		String str = "Hello Java"
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str = new String(bytes);
		System.out.println(str);

		String str2 = new String(bytes, 6, 4); // bytes의 6번째부터 4글자
		System.out.println(str2);

		// 문자열(String)에서 해당 index에 있는 글자를 char형으로 변환시큰 기능
		char c = str.charAt(3);
		System.out.println(c);

		// 두 문자열(String)의 내용이 동일(동등) 한지 비교
		boolean b = str.equals(str2);
		System.out.println(b);

		byte[] bytess = str.getBytes();

		// 향상된 for문
		for (byte bt : bytess) {
			System.out.print(bt + " ");
		}
		System.out.println();
		// 일반 for문
		for (int i = 0; i < str.length(); i++) {
			System.out.print(bytess[i] + " ");
		}
		System.out.println();

		// 해당 문자열에 ()안에 있는 문자열이 몇번째에 있는지 보여줌
		int io = str.indexOf("z");
		System.out.println(io);

//		str = "Hello Cat!";

		if (str.indexOf("Cat") > -1) {
			System.out.println("이 문자열은 Cat을 포함합니다.");
		} else {
			System.out.println("이 문자열은 Cat을 포함하지 않습니다.");
		}

		// 문자열이 몇글자인지 보여줌
		System.out.println(str.length());

		// 문자열 치환 (찾아서 바꾸는 기능)
		System.out.println(str);
		String str3 = str.replace("Java", "Cat");
		System.out.println(str3);

		// 문자열 자르기
		// 파라미터 1개 : 해당 인덱스부터 끝까지
		String str4 = str.substring(6);
		System.out.println(str4);
		// 파라미터 2개 : 파라미터1 인덱스부터 파라미터2 인덱스 앞까지
		String str5 = str.substring(0, 5); // 0번터 4번까지
		System.out.println(str5);

		// 소문자
		System.out.println(str.toLowerCase());
		// 대문자
		System.out.println(str.toUpperCase());

		// 문자열의 앞뒤 공백을 제거
		String s = " Hello Cat!  ";
		System.out.println(s.length());
		System.out.println(s + "!");
		System.out.println(s.trim().length());
		System.out.println(s.trim() + "!");

		// 기본타입 형대 데이터를 String 형태로 변경
		int num = 10;
		String s1 = String.valueOf(num);
		System.out.println(s1);

		// 포장 클래스
		int a = 10; // 미포장상태 > 변수

		// 포장상태(박싱) > 객체형태
		Integer aint = new Integer(10);
		Integer aint2 = 10;

		int a2 = aint2.intValue(); // 포장해제(언박싱)후 변수에 저장

		// String > 해당 자료형으로 변경
		String s2 = "123";
		// int형으로 변환
		int a3 = Integer.parseInt(s2);
		// double형으로 변환
		double d1 = Double.parseDouble(s2);
		System.out.println(a3);

		int x = 10, y = 10;
		if (x == y) {
			System.out.println("x와 y는 같습니다.");
		} else {
			System.out.println("x와 y는 같지 않습니다.");
		}

		Integer x1 = new Integer(10);
		Integer y1 = new Integer(10);
		System.out.println(x1 + "/" + y1);

		// 방법1 : equals() 사용해서 비교
		if (x1.equals(y1)) {
			System.out.println("x와 y는 같습니다.");
		} else {
			System.out.println("x와 y는 같지 않습니다.");
		}

		// 방법2 : 언박싱 후 비교
		if (x1.intValue() == y1.intValue()) {
			System.out.println("x와 y는 같습니다.");
		} else {
			System.out.println("x와 y는 같지 않습니다.");
		}
		
		int[] arrayNum = {76, 23, 657, 493, 19493, 230, 9, 234, 23, 12, 556, 49, 56};
		arrayNum[6] = 999;
		arrayNum[9] = 1212;
		arrayNum[8] = 456;
		
		//배열 > 기본기능이없어 만들어야함 'minNum'
		System.out.println(minNum(arrayNum));
		
		//기본기능에 있지만 2개밖에 비교못함
		System.out.println(Math.min(arrayNum[0],arrayNum[1]));
		
		//랜덤 숫자 리턴하지만 소수점출력
		System.out.println(Math.random());
		
		
		
		
		
		
		
		
		
		

	}
	public static int minNum(int[] array) {		//배열에서 여러가지 수중에서 가장 작은 수를 찾는 함수
		
		int min = array[0];
		
		for(int a : array) {
			if(min > a) {
				min = a;
			}
		}
		
		return min;
	}

}
