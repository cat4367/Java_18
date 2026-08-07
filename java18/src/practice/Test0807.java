package practice;

import java.util.ArrayList;
import java.util.List;

public class Test0807 {

	public static void main(String[] args) {
		
		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };
		
		
		
		System.out.println(solution(arr));

	}
	static List<Integer> solution(int a[]) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i <a.length; i++) {
			if(list.isEmpty() || list.get(list.size() - 1) != a[i]) {
//				빈 리스트에 처음 숫자를 채우고 리스트의 앞자리와 추가할 숫자를 비교해서 같으면 'if'에서 걸러지고 다르면 추가가되어서 중복이 사라짐
				list.add(a[i]);
				
			}
			
		}
//		int[] a1 = new int[list.size()];
//		for(int i = 0; i < list.size(); i++) {
//			a1[i] = list.get(i);
//		}
		
		return list ;

	}

}
