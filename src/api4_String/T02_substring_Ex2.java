package api4_String;

import java.util.Scanner;

public class T02_substring_Ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//            0         1         2
		//            012345678901234567890
		String msg = "Welcome to Korea!!!";
		String str = "";
		int position=-1, cnt=0;
		System.out.println("입력된 문자열 : " + msg);
		System.out.print("찾고자 하는 문자를 입력하세요? ");
		str = sc.next();
		
		while(true) {
			position = msg.indexOf(str, position+1);  // 찾는문자, 찾는시작 위치
			if(position == -1) break;
			System.out.println((cnt+1) + "번째 위치(색인번지) : " + position);
			cnt++;
		}
		System.out.println(str + "문자는 총 "+cnt+" 개 있습니다.");
		sc.next();
	}
}
