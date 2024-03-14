package api8_Date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class T5 {
	public static void main(String[] args) throws ParseException {
		String strDate1 = "2024-03-14";  // 웹을 통해서 입력받으면 전부 문자로
		String strDate2 = "2024-03-13";
		
//		if(strDate1 > strDate2) {system.out.println("비교 불가");}
		
		Date date1 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(strDate1);
		Date date2 = (Date) new SimpleDateFormat("yyyy-MM-dd").parse(strDate2);
		
		if(date1.getTime() > date2.getTime()) System.out.println("strDate1이 더 크다.");
		else System.out.println("strDate2가 더 크다.");
		
		long res1 = (date1.getTime() - date2.getTime()) / 1000;  // 초
		long res2 = (date1.getTime() - date2.getTime()) / 1000 / 60;  // 분 (1000 * 60)
		long res3 = (date1.getTime() - date2.getTime()) / 1000 / 60 / 60;  // 시 (1000 * 60 *60)
		long res4 = (date1.getTime() - date2.getTime()) / 1000 / 60 / 60 / 24;  // 일
		
		System.out.println("res1 : " + res1 + "초");
		System.out.println("res2 : " + res2 + "분");
		System.out.println("res3 : " + res3 + "시간");
		System.out.println("res4 : " + res4 + "일");
	}
}
