package api8_Date;

import java.util.Calendar;
import java.util.TimeZone;

public class T6 {
	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar cal = Calendar.getInstance(timeZone);  // LA 기준
		
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = "";
		if(amPm == Calendar.AM) strAmPm = "오전";
		else strAmPm = "오후";
		
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.println("미국 로스앤젤레스 현재 시각 : " + strAmPm +" "+hour+"시 "+minute+"분 "+second+"초");
	}
}
