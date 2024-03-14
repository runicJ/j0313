package api8_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class T3_LocalDate {
	public static void main(String[] args) {
		// LocalDate객체
		LocalDate currentDate = LocalDate.now();  // 싱글톤(getInstance로 불러씀)x, 정적멤버(메소드)-클래스명. , 객체생성x
		System.out.println("오늘 날짜 : " + currentDate);  // 프로젝트시 간단하게 만들때
		
		// 날짜 지정 세팅
		currentDate = LocalDate.of(2024, 3, 14);
		System.out.println("지정 날짜 : " + currentDate);  // 날짜타입
	
		// 시스템의 현재 시간정보 가져오기
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		System.out.println("현재 시간 : " + currentTime.toString().substring(0,8));  // 문자로 바꿔서 substring
		
		// 시간 지정 세팅
		LocalTime targetTime = LocalTime.of(12, 50, 30);
		System.out.println("설정 시간 : " + targetTime);  // 날짜형식이라 substring 쓸수 없음

		// 날짜 시간
		LocalDateTime currentTime2 = LocalDateTime.now();
		System.out.println("오늘 날짜 시간 : " + currentTime2);  // 중간 T로 날짜 시간 구분
		String[] strToday = currentTime2.toString().split("T");  // 문자 배열
		System.out.println("오늘 날짜 : " + strToday[0]);
		System.out.println("오늘 시간 : " + strToday[1].substring(0,8));
		
		// 날짜/시간 지정 세팅
		LocalDateTime targetDateTime = LocalDateTime.of(2024, 3, 14, 13, 5, 10);  // LocalDateTime은 연도가 4글자로 나와야 함
		System.out.println("설정 날짜/시간 : " + targetDateTime);
		System.out.println();
		
		// 날짜 연산하기....
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a HH:mm:ss");
		System.out.println("현재 날짜/시간 : " + now.format(dtf));
	
		LocalDateTime res = now.plusYears(1);
		System.out.println("1년 더하기 : " + res.toString().substring(0,4) + "년");
		
		res = now.minusYears(1);  // 선언자x
		System.out.println("1년 빼기 : " + res.toString().substring(0,4) + "년");
		
		res = now.plusMonths(2);
		System.out.println("2월 더하기 : " + res.toString().substring(5,7) + "월");
		
		res = now.minusMonths(2);
		System.out.println("2월 빼기 : " + res.toString().substring(5,7) + "월");
		
		res = now.plusDays(7);
		System.out.println("7일 더하기 : " + res.toString().substring(8,10) + "일");
		
		res = now.minusDays(7);
		System.out.println("7일 빼기 : " + res.toString().substring(8,10) + "일");
		System.out.println();
		
		// 날짜비교 날짜형식이든 문자형식이든 형식을 맞춰야함
	}
}

// 날짜계산, 날짜비교
