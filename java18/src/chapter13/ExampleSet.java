package chapter13;

import java.util.*;

public class ExampleSet {

	public static void main(String[] args) {
		//Iterator 내용물을볼때 자주쓰였음 588p
		Set<String> set = new HashSet<>();

		set.add("안녕하세요");
		set.add("여기는");
		set.add("IT06실입니다.");
		
		//set 삭제
		set.remove("여기는");
		
		set.add("사과");
		set.add("바나나");
		set.add("포도");
		
		//set에 있는 내용물을 본다. set은 순서가 없음
		Iterator<String> iterator = set.iterator();
		
		//몇개인지 모를때 While문 사용 hasNext(다음이 있을때)
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("포도"))
				iterator.remove();
			System.out.println("Set에 들어있는 데이터 : " + str);
		}
		
		
	}

}
