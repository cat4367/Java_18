package chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class SteamExample {

	public static void main(String[] args) throws Exception{
//		InputStream is = System.in;
//		InputStreamReader reader = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(reader);
		write("안녕하세요 지금은 11시 31분입니다.");
		String data = read();
		System.out.println(data);
	}
	
	public static void write(String str) throws Exception{		//write 메소드의 파라미터에 문자열을 입력한걸 txt파일을 만듬
		FileOutputStream fos = new FileOutputStream("C:/Users/kj/Desktop/정형민/testStream.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		writer.write(str);
		writer.flush();
		writer.close();
	}
	
	public static String read() throws Exception{			
		FileInputStream fis = new FileInputStream("C:/Users/kj/Desktop/정형민/testStream.txt");
		Reader reader = new InputStreamReader(fis);
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		String data = new String(buffer, 0, readCharNum);
		return data;
	}

}
