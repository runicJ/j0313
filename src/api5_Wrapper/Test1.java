package api5_Wrapper;

// Wrapper클래스 : 기본타입을 참조타입으로(Boxing), 참조타입을 기본타입으로(UnBoxing) 형변환
public class Test1 {
	public static void main(String[] args) {
		int intSu1 = 100, intSu2 = 200;  // 기본타입 연산하려면 값이 있어야함.
		System.out.println("1.intSu1 + 100 : " + (intSu1 + 100));
		
		// 정수형 Boxing처리(Integer) - 기본타입(int) 참조타입(객체)f로 타입변환
		Integer objSu1 = new Integer(intSu1);  //밑줄 에러x 예전 방식임을 표시
		System.out.println("2.objSu1 + 100 : " + (objSu1 + 100));  // 정수의 성질은 남아있음 // 포장만 바뀜
		
		// 자동박싱 처리의 예
		Integer objSu2;  // 자기성질을 그대로 가지고 있어서 값이 있어야 연산가능  //참조는 없어도됨
		objSu2 = objSu1;
		System.out.println("2.objSu2 + 100 : " + (objSu2 + 100));  // 정수의 성질은 남아있음 // 포장만 바뀜
		
		// UnBoxing처리
		String strIntSu1 = "100";
		System.out.println("strIntSu1 + 100 = " + (strIntSu1 + 100));
		System.out.println("strIntSu1 + 100 = " + (Integer.parseInt(strIntSu1) + 100));
		
		// double <-> Double(객체)
		double dblSu = 3.14;
		Double objDblSu = new Double(dblSu);
		System.out.println("2.objDblSu + 100 : " + (objDblSu + 100));  //객체화만 해놓음
		
		int su3 = 100;
		Integer objSu3 = Integer.valueOf(su3);  //boxing
		System.out.println("3.objSu3 + 100 : " + (objSu3 + 100));
		
		// UnBoxing
		int su4 = Integer.valueOf(objSu3);
		System.out.println("su4 + 100 : " + (su4 + 100));
	}
}
