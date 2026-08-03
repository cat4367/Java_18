package practice;

public class test0803 {

	public static void main(String[] args) {

		int test[] = { 2, 3, 3, 5 };
		int test2[] = { 9, 1, 5, 3, 6, 2 };
		
		solution(test);
		System.out.println("====================");
		solution(test2);

	}

	public static void solution(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					flag = true;
					System.out.print(arr[j] + ",");
					break;
				}
			}
			if (!flag) {
				System.out.print(-1 + ",");
			}
		}
		System.out.println();
	}

}
