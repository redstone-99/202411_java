package test.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class QuizMain {
	public static void main(String[] args) {
		//1. 정수를 담을수 있는 ArrayList 객체를 생성해서 nums 라는 지역 변수에 담아 보세요
		List<Integer> nums = new ArrayList<>();
		
		//2. 반복문 10번 돌면서 1~100 사이의 랜덤한 정수를 각각 얻어내서
		//위에서 생성한 nums 객체에 순서대로 담아 보세요.
		
		//랜덤한 정수를 얻어낼 객체
		Random random = new Random();
		//반복문을 10번 돌도록 구성
		for(int i=0; i<10; i++) {
			//1~100 사이의 랜덤한 정수 얻어내기
			int randomNumber = random.nextInt(100)+1;
			nums.add(randomNumber);
		}
		
		//3. nums 에 저장된 숫자에서 중복된 숫자가 제거된 새로운 ArrayList 객체를 얻어내 보세요
		//Set<Integer> set = new HashSet<>(nums);
		//List<Integer> list = new ArrayList<>(set);
		
		Set<Integer> set = new HashSet<>();
		//Set 객체에 숫자를 넣으면 중복이 제거 된다.
		nums.forEach((item)->{
			set.add(item);
		});
		
		//중복이 제거된 Set 를 이용해서 다시 ArrayList 객체 생성
		List<Integer> result = new ArrayList<>(set);
		
		//4. 새로운 배열에 숫자를 오름 차순 정렬해 보세요
		Collections.sort(result);
		
		//5. 새로운 배열에 저장된 숫자를 순서대로 콘솔창에 출력해 보세요.
		result.forEach((item)->{
			System.out.println(item);
		});
	}
}
