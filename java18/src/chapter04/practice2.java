package chapter04;

public class practice2 {

	public static void main(String[] args) {

		
		int a=2, b=-3, c=5, d=-7, e=11;
		double d1, d2, d3, d4, d5;
		
		d1 = a/b/c;
		/*	2 / -3 = 0.666666....
		 *	0.66666 / 5 = 0.1333333...
		 *	정수값끼리 먼저 연산되어서 '0'만남았음
		 *	이걸 실수값으로 바꾸면 '0.0'이 됩니다.
		 */	
//		int x = 0;
//		double y = x;
//		System.out.println(y);
		d2 = 7+c*--d/e;
		/*	연산 --d 를 계산하여 -8,
		 *	c*-8 = -40
		 *  -40/e = -3.63636363 인데 정수끼리의 계산이라 '-3'만 남음
		 *  7+(-3) = 4
		 */
		d3 = 2*a%-b+c+1;
		/*	2*a = 2*2 = 4
		 *  4%-b = 4%-(-3) = 1
		 *  1+c+1 = 1+5+1 = 7
		 *  7읠 실수 7.0
		 */
//		double x = 4%-(-3);
//		System.out.println(x);
		d4 = 39/-++e-+29%c;
		/*	++e = 1+11 = 12
		 * 	39/-12 = -3.25 -> int이므로 -3
		 * 	29%c = 29%5 = 4
		 * 	-3-(4) = -7 
		 * 	-7의 실수 -7.0
		 */
//		int x = ++e;
//		int y = 39/-12-+29%c;	
//		System.out.println(y);
		d5 = a+=b+=c+=1+2;
		/*  1+2 = 3
		 * 	c+=3 = 5+=3 = 8
		 * 	b+=8 = -3+=8 = 5
		 * 	a+=5 = 2+=5 = 7
		 * 	7의 실수 7.0
		 */
//		int x = c+=3;
//		System.out.println(x);
//		int y = (b+=x);
//		System.out.println(y);
//		int z = (a+=y);
//		System.out.println(z);
		System.out.println(a);
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("d3 : " + d3);
		System.out.println("d4 : " + d4);
		System.out.println("d5 : " + d5);


	}

}
