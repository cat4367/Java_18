package chapter13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;



public class ExampleMap {

	public static void main(String[] args) {
		
		Map<String, Member> testMap = new HashMap<>();
		testMap.put("È«±æµ¿°´Ã¼", new Member("È«±æµ¿", 30));		//º¯¼ö.put(Å°°ª , ¹ë·ù°ª);
		testMap.put("±è¿µÈñ°´Ã¼", new Member("±è¿µÈñ", 25));
		testMap.put("¹ÚÃ¶¼ö°´Ã¼", new Member("¹ÚÃ¶¼ö", 32));
		
		System.out.println(testMap.get("±è¿µÈñ°´Ã¼").age);		//testMap[º¯¼ö].get[°¡Á®¿Â´Ù]("±è¿µÈñ°´Ã¼")[Å°°ª].age[MemberÅ¬·¡½ºÀÇ ÆÄ¶ó¹ÌÅÍ]
		
		Map<String, Integer> memberList = new HashMap<>();
		memberList.put("È«±æµ¿", 30);
		memberList.put("±è¿µÈñ", 25);
		memberList.put("¹ÚÃ¶¼ö", 32);
		memberList.put("½Å¿ë±Ç", 47);
		memberList.put("¾âÄÚ", 23);
		memberList.put("±è¹Î¼ö", 12);
		
		
		System.out.println(memberList.get("¹ÚÃ¶¼ö"));
		System.out.println("memberList Å©±â : " + memberList.size());
		//Å°°ªÀÌ Áßº¹ÀÏ¶§ ¾÷µ¥ÀÌÆ®µÊ   Ãß°¡x
		memberList.put("¹ÚÃ¶¼ö", 45);
		
		System.out.println(memberList.get("¹ÚÃ¶¼ö"));
		System.out.println("memberList Å©±â : " + memberList.size());
		System.out.println(memberList.keySet());
		
		Iterator<Entry<String, Integer>> ir = memberList.entrySet().iterator();
		while (ir.hasNext()) {
			Entry<String, Integer> temp = ir.next();
			if(temp.getKey().indexOf("±è") > -1) {
				System.out.println("ÀÌ»ç¶÷Àº ±è¾¾´Ù! ÀÌ¸§ : " + temp.getKey());
			}
		}
		
		memberList.remove("±è¿µÈñ");
		System.out.println("memberList Å©±â : " + memberList.size());
	}

}
