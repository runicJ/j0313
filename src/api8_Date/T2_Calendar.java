package api8_Date;

import java.util.Calendar;

public class T2_Calendar {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();  // new로 객체 생성x, 싱글톤 패턴(한번정하면 못바꿈), static final 상수(대문자)
		System.out.println("년도 : " + cal.get(Calendar.YEAR));  // field 꺼내고싶은 상수  // 열거형(ENUM?) 클래스이름. 으로 불러야 변수로 x
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1));  // 월을 0부터 봄  // 가로 안하면 붙이기가 됨
		System.out.println("일 : " + (cal.get(Calendar.DATE)));
		System.out.println("시 : " + (cal.get(Calendar.HOUR_OF_DAY)));  // HOUR로 하면
		System.out.println("분 : " + (cal.get(Calendar.MINUTE)));
		System.out.println("초 : " + (cal.get(Calendar.SECOND)));
		System.out.println("오늘이 몇번째 주 : " + (cal.get(Calendar.WEEK_OF_YEAR)));  // 올해
		System.out.println("오늘이 몇번째 일 : " + (cal.get(Calendar.DAY_OF_WEEK)));  // 일(1), 월(2), ~~ 화수목금 ,토(7)
		System.out.println(cal.get(Calendar.AM_PM));  // 0 : AM, 1 : PM
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = "";
		if(amPm == Calendar.AM) strAmPm = "오전";
		else strAmPm = "오후";
		System.out.println("지금은 "+strAmPm+" 입니다");
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		String strWeek = "";
		switch(week) {
			case 1: strWeek = "일"; break;
			case 2: strWeek = "월"; break;
			case 3: strWeek = "화"; break;
			case 4: strWeek = "수"; break;
			case 5: strWeek = "목"; break;
			case 6: strWeek = "금"; break;
			case 7: strWeek = "토"; break;
//			case Calendar.SUNDAY: strWeek = "일"; break;  // 상수값으로 출력
//			case Calendar.MONDAY: strWeek = "월"; break;
//			case Calendar.TUESDAY: strWeek = "화"; break;
//			case Calendar.WEDNESDAY: strWeek = "수"; break;
//			case Calendar.THURSDAY: strWeek = "목"; break;
//			case Calendar.FRIDAY: strWeek = "금"; break;
//			case Calendar.SATURDAY: strWeek = "토"; break;
		}
		System.out.println("오늘은 " + strWeek + "요일 입니다.");
	}
}
