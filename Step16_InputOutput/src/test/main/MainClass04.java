package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class MainClass04 {
	public static void main(String[] args) {
		//콘솔창에 출력할수 있는 객체의 참조값 얻어내기
		PrintStream ps=System.out;
		//PrintStream 객체의 참조값을 부모 type 변수에 담기
		//OutputStream 도 1byte 처리 스트림이다. (한글 처리 불가)
		OutputStream os = ps;
		//한글 불가능
		try {
			os.write(97);
			os.write(98);
			os.write(99);
			os.flush();//방출
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
