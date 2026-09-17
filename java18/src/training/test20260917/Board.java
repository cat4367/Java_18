package training.test20260917;

public class Board {
	
	Board(){};
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	Board(String title, String content){
		this(title, content, "로그인한 회원아이디", "현재 컴퓨터 날짜", 0);
	}
	
	Board(String title, String content, String writer){
		this(title, content, writer, "현재 컴퓨터 날짜", 0);
	}
	
	Board(String title, String content, String writer, String date){
		this(title, content, writer, date, 0);
	}
	
	Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		
	}
	
	Board borad1 = new Board("제목","내용");
	Board borad2 = new Board("제목","내용","홍길동");
	Board borad3 = new Board("제목","내용","홍길동","2026-09-17");
	Board borad4 = new Board("제목","내용","홍길동","2026-09-17",0);
	
	boolean login (String id, String password) {
		boolean result = true;
		if(id.equals("hong") && password.equals("12345")) {
			result = true;
		} else result = false;
		
		return result;
	}
	
	void logout (String id) {
		if(id.equals("hong"))
			System.out.println("로그아웃 되었습니다.");
	}
	
	static void println(int a) {System.out.println(a);}
	void println(boolean a) { System.out.println(a);}
	void println(double a) {System.out.println(a);}
	void println(String a) {System.out.println(a);}
	
	
	;

}
