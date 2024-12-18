package test.main;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import test.mypac.FortuneTeller;

public class MainClass06 {

	public static void main(String[] args) {
		/*
		 * 	오늘의 운세를 콘솔창에 출력하는 프로그래밍을 해 보세요
		 */
		Date today = new Date();
        Random random = new Random();

        SimpleDateFormat dateFormat = new SimpleDateFormat("오늘은 yyyy년 MM월 dd일 입니다.");
        // 오늘의 날짜를 출력하는 출력 형식
        System.out.println(dateFormat.format(today));

        System.out.println("당신의 금전운은 100% 중 " + Math.abs(random.nextInt()%100 +1) + "% 입니다.");
        System.out.println("당신의 애정운은 100% 중 " + Math.abs(random.nextInt()%100 +1) + "% 입니다.");
        System.out.println("당신의 직장운은 100% 중 " + Math.abs(random.nextInt()%100 +1) + "% 입니다.");
        System.out.println("당신의 성적운은 100% 중 " + Math.abs(random.nextInt()%100 +1) + "% 입니다.");
        
        System.out.println("내 운세");
        new FortuneTeller().printFortune();
	}
}
