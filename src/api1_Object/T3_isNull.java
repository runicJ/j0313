package api1_Object;

import java.util.Objects;

public class T3_isNull {  //Object 객체
	public static void main(String[] args) {
		T2_toStringVO vo = new T2_toStringVO();
		System.out.println("vo : " + vo);  // vo는 Null X
		
		if(vo == null) System.out.println("1.vo는 null입니다.");  // 객체에 data null이 아님 있음
		else System.out.println("1.vo는 null이 아닙니다.");
		System.out.println();
		
		if(vo.getName() == null) System.out.println("2.vo.name은 null입니다.");
		else System.out.println("2.vo.name은 null 아닙니다.");
		System.out.println();
		
		if(Objects.isNull(vo)) System.out.println("3.vo는 null입니다."); // Object 객체의 isnull이라는 메소드로 비교
		else System.out.println("3.vo는 null이 아닙니다.");
		System.out.println();
		
		if(Objects.nonNull(vo)) System.out.println("4.vo는 null이 아닙니다.");
		else System.out.println("4.vo는 null입니다.");
		System.out.println();
		
		//vo.setName("홍길동");
		if(Objects.nonNull(vo.getName())) {  // (vo.getName()) 연산자에서 걸림 // null인 경우 여기서 걸림  // 예외처리 안써도 오류x
			System.out.println("5.name는 "+vo.getName()+" 입니다.");
			if(vo.getName().equals("홍길동")) System.out.println("관리자");
			else System.out.println("방문객");
		}
		else System.out.println("5.name은 null입니다.");
		System.out.println();
		
		vo.setName("홍길동");
		if(vo.getName().equals("홍길동")) {  // 에러발생 NullPointerException // null과는 비교할 수 없음
			System.out.println("6.name는 "+Objects.requireNonNull(vo.getName())+" 입니다.");  // requireNonNull 필수 입력 // null이 아닌 경우에 필수 출력
//			if(vo.getName().equals("홍길동")) System.out.println("관리자");
//			else System.out.println("방문객");
		}
		else System.out.println("6.name은 null입니다.");
		System.out.println();

		vo.setName(null);
		//System.out.println("7.name는 "+vo.getName()+" 입니다.");  // 값이 없는데 비교, 연산 시 에러 발생
		//System.out.println("8.name는 "+Objects.requireNonNull(vo.getName())+" 입니다.");  // requireNonNull 필수 입력 null이 아니면 출력
	}
}
