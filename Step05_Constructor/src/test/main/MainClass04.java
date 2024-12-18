package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass04 {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("src/test/mypac/memo.txt");
		
//		public class Scanner{
//			public Scanner(File file) {
//				해당 File 객체에서 문자열을 읽어들일 준비를 함 !!
//			}
//		}
		Scanner scan = new Scanner(f);
		
		String line = scan.nextLine();
		
		System.out.println("memo.txt 파일의 첫번째줄:"+line);
	}
}
