package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		// int type 5 개를 저장하고 있는 배열 객체 생성해서 참조값을 nums 라는 지역 변수에 담기
		int[] nums = {10, 20, 30, 40, 50}; //nums 안에는 int 배열의 참조값이 들어 있음
		// double type 5 개를 저장하고 있는 배열 객체 생성해서 참조값을 nums2 라는 지역 변수에 담기
		double[] nums2 = {10.2, 10.2, 10.3, 10.4, 10.5}; 
		// boolean type 5 개를 저장하고 있는 배열
		boolean[] truth = {true, true, false, false, true};
		// String type (참조데이터 type) 5 개를 저장하고 있는 배열
		String[] names = {"정홍석", "장희주", "곽래희", "최유진", "노혁천"};
		
		// 배열 객체의 복제본 얻어내기
		int[] result = nums.clone();	//내용이 같은 배열 생성
		// 복제본이 아닌 참조값만 복사하기
		int[] result2 = nums;			//참조값만 복사 생성
		
		// 자바에서 배열은 사이즈 고정
		// 배열의 크기 얻어내기
		int size = nums.length;
		// 배결은 순서가 있는 데이터 이다. 특정 index 의 item 참조하는 방법
		int first = nums[0];
		int second = nums[1];
		int third = nums[2];
	}
}
