package test.mypac;

public class IosPhone extends AndroidPhone{
	//생성자
	public IosPhone() {
		System.out.println("IosPhone 생성자 호출됨");
	}
	//알람 울리는 메소드
	public void alarm() {
		System.out.println("알람이 울려요!");
	}
	@Override //표시하려고...필요 없으면 호출 X
	public void takePicture() {
		//super.takePicture(); 필요 없으면 호출 X
		System.out.println("5000만 화소의 사진을 찍어요!");
	}
}
