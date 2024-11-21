package CH11_02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date now = new Date(); // Date 클래스로 객체 생성
		String stringNow1 = now.toString();
		System.out.println(stringNow1);
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String stringNow2 = simpleDateFormat.format(now);
		System.out.println(stringNow2);
		
//		Calendar now2 = new Calendar();  생성 X
		Calendar now2 = Calendar.getInstance();  // 해당 서버 컴퓨터의 운영체제 시간 
		System.out.println(now2.get(Calendar.YEAR)); // 연도 출력 
		System.out.println(now2.get(Calendar.MONTH)+1); // 월+1 출력 
		System.out.println(now2.get(Calendar.DAY_OF_MONTH)); // 일 출력 
		System.out.println(now2.get(Calendar.HOUR)); // 시간 출력
		System.out.println(now2.get(Calendar.MINUTE)); // 분 출력
		System.out.println(now2.get(Calendar.SECOND)); // 초 출력
		
		System.out.println("=================================");
		Random random = new Random();
		random.setSeed(System.currentTimeMillis()); // seed값이 현재 시간으로 계속 변경되는 값
//		random.setSeed(0);                // seed값을 0이나 그외의 정수 넣음으로 일정한 값으로 고정시킴
		int lotto2 = random.nextInt(45)+1;
		System.out.println(lotto2);  // 1~45 사이의 랜덤수 
		double ran1 = random.nextDouble(); // 0~1사이의 실수 
		System.out.println(ran1);  // 0~1 사이의 랜덤 실수 
		
		
		
	}

}
