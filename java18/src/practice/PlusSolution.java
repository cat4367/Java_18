package practice;

public class PlusSolution {

	public static void main(String[] args) {

		int a = 10;
		int b = 6;
		System.out.printf("%d - %d = %d\n",a,b,minus(10, 6));
		System.out.printf("%d * %d = %d\n",a,b,multi(10, 6));
		System.out.printf("%d / %d = %d\n",a,b,div(10,6));
		System.out.printf("%d %% %d = %d",a,b,minus(a, b));

	}
	static int minus(int a, int b) {
		
		int cnt = 0;
		while(a != b) {
			b++;
			cnt++;
		}
		
		return cnt;
	}
	static int multi(int a, int b) {
		
		int c = 0;
		for(int i = 1; i <= b; i++) {
			c = c + a; 
		}
		return c;
	}
	static int div(int a, int b) {
		
		int c = 0;
		int cnt = 0;
		while(a >= c) {
			c = c + b;
			cnt++;
		}
		cnt = cnt-1;
		return cnt;
	}

}
