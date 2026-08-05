package practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Test0805_2 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		Set<Integer> pop = new HashSet<Integer>();
		
		while(pop.size() < 6) {
			pop.add(r.nextInt(1,46));
		}
//		System.out.println(pop);
		List<Integer> list = new ArrayList<>(pop);
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		
	}

}
