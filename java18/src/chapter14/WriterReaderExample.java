package chapter14;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class WriterReaderExample {
	public static void main(String[] args) throws Exception {
//		Writer wt = new FileWriter("C:/Users/kj/Desktop/정형민/test.txt");

		// 한글자씩 입력하기 (텍스트 파일)
//		char a = 'A';
//		char b = 'B';
//		char c = 'C';

//		wt.write(a);
//		wt.write(b);
//		wt.write(c);

		// 배열을 이용해서 한글자씩 넣기
//		char[] charArry = {'H','E','L','L','O'};
//		
//		wt.write(charArry, 1, 2);

		// 스트링을 이용해서 넣기
//		String str = "Hello Java!";
//
//		wt.write(str, 1, 5);
//
//		wt.flush();
//		wt.close();

//		-------------------------------------------------------------------------------------

		Reader rd = new FileReader("C:/Users/kj/Desktop/정형민/test.txt");

		String str1 = "";

//		//한글자씩 가져오기
		while (true) {
			int data = rd.read();
			if (data == -1)
				break;
			str1 += String.valueOf((char) data); // 빈칸 str1에 하나씩 불러와서 덧붙이는 느낌 문자열에 +(연결)연산 사용
			System.out.println((char) data);
		}
		System.out.println(str1);

//		char[] buffer = new char[100];
//		
//		while(true) {
//			int readCharNum = rd.read(buffer,0, 100);
//			if(readCharNum == -1) break;
//			for(int i = 0; i <readCharNum; i++) {
//				System.out.println(buffer[i]);
//			}
//		}

//		for(char c : buffer) {
//			System.out.println(c);
//		}

//		int readCharNum2 = rd.read(buffer, 0, 100);
//		
//		if (readCharNum2 != -1) {
//			for (int i = 0; i < readCharNum2; i++) {
//				System.out.println(buffer[i]);
//
//			}
//		}

		rd.close();

	}
}
