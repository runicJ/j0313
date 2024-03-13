package api1_Object;

public class T2_toStringRun {
	public static void main(String[] args) {
		T2_toStringVO vo = new T2_toStringVO();
		
		String name = "김말숙";  //접근제한자 default
		int age = 30;
		boolean gender = false;
		String job = "";  //NullpointerException 방지
		//String job = null;
		String address = "청주";
		
		vo.setName(name);
		vo.setAge(age);
		vo.setGender(gender);
		vo.setJob(job);
		vo.setAddress(address);
		
		System.out.println("성명 : " + vo.getName());
		System.out.println("성명 : " + vo.getName().toString());  // 문자
		System.out.println("나이 : " + vo.getAge());  // 문자 + 숫자 = 문자
		System.out.println("성별 : " + vo.isGender());
		System.out.println("직업 : " + vo.getJob());
		System.out.println("주소 : " + vo.getAddress());
		System.out.println();
		
		//System.out.println("vo : " + vo.toString());  // 원래는 toString()을 붙여야 하는데 많이 쓰니까 기본으로 적용됨.
		System.out.println("vo : " + vo);  // vo : 주소 // vo 힙영역  // 부를 것 스택  vo : api1_Object.T2_toStringVO@15db9742
	}
}
