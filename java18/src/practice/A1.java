package practice;

public class A1 {
	
	static void printNumber(int number) {
		if (number == 0) {
			return;
		}
		System.out.println("up"+number);
		printNumber(number - 1);
		System.out.println("down"+number);
	}

	public static void main(String[] args) {
		printNumber(3);

	}

}
