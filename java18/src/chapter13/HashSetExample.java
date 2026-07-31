package chapter13;

import java.util.*;
import java.util.Set;

import chapter13.Member;

public class HashSetExample {
	
	public static void main(String[] args) {
		
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("È«±æµ¿",30));
		set.add(new Member("È«±æµ¿",30));
		
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + set.size());
		
	}

}
