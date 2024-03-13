package api3_Class;

public class Test2 {
	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("String클래스가 존재합니다.");
			
			// 객체의 정보(Test1.class) 알아내어 출력하기
			Class clazz = Test1.class;  // 이 파일 정보 clazz로 알수있음 // 메소드지만 ()없음 예외  //.class는 Class 객체 => 타입으로
			System.out.println("전체이름(패키지명+파일명) : " + clazz.getName());
			System.out.println("패키지명 : " + clazz.getPackage());
			System.out.println("타입명 : " + clazz.getTypeName());
			System.out.println("simple이름 : " + clazz.getSimpleName());
			System.out.println();
			
			Class imgPath = Test2.class;  //Test2 객체를 통해서 이미지 경로 가져옴
			System.out.println("그림파일의 경로명 : " + imgPath.getResource("./images/121.jpg").getPath());  //소스에서 만든건 class 파일 간주 bin에 저장 //문자입력 //위치 돌려줌  // . 나를 기준 상대경로
			System.out.println("Test2.class의 경로명 : " + imgPath.getResource("Test2.class").getPath());  //현재파일
			System.out.println("Test2.class의 경로명 : " + clazz.getResource("Test2.class").getPath());  //내걸로 가져올 필요 없음
			System.out.println("현재 작업경로의 루트(/)명 : " + clazz.getResource("/").getPath());
			System.out.println("그림파일의 경로명1 : " + imgPath.getResource("/api3_Class/images/122.jpg").getPath());  //src와 bin 경로 같음
			// 잘못된 경로와 파일명을 입력하면 NullPointException
			//System.out.println("그림파일의 경로명2 : " + imgPath.getResource("/images/122.jpg").getPath());  // .을 넣으면 안됨, 상대경로
			System.out.println("api2_System패키지의 Test1.class 경로명1 : " + imgPath.getResource("/api2_System/Test1.class").getPath());
			System.out.println("api2_System패키지의 Test1.class 경로명2 : " + imgPath.getResource("../api2_System/Test1.class").getPath());  // ../../ 사용불가 root루트를 벗어날 수 없음 .. src로 감
			// 최상위 폴더(src(또는 bin))를 벗어나면 경로와 파일명을 찾아올 수 없다.
			//System.out.println("api2_System패키지의 Test1.class 경로명2 : " + imgPath.getResource("../../api2_System/Test1.class").getPath());	// root는 시작점. root를 못 벗어남
		} catch (ClassNotFoundException e) {
			System.out.println("클래스 파일이 존재하지 않습니다." + e.getMessage());
		} finally {
			System.out.println("작업끝");			
		}
	}
}
// . 나자신 / .. 상위폴더 / \\ 윈도우 / / 리눅스
// 하위 패키지 .붙여야 함