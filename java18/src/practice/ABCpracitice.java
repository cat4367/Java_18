package practice;

public class ABCpracitice {
	public static void main(String[] args) {
		Student student1 = new Student("김자바");
		Student student2 = student1;
		student2.name = "이자바";
		System.out.println(student1.name);
		
		System.out.println("==============================");
		new Member();
		System.out.println();
		System.out.println("==============================");
		
		try {
			int number = Integer.parseInt("Java");
			System.out.println(number);
		} catch (NumberFormatException e) {
			System.out.println("변환 오류");
		} finally {
			System.out.println("프로그램 종료");
		}
		System.out.println("==============================");
		int[] arr = {1,2,3,4,5,6}; 
		System.out.println(average(arr));
		
	}
	public static double average(int[] scores) {
		int sum = 0;
		for(int i= 0; i < scores.length; i++) {
			sum += scores[i];
		}
		return (double)sum / scores.length;
	}

}

class Student {
	String name;

	Student(String name) {
		this.name = name;
	}
}
class Member{
	Member(){
		this(10);
		System.out.print("A");
	}
	Member(int number){
		System.out.print(number);
	}
}
