package practice.test0715;

public class DiceMake_ver2 extends DiceMake {
	
	//Dice1~5까지있는 클래스를 상속받으며
	//추가적으로 Dice6을 만듬
	//해당 클래스에는 다이스 1 ~ 6 까지가 입력되어있음
	
	public int Dice6() {
		
		int d6[] = {5,6,7,8,9,10,11,12};
		int index = r.nextInt(8);
		int dice6 = d6[index];
		return dice6;
		
	}
	
	
	

}
