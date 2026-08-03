package practice;

public class test0803_2 {

	public static void main(String[] args) {

		int[][] test = { { 2, 2 }, { 1, 4 }, { 3, 2 }, { 3, 2 }, { 2, 1 } };

		solution(test);
	}

	public static void solution(int arr[][]) {

		int[] re = new int[arr.length];
		int[] rank = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			re[i] = arr[i][0] + arr[i][1];
			System.out.printf("%d = %d + %d \n", re[i], arr[i][0], arr[i][1]);
		}
		for (int j = 0; j < re.length; j++) {
			int gr = 1;
			for (int k = 0; k < re.length; k++) {
				if (re[j] < re[k]) {
					gr++;
				}
			}
			rank[j] = gr;

		}
		for (int i = 0; i < re.length; i++) {
			System.out.println(rank[i]);
		}

	}

}
