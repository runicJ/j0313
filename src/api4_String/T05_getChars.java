package api4_String;

public class T05_getChars {
	public static void main(String[] args) {
		String str1 = "Hello1";
		
		char[] strArr	= new char[str1.length()];
		str1.getChars(0, str1.length(), strArr, 0);  // 배열복사...  //복사 시작 위치, 복사 끝 위치, 넣을 배열, 배열 어디부터
		System.out.println("strArr : " + strArr);  // 배열은 객체 strArr의 주소 나옴
		System.out.println();
		
		//향상된 for문
		String temp = "";
		for(char str : strArr) {
			temp += str + "/";
		}
		System.out.println(temp);
		System.out.println(temp.substring(0, temp.length()-1));
	}
}
