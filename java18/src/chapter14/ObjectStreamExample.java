package chapter14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

public class ObjectStreamExample {

	public static void main(String[] args) throws Exception {
		writeList();
		List<Borad> list = readList();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (Borad board : list) {
			System.out.println(board.getBno() + "\t" + board.getTitle() + "\t" + board.getContent() + "\t"
					+ board.getWriter() + "\t" + sdf.format(board.getDate()));
		}

	}

	public static void writeList() throws Exception {
		List<Borad> list = new ArrayList<>();

		list.add(new Borad(1, "제목1", "내용1", "글쓴이1", new Date()));
		list.add(new Borad(2, "제목2", "내용2", "글쓴이2", new Date()));
		list.add(new Borad(3, "제목3", "내용3", "글쓴이3", new Date()));

		FileOutputStream fos = new FileOutputStream("C:/Users/kj/Desktop/정형민/board.db");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		oos.flush();
		oos.close();

	}

	public static List<Borad> readList() throws Exception {

		FileInputStream fis = new FileInputStream("C:/Users/kj/Desktop/정형민/board.db");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Borad> list = (List<Borad>) ois.readObject();

		return list;
	}

}
