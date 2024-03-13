package api4_String;

import java.util.StringTokenizer;  //17장

public class T12_StringTokenizer {
	public static void main(String[] args) {
		// StringTokenizer : 문자열을 특정 문자(열)로 분리시킨후~ 분리된 각각의 토큰(항목)을 내부반복자(이터레이터)로 호출시켜준다.
		
		String tel = "010-1234-5678";  // 010 / 1234 / 5678 각각의 토큰
		
		StringTokenizer telArr = new StringTokenizer(tel, "-"); // -으로 분리해서 , 배열이랑 다름
		
		System.out.println("telArr토큰의 개수? " + telArr.countTokens());  // 몇갠지 알면 for문
		
		String str = "";
		while(telArr.hasMoreElements()) {  // telArr에 값이 있으면 while문 실행
			str += telArr.nextToken() + "/";  // = nextElements
		} //이터레이터-토큰을 읽음
		System.out.println("str : " + str.substring(0,str.length()-1));
	}
}
