package practice.test0715;

import java.util.Random;


public class DiceMake implements Dice {
	//인터페이스를 상속 받을땐 implemnets(여러 인터페이스 상속가능)
	//클래스를 상속 받을땐 extends를 사용
	//Dice1~5까지 메소드가 입력되며 해당 메소드에 새로운 함수를 만들거나 수식을 입력하여 부여함.
	Random r = new Random();

	@Override
	public int Dice1() {
		//첫번째 주사위는 1,2,3,4,5,6 값이 있는데
		//자릿수만큼의 숫자중 랜덤숫자를 하나 뽑아 그 자릿수를 인덱스해서 dice1의 값을 지정해줌
		//그 결과를 가져옴
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
		
		int d5[] = {1,2,3,4,5,6,7,8,9,10,11,12};
		int index = r.nextInt(12);
		int dice5 = d5[index];
		return dice5;
		
	}


}
