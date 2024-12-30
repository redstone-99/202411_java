package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass12 {
	public static void main(String[] args) {
		//필요한 객체의 참조값을 담을 변수를 미리 만들어 둔다.
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//파일로 부터 byte 알갱이를 읽어들일 객체 생성
			fis = new FileInputStream("C:/Users/acorn/Desktop/playground/myFolder/1.jpg");
			//byte 알갱이를 파일에 출력할 객체 생성
			fos = new FileOutputStream("C:/Users/acorn/Desktop/playground/myFolder/copied.jpg");
			//byte 알갱이 여러개를 한번에 담을 배열 미리 준비하기
			byte[] buffer=new byte[1024];
			
			//반복문 돌면서
			while(true) {
				//byte[] 배열을 전달해서 byte 알갱이를 한번에 1024 개씩 읽어들인다.
				int readedCount = fis.read(buffer);	//읽어들인 갯수가 리턴된다
				System.out.println(readedCount+" byte 를 읽었습니다.");
				if(readedCount == -1)break;	//더이상 읽을 데이터가 없다면 반복문 탈출
				//byte[] 배열에 저장된 byte 알갱이를 0번 인덱스로 부터 읽은 갯수만큼만 출력하기
				//배열참조값 시작인덱스 읽은숫자
				fos.write(buffer, 0, readedCount);
			}
			System.out.println("파일을 copy 했습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//마무리 작업
				//파일 작업을 하면 항상 닫아줘야한다 메모리 관리, 메모리 누수때문에
				//null 이 아닐때만 close 를 호출해라.
				//Exception 때문에...
				if(fos!=null)fos.close();
				if(fos!=null)fis.close();
			}catch(Exception e) {
				
			}
		}
	}
}
