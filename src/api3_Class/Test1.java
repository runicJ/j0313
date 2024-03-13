package api3_Class;

public class Test1 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String2");   // 기본객체 import x  // 있는지 없는지 모르니까 예외처리 꼭해야  // 없지만 오류 x
			System.out.println("String클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 파일이 존재하지 않습니다." + e.getMessage());
		}
		System.out.println("작업끝");
	}
}
