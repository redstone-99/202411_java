package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass11 {
	public static void main(String[] args) {
		try {
			//파일로 부터 byte 알갱이를 읽어들일 객체 생성
			var fis = new FileInputStream("C:/Users/acorn/Desktop/playground/myFolder/1.jpg");
			//byte 알갱이를 파일에 출력할 객체 생성
			var fos = new FileOutputStream("C:/Users/acorn/Desktop/playground/myFolder/copied.jpg");
			//반복문 돌면서
			while(true) {
				//1 byte 읽어들여서
				int readedByte=fis.read();
				System.out.println(readedByte);
				//if 문 뒤에 한줄이면 {} 생략 가능
				if(readedByte == -1)break;
				//읽어들인 1byte 출력
				fos.write(readedByte);
				fos.flush();
			}
			System.out.println("파일을 copy 했습니다.");
			//마무리 작업
			//파일 작업을 하면 항상 닫아줘야한다 메모리 관리, 메모리 누수때문에
			fos.close();
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
