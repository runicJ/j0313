package api8_Date;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class T4_DateCompare {
	public static void main(String[] args) {
		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2024, 12, 31, 0, 0, 0);
		
		System.out.println("남은 연도 : " + startDateTime.until(endDateTime, ChronoUnit.YEARS));  //chronounit 열거형 데이터
		System.out.println("남은 월 : " + startDateTime.until(endDateTime, ChronoUnit.MONTHS));
		System.out.println("남은 일 : " + startDateTime.until(endDateTime, ChronoUnit.DAYS));
		System.out.println("남은 시간 : " + startDateTime.until(endDateTime, ChronoUnit.HOURS));
		System.out.println("남은 분 : " + startDateTime.until(endDateTime, ChronoUnit.MINUTES));
		System.out.println("남은 초 : " + startDateTime.until(endDateTime, ChronoUnit.SECONDS));
		
	}
}
