package chapter04;

public class practice3 {

	public static void main(String[] args) {
		
		
//		*
//		**
//		***
//		****
//		*****
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		2. 
//		*****
//		****
//		***
//		**
//		*
		
		for(int i = 5; i >= 0; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		3. 
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		
		for(int i = 1; i <= 5; i++) {
			for(int j =1; j <= (5-i); j++) {
				System.out.print(" ");
			}
			for(int k =1; k <= (2*i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		4. 
//		*********
//		 *******
//		  *****
//		   ***
//		    *
		
		for(int i = 1; i <=5; i++) {
			for(int j = 1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <=11-2*i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

//		5. 
//		  *
//		 ***
//		*****
//		 ***
//		  *
		
		for(int i = 1; i <=5; i++) {
			if(i <= 3) {
				for(int m = 1; m <= 3 - i  ; m++) {
					System.out.print(" ");
				}
				}else {
					for(int j = 1; j <= i - 3; j++) {
						System.out.print(" ");
					}					
				}
			if(i <= 3)	
				for(int k = 1; k <= 2*i-1; k++) {
					System.out.print("*");
				}else {
					for(int l = 1; l <= 11 - 2*i; l++) {
						System.out.print("*");
					}
				}
			System.out.println();
		}
		
//		6.
//		*****
//		 ***
//		  *
//		 ***
//		*****
		
		for(int i = 1; i <= 5; i++) {
			if(i <=3) {
				for(int j = 1; j <= i - 1 ; j++) {
					System.out.print(" ");
				}
				}else {
					for(int m = 1; m <= 9 - 2 * i; m++) {
						System.out.print(" ");
					}
				}
			if(i <=3) {
				for(int k = 1; k <= 7 - 2*i; k++) {
					System.out.print("*");
				}
			}else {
				for(int l = 1; l <= 2*i -5 ; l++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
//		7.
//		*      *******
//		**     ******
//		***    *****
//		****   ****
//		*****  ***
//		****** **
//		********
//		      ********
//		     ** ******
//		    ***  *****
//		   ****   ****
//		  *****    ***
//		 ******     **
//		*******      *
		
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= 7 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 8 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= 7; i++) {
			for(int j = 1; j <= 7 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for(int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 8 - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
