package chapter14;

import java.io.*;

public class SystemExample {

	public static void main(String[] args) throws Exception{
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);	//인풋스트림을 리더모양으로 바꿈
		BufferedReader br = new BufferedReader(reader);
		
		while(true) {
			System.out.print("입력하세요: ");
			String lineStr = br.readLine();		//엔터된 부분까지 읽어옴
			if(lineStr.equals("q")||lineStr.equals("quit")) break;
			System.out.print("입력된내용 : " + lineStr);
			System.out.println();
		}
		
		br.close();
		

	}

}
