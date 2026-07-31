package chapter13;

import java.util.*;

public class ExampleList {

	public static void main(String[] args) {
		//ArrayList 와 LinkedList에 중간이나 맨앞에서 리스트추가를했을때 뭐가더 빠른지 비교  587p
		// *끝에있는 리스트를 추가삭제할경우 ArrayList가 빠름
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime-startTime) + " ns ");
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime-startTime) + " ns ");

	}

}
