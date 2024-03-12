package api1_Object;

import java.util.HashMap;

class Aa {
	String name;
	
	public Aa(String name) {
		this.name = name;
	}
}

class Bb {
	String name;
	
	public Bb(String name) {  // Object 상속
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {  // equals가 Object
		if(this.name == ((Bb)obj).name) return true;  // obj 다운캐스팅, Bb의 name과 Object
		else return false;
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();  // "첫번째", "두번째"...
	}
}

public class T1_hashCode2 {
	public static void main(String[] args) {
		// HashMap
		HashMap<Integer, String> map = new HashMap<>();  //<생략가능>
		
		map.put(1, "데이터1");
		map.put(1, "데이터2");  // 찾아가서 덮어씀
		map.put(2, "데이터3");  // 순서와 관계없이 키값 순(정렬x), 해쉬코드로 같은걸 찾아감
		System.out.println(map);
		
		HashMap<Aa, String> map2 = new HashMap<>();
		map2.put(new Aa("첫번째"), "데이터1");  // 값이 같지만 새로 생성 한것, 각각 다른 객체
		map2.put(new Aa("첫번째"), "데이터2");
		map2.put(new Aa("두번째"), "데이터3");
		System.out.println(map2);
		
		HashMap<Bb, String> map3 = new HashMap<>();
		map3.put(new Bb("첫번째"), "데이터1");
		map3.put(new Bb("첫번째"), "데이터2");
		map3.put(new Bb("두번째"), "데이터3");
		System.out.println(map3);
				
	}
}

//api1_Object.Aa@7852e922=데이터3 패키지명.클래스명@주소