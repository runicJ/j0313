package api4_String;

import java.util.Scanner;

public class T02_substring_Ex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//            0         1         2
		//            012345678901234567890
		String msg = "Welcome to Korea!!!";
		String str = "";
		int position, totPosition=0, cnt=0;
		System.out.println("입력된 문자열 : " + msg);
		System.out.print("찾고자 하는 문자를 입력하세요? ");
		str = sc.nextLine();
		
		while(true) {
			position = msg.indexOf(str);  //위치
			if(position == -1) break;
			totPosition += position;
			System.out.println((cnt+1) + "번째 위치(색인번지) : " + totPosition);
			msg = msg.substring(position + 1);  // ex) 5이상부터 잘라내서 msg에 저장  //발췌
			cnt++;
			totPosition++;
		}
		System.out.println(str + "문자는 총 "+cnt+" 개 있습니다.");
		sc.next();
	}
}
