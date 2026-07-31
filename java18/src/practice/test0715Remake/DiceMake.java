package practice.test0715Remake;

import java.util.Random;

public class DiceMake implements Dice {
	
	Random r = new Random();
	@Override
	public int Dice1() {

		int d1[] = {1,2,3,4,5,6};			
		int index = r.nextInt(6);
		int dice1 = d1[index];
		return dice1;
		
	}

	@Override
	public int Dice2() {
		
		int d2[] = {1,1,1,1,6,6};
		int index = r.nextInt(6);
		int dice2 = d2[index];
		return dice2;
	}

	@Override
	public int Dice3() {
		
		int d3[] = {3,3,3,4,4,4};
		int index = r.nextInt(6);
		int dice3 = d3[index];
		return dice3;
	}

	@Override
	public int Dice4() {
		
		int d4[] = {2,2,2,5,5,5};
		int index = r.nextInt(6);
		int dice4 = d4[index];
		return dice4;
	}

	@Override
	public int Dice5() {
		//Dice1의 내용과 같은데 자릿수가 12자리의 주사위니까 랜덤으로 12자릿수를 뽑는게 다름
		
		int d5[] = {1,2,2,2,3,3,3,4,4,4,4,12};
		int index = r.nextInt(12);
		int dice5 = d5[index];
		return dice5;
		
	}
	public int Dice6() {
		
		int d6[] = {1,2,3,4,9,10,11,12};
		int index = r.nextInt(8);
		int dice6 = d6[index];
		return dice6;
		
	}
	

}
