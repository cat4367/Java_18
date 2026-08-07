package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Test0805 {

	public static void main(String[] args) {

		int[] list = { 4, 6, 8, 14, 20, 3, 22 };

		System.out.println(wee(list[0], list[1]));
		System.out.println(bai(list[0], list[1]));

		int result = list[0];

		for (int i = 1; i < list.length; i++) {
			result = bai(result, list[i]);

		}
		System.out.println(result);

	}

	static int wee(int a, int b) {

		while (b != 0) {
			int c = a % b;
			a = b;
			b = c;

		}

		return a;
	}

	static int bai(int a, int b) {
		return a * b / wee(a, b);
	}

}
