package test.main;

import java.io.InputStream;
import java.util.Scanner;

public class MainClass03 {

	public static void main(String[] args) {
		/*
		 * 	System 클래스의 in 이라는 필드에는 콘솔창으로 부터 입력 받을수 있는
		 * 	객체의 참조값이 들어 있다.
		 * 	in 의 type 은 InputStream 이다.
		 * 	Scanner 클래스의 생성자는 아래와 같은 모양의 생성자가 있다.
		 * 	Scanner(InputStream is)
		 * 	따라서 아래의 코드는 콘솔창으로 부터 입력받을수 있는 Scanner 객체가 생성된 것이다.
		 */
		System.out.println("문자열 입력:");
		
//		public class Scanner{
//			생성자의 모양
//			public Scanner(InputStream is) {
//				이객체로 부터 문자열을 읽어들일 준비를 함!!
//			}
//		}
		//InputStream is =System.in;
		//InputStream 객체의 참조값을 Scanner 클래스의 생성자에 전달해서 객체 생성
		Scanner scan = new Scanner(System.in); //용도에 맞게끔 스캐너로 읽어들인다.
		
		String line = scan.nextLine(); //읽어들인 문자열 리턴 input 입력 output 출력 i o
		
		System.out.println("입력한 문자열:"+line);
	}
}
