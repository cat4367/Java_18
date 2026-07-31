package chapter14;

import java.io.File;

public class FileExample {

	public static void main(String[] args) throws Exception{
		
		String folderpath = "C:/Users/kj/Desktop/정형민/test/java/javapractice/";
		String filePath = folderpath + "test.txt";
		File file = new File(filePath);
		
		boolean isExist = file.exists();	//'exists'메서드는 파일이 있는지 없는지 여부를 확인하기위해서 사용
		System.out.println(isExist);
		
//		file.mkdirs();						//'mkdir'은 경로상에 폴더가 없을시 폴더를 만듬 + 's' 사용시 모든경로를 체크해서 폴더를 생성
		
//		file.createNewFile();				//경로상의 마지막에 파일을 생성
		
//		file.delete();						//대상 파일 삭제
		
//		boolean canRead = file.canRead();
//		System.out.println(canRead);		//파일의 속성 > 시스템 > 보안 > 사용권한 여부에따라 다름
//		
//		isExist = file.exists();			//'exists'메서드는 파일이 있는지 없는지 여부를 확인하기위해서 사용
//		System.out.println(isExist);
		
		String getFileName = file.getName();
		System.out.println(getFileName);
		
		String parentFolder = file.getParent();
		System.out.println(parentFolder);	// 파일이있는 폴더 경로
		
		String path = file.getPath();
		System.out.println(path);			// 파일까지의 경로
		
		System.out.println(file.isDirectory());		//폴더인지의 여부
		System.out.println(file.isFile());	// 파일인지의 여부
		System.out.println(file.length());	// 파일의 크기
		
		
	}

}
