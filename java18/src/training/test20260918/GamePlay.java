package training.test20260918;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GamePlay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rule setting = new Rule();		
		String[][] array = setting.FrameMake();
		int cnt = 0;
		List<String> list = new ArrayList<>(Arrays.asList("A","B","C","D","E","F","G","H","I","J","K"));
		System.out.println("-------------------------------------------");
//		System.out.println(array[0][0]);
		while(cnt < 5) {
			System.out.println(list + "중 하나를 입력하세요");
			String inputWard = sc.nextLine().toUpperCase();
			Iterator<String> it = list.iterator();
	        while (it.hasNext()) {
	            String item = it.next();
	            // 리스트의 요소와 대문자로 변환된 입력값을 비교
	            if (item.equals(inputWard)) {
	                it.remove(); // 안전하게 현재 요소 삭제
	            }
	        }

	        System.out.println("결과 리스트: " + list);
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("----------------------------------------");
			setting.FrameImg(array);
			cnt++;
			
			System.out.println("[" +(5-cnt)+ "]더 제거 할 수 있습니다.");
			
		}
	}

}
