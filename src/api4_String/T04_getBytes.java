package api4_String;

import java.io.UnsupportedEncodingException;

public class T04_getBytes { // 파일 업로드, 다운로드 // 코드 변환
	public static void main(String[] args) {
		// 아스키코드 : 영문1글자 1Byte, 한글 2Byte
		// EUC-KR : 영문1글자 1Byte, 한글 2Byte
		// 유니코드 : UTF-8 영문1글자 1Byte, 한글 3Byte
		String str1 = "안녕하세요!";
		String str2 = "Hello!";

		System.out.println("str1의 길이 : " + str1.length());
		System.out.println("str2의 길이 : " + str2.length()); // 자바는 영문, 한글 1byte로 같음
		System.out.println();

		//getBytes() 
		byte[] b1 = str1.getBytes(); // .getBytes() 알아서 문자열을 byte로 바꿔서 배열에 넣어줌
		System.out.println("b1의 길이 : " + b1.length); // 3byte 5글자 + !

		byte[] b2 = str2.getBytes();
		System.out.println("b2의 길이 : " + b2.length);
		System.out.println();

		// 인코딩(암호화, 코드를 바꾸는 것)/디코딩(인코딩을 복호화)
		try {
			// EUC-KR
			// 한글 인코딩 <-> 디코딩
			byte[] b3 = str1.getBytes("EUC-KR"); // 자료보낼때 byte로 바꿔야 함 //()안 잘못쓸 수 있으니
			System.out.println("b3의 길이 : " + b3.length);
			System.out.println("b3 : " + b3.toString()); // toString()은 생략가능 // 배열 객체 주소(오버라이드x)
			System.out.println("b3[0] : " + b3[0]); // '안'의 EUC-KR 코드
			System.out.println("~~~~~~~~~~~~전송중~~~~~~~~~~~~");
			// 웹에서 보내면 숫자든 문자든 무조건 문자로 옴
			String str3 = new String(b3, "EUC-KR"); // 디코딩 // 문자로 복호화 // 변경할 것이 있을때 "문자"
			System.out.println("str3 : " + str3);
			System.out.println();

			// 영문 인코딩 <-> 디코딩
			byte[] b4 = str2.getBytes("EUC-KR");
			System.out.println("b4의 길이 : " + b4.length);
			System.out.println("b4 : " + b4.toString());
			System.out.println("b4[0] : " + b4[0]);
			System.out.println("~~~~~~~~~~~~전송중~~~~~~~~~~~~");
			String str4 = new String(b4, "EUC-KR");
			System.out.println("str4 : " + str4);
			System.out.println("===========================================");

			// UTF-8
			// 한글 인코딩 <-> 디코딩
			b3 = str1.getBytes("UTF-8");
			System.out.println("b3의 길이 : " + b3.length);
			System.out.println("b3 : " + b3.toString());
			System.out.println("b3[0] : " + b3[0]);
			System.out.println("~~~~~~~~~~~~전송중~~~~~~~~~~~~");
			str3 = new String(b3, "UTF-8");
			System.out.println("str3 : " + str3);
			System.out.println();

			// 영문 인코딩 <-> 디코딩
			b4 = str2.getBytes("UTF-8");
			System.out.println("b4의 길이 : " + b4.length);
			System.out.println("b4 : " + b4.toString());
			System.out.println("b4[0] : " + b4[0]);
			System.out.println("~~~~~~~~~~~~전송중~~~~~~~~~~~~");
			str4 = new String(b4, "UTF-8");
			System.out.println("str4 : " + str4);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
