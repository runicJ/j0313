package api2_String;

public class T2_substring {
	public static void main(String[] args) {
		//						 0				 1				 2		
		//             012345678901234567890
		String msg1 = "Welcome to Korea!!!";
		String msg2 = "한국에 방문하신 것을 환영합니다!!!";
		
		// subString() : 지정된 위치(인덱스번지)의 값을 출력
		// substring(n) : 지정된 시작 위치(인덱스번지)의 위치부터 마지막까지 문자열을 출력
		// substring(n, m) : n위치(인덱스번지)의 위치부터 m-1위치까지 문자열을 출력
		System.out.println("1.msg1에 3번째 인덱스 위치부터 출력? " + msg1.substring(3));
		System.out.println("2.msg1에 3번째부터 12번째 인덱스 앞까지 출력? " + msg1.substring(3,12));
		
		// Ko~ 단어를 출력?
		System.out.println("Ko~ " + msg1.indexOf("Ko"));
		System.out.println("!!! " + msg1.indexOf("!!!"));
		System.out.println("Korea : " + msg1.substring(msg1.indexOf("Ko"),msg1.indexOf("!!!")));	
	}
}
// 문장을 입력받는다.
// 찾고자하는 문자나 문자열
// 여러개 있으면 몇개있는지
// 찾고자 하는 단어 몇번째부터 몇개가 있다, 몇개 있는데 첫번째 문자는 몇번지 두번째 문자는 몇번지..