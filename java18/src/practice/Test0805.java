package practice;

public class Test0805 {

	public static void main(String[] args) {
		
		int result = solution(5,7);
		System.out.println(result);

	}
	
	
	static int solution(int a, int b) {
		int result = 0;
		int[] arr1 = new int[15];
		int[] arr2 = new int[15];
		
		arr1[0] = a;
		arr2[0]	= b;
		
		for(int i = 1; i <= arr1.length; i++) {
			for(int j = 1; j<= arr1.length; j++) {
				if(arr1[0]*i == arr2[0]*j) {
					result = arr1[0]*i;
					return result;
				
				}
			}
			
		}
		return result;
	}

}
