package api0_Ex;

import java.util.Scanner;
import java.util.regex.Pattern;

/*  // adimin / adimin1234 => 관리자 아이디  // 1234 / admin1234 / admin1234! => 비밀번호
	아이디 : 영문(대/소), _ , - , 숫자 ==>> 4자이상  ^[a-zA-Z0-9_-]{4,}$
	비밀번호 : 영문(대/소), ~!@#$%^&*()_+-=, 숫자 ==>> 6자이상  ^[a-zA-Z0-9~!@#$%^&*()_+-=?]{6,}$ 
	성명 : 영문(대/소), 한글 ^[a-zA-Z가-힣]+$
	나이 : 숫자 ^[0-9]+$
	전화번호 : 02-123-4567, 010-123-4567, 010-1234-5678, 043-123-4567, 043-1234-1234 ^[0-9]{2,}-[0-9]{3,}-[0-9]{4,}$
	이메일 : "^[a-zA-z0-9_-]{3,12}@[a-zA-Z0-9]+\\.[a-z]+\\.[a-z]*$"
	주민번호 : 123456-1234567 (8번째는 1/2/3/4) ^[09]+[0-9]{5}-[1-4][0-9]{6}$
*/
public class Test4_회원가입체크 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String regExId = "^[a-zA-Z0-9_-]{4,}$";
		String regExPw = "^[a-zA-Z0-9~!@#$%^&*()_+-=?]{6,}$";
		
		
		System.out.print("아이디를 입력하세요? ");
		String id = sc.next();
		Pattern.matches(regExId, id);
		
	}
}
