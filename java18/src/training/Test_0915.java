package training;

public class Test_0915 {

	public static void main(String[] args) {
		System.out.printf("%d",'A'+3);
		System.out.println();
		System.out.printf("%s",'A'+3);
		System.out.println();
		System.out.printf("%c",'A'+3);

//		System.out.printf("%d","A"+3);	오류
		System.out.println();
		System.out.printf("%s","A"+3);
		System.out.println();
//		System.out.printf("%c","A"+3);	오류
	
		int a ='A';
		System.out.printf("%c",a);
		
		System.out.println("");
		
		System.out.printf("%.20f\n", 0.1f);
		
		int x = 10, y = 20;
		int z = (++x) + (y--);	// y--  :  y = y - 1  '20'
		
		System.out.println(x+","+y+","+z);
		
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = ((lengthTop + lengthBottom) * height)/(double)2;
		System.out.println(area);
		
		
	}


}
