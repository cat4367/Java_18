package chapter06;

class Student{
	String name;
	String tel;
	
	int korea;
	int english;
	int math;
	// Student(){}					//아무것도 없을시 기본 생성자    클래스 하나에 생성자는 여러개생산가능
	Student(String inputName){		//생성자 만들때 이름을 입력하라
		this.name = inputName;		//'this'는 클래스 안의 변수를 가리킴 거기에다 'inputName'을 대입
	}
	
	double average() {
		double average = ((double)this.korea + (double)this.math + (double)this.english) / 3 ;
		return average;				// 'return' 밖으로 내보내는거
	}
}


public class exam06_1 {
	
	private String studentName;

	exam06_1(){}
	exam06_1(String name){
		this.studentName = name;
	}

	public static void main(String[] args) {
		Student std1 = new Student("홍길동");
		Student std2 = new Student("김영희");
		System.out.println(std1.name);
		System.out.println(std2.name);
		
		std1.korea = 90;
		std1.math = 85;
		std1.english = 95;
		
		System.out.println(std1.average());
		
		  



	}

}
