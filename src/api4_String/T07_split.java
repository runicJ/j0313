package api4_String;

public class T07_split {
	public static void main(String[] args) {
		// split() : 문자열을 특정 문자(열)로 분리시킨후~ 분리된 각각의 항목을 배열로 저장시켜준다.(or연산자: | 정규식에서는 보통||)
		
		String tel = "010-1234-5678";
		
		// 앞의 전화번호를 '-'으로 분리시킨 후 배열로 저장시켜준다.
		String[] telArr = tel.split("-");
		
		System.out.println(telArr[0]);
		System.out.println(telArr[1]);
		System.out.println(telArr[2]);
		System.out.println();
		
		String telTemp = "";  //누적
		for(String t : telArr) {
			System.out.println(t);
			telTemp += t + "/";
		}
		System.out.println();
		System.out.println(telTemp);
		System.out.println(telTemp.substring(0, telTemp.length()-1));
		System.out.println();
		
		String[] title = {"지역번호", "국번호", "전화번호"};
		for(int i=0; i<telArr.length; i++) {
			System.out.println(title[i] + " : " + telArr[i]);
		}
		System.out.println();
		
		// 각 이름의 구분자를 '/'로 통일해서 출력하시오?
		String names = "홍길동/이기자&김말숙:오하늘;소나무 고인돌";
		System.out.println(names);
		
		String[] nameArr = names.split("/|&|:|;| ");  //split 쓰려면 배열로 받아야함
		
		// 방법1
		String nameTemp = ""; //누적할때 초기값 공백
		for(String name : nameArr) {
			nameTemp += name + "/";  // 조인,결합
		}
		System.out.println("성명 : " + nameTemp.substring(0, nameTemp.length()-1));
		
		// 방법2 : join() 배열에 분리 저장되어 있는 항목들을, 특정 문자로 결합시켜준다.
		String nameJoin = String.join("/", nameArr);  // 구분자, 배열  join 메소드 사용
		System.out.println("성명 : " + nameJoin);
	}
}
