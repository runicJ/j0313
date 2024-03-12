package 과제;

import java.util.Scanner;

public class Find {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("글귀를 입력하세요? ");
		String sentence = sc.nextLine();
		System.out.println("찾고자 하는 단어를 입력하세요? ");
		String word = sc.next();
		int cnt = 0;
		int su = 0;
		
		for(int i=0; i<5; i++) {
				i = sentence.indexOf(word);
				System.out.println((i+1) + " ");
				cnt++;
				
				if(i == sentence.lastIndexOf(word)) break;
		}
		System.out.println("찾고자 하는 단어가" + cnt + "개 존재합니다.");
		System.out.println("작업끝");
		
		sc.close();
	}
}
