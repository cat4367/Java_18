package chapter04;

public class exam04 {

	public static void main(String[] args) {
		// i는 단수
		for(int i = 2; i <= 9; i++) {
			// j는 i단에 곱해지는 수(1~9)
			for(int j = 1; j<= 9; j++) {
//				System.out.println(i + "x" + j + "=" + (i * j));
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//				System.out.println("i : " + i + " / j : " + j);
				for(int k = 1; k<= 9; k++) {
					System.out.printf("%d x %d x %d = %d\n",i,j,k,i*j*k);
				}
			}
		}
		
		
	

	}

}
