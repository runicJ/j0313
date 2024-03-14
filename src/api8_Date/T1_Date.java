package api8_Date;

import java.text.SimpleDateFormat;  // 형식에 관한걸 바꿔줄때
import java.util.Date;
import java.util.Locale;

public class T1_Date {
	public static void main(String[] args) {
		// Date 객체
		Date now = new Date();  // java.util을 사용해야, sql은 안되는 것이 많음  // 날짜 연산
		System.out.println("1.오늘의 날짜(기본형식) : " + now);
		
		// 날짜 객체를 문자화 : toString()
		String strNow = now.toString();
		System.out.println("2.오늘의 날짜(문자형식) : " + strNow);
		System.out.println();
		
		// 날짜형식을 사용자 지정에 따라서 변경 : SimpleDateFormat()
		// 매개변수 : 년도(yy, yyyy), 월(M), 일(d), 시간(h, H(24시간)), 분(m), 초(s)  // 대소문자 구별됨
		SimpleDateFormat sdf = new SimpleDateFormat();
		String strNow1 = sdf.format(now);  //선언
		System.out.println("기본 날짜 시간 포멧 : " + strNow1);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd");
		strNow1 = sdf.format(now);
		System.out.println("yyyy-MM-dd : " + strNow1);
		
		sdf = new SimpleDateFormat("MM/dd/yyyy");
		strNow1 = sdf.format(now);
		System.out.println("MM/dd/yyyy : " + strNow1);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		strNow1 = sdf.format(now);
		System.out.println("yyyy년 MM월 dd일 : " + strNow1);
		
		sdf = new SimpleDateFormat("yy년 M월 d일");
		strNow1 = sdf.format(now);
		System.out.println("yy년 M월 d일 : " + strNow1);  // db 연결할때 타입을 맞춰야 함 // 기본 M. d.

		sdf = new SimpleDateFormat("hh:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("hh:mm:ss : " + strNow1);
		
		sdf = new SimpleDateFormat("h:m:s");
		strNow1 = sdf.format(now);
		System.out.println("h:m:s : " + strNow1);
		
		sdf = new SimpleDateFormat("HH:m:s");
		strNow1 = sdf.format(now);
		System.out.println("HH:m:s : " + strNow1);

		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  // 가장 보편적인 포멧
		strNow1 = sdf.format(now);  // format 사용시 String으로 바뀜. 문자로 바꿀 필요가 없음.
		System.out.println("yyyy-MM-dd HH:mm:ss : " + strNow1);
		System.out.println("오늘 날짜 : " + strNow1.substring(0,10));		
		
		sdf = new SimpleDateFormat("yyyy-M-dd HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("yyyy-MM-dd HH:mm:ss : " + strNow1);
		System.out.println("오늘 날짜 : " + strNow1.substring(0,10));	 // 뒤에 공백이 존재
		
		sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		strNow1 = sdf.format(now);
		System.out.println("yyyy.MM.dd HH:mm:ss : " + strNow1);

		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		strNow1 = sdf.format(now);
		System.out.println("yyyy년 MM월 dd일 HH시 mm분 ss초 : " + strNow1);
		System.out.println();
		
		sdf = new SimpleDateFormat("오늘은 E요일");
		//strNow1 = sdf.format(now);
		System.out.println(sdf.format(now));  //변수로 받은 것 넣은 것, 같음
		
		sdf = new SimpleDateFormat("오늘은 올해의 D번째날");
		System.out.println(sdf.format(now));
		
		sdf = new SimpleDateFormat("오늘은 이번달의 d번째날");
		System.out.println(sdf.format(now));		
		
		sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
		System.out.println(sdf.format(now));		

		sdf = new SimpleDateFormat("EEEE, d MMMM yyyy HH:mm:ss", Locale.ENGLISH);
		System.out.println(sdf.format(now));		
	}
}
