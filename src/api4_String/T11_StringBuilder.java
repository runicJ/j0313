package api4_String;

public class T11_StringBuilder {
	public static void main(String[] args) {
		String res = new StringBuffer()  // String 객체는 capacity() 불가
				.append("Seoul")
				.append("/Busan")
				.append("/Cheongju")
				.append("/Jeju")
				.toString();  // .toString()으로 마감해야함  // 체이닝 기법
		System.out.println("res : " + res);
		System.out.println();
		
		StringBuilder str2 = new StringBuilder();  //Buffer와 크게 차이 없음
		System.out.println("용량 : " + str2.capacity());
		
		System.out.println("3.str2버퍼크기 : " + str2.capacity());
		str2.append("atom");
		System.out.println("4.str2 : " + str2);
		System.out.println("5.str2버퍼크기 : " + str2.capacity());
		
		str2.append("0123456789012345");
		System.out.println("6.str2 : " + str2);
		System.out.println("7.str2버퍼크기 : " + str2.capacity());
		
		str2.insert(2, "abcdefg");
		System.out.println("8.str2 : " + str2);
		System.out.println("9.str2버퍼크기 : " + str2.capacity());
		
		str2.replace(2, 5, "!!!!!!!!");  // 2번지부터 5번지 앞까지 문자로 바꿔라  
		System.out.println("10.str2 : " + str2);
		System.out.println("11.str2버퍼크기 : " + str2.capacity());
		
		str2.delete(5, 20);  // 5번째부터 20개
		System.out.println("12.str2 : " + str2);
		System.out.println("13.str2버퍼크기 : " + str2.capacity());
	}
}
