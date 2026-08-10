package practice;

import java.util.List;

public class Test0807_2 {

	public static void main(String[] args) {
		Test0807Method load = new Test0807Method();

		load.msg();
		List<String> result = load.type(load.n);

		System.out.println(result);

		int cnt = 0;
		String last = "";

		for (int i = load.p - 1; i < result.size(); i += load.m) {
			last += result.get(i);
			cnt++;
			
			if(cnt == load.t) break;
		}

		System.out.println(last);

	}

}
