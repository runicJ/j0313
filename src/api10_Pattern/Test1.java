package api10_Pattern;

import java.util.regex.Pattern;

// 정규식 Pattern클래스를 사용
// 숫자 : ^[\\d]*$  // D 숫자가 아닌거
public class Test1 {
	public static void main(String[] args) {
		String str1 = "1234";
		String str2 = "1A234";
		
		// 정규식을 만들고, 입력데이터와 조건비교 처리한다.
		String regEx = "^[\\d]*$";
		
		// 1번 방법(잘 사용안함) return 타입이 맞나틀리나 //객체비교 보통 래퍼클래스로, 소문자 ㄱㅊ
		Boolean pattern1 = Pattern.compile(regEx).matcher(str1).find();
		Boolean pattern2 = Pattern.compile(regEx).matcher(str2).find();
		System.out.println("1 : " + pattern1);
		System.out.println("2 : " + pattern2);
		
		// 2번 방법
		Boolean pattern3 = Pattern.matches(regEx, str1);  //변수로 받아서
		Boolean pattern4 = Pattern.matches(regEx, str2);
		System.out.println("3 : " + pattern3);
		System.out.println("4 : " + pattern4);
		
		System.out.println("5 : " + Pattern.matches(regEx, str1)); // 바로 넣어서
		System.out.println("6 : " + Pattern.matches(regEx, str2));
		
		System.out.println();
		
		// 프로그램에서의 적용예....
		if(Pattern.matches(regEx, str1)) System.out.println("str1은 숫자가 맞습니다.");
		else System.out.println("str1은 숫자가 아닌 값(문자?)을 포함하고 있습니다.");
		
		if(Pattern.matches(regEx, str2)) System.out.println("str2은 숫자가 맞습니다.");
		else System.out.println("str2은 숫자가 아닌 값(문자?)을 포함하고 있습니다.");
	}
}
