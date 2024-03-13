package api1_Object;

public class T2_toStringVO {  // VO 값을 저장하는 경우 사용  // 변수 생성
	private String name;  // 필드 private으로 
	private int age;	// private 이니까 생성자나 getter,setter로 getter,setter는 public으로
	private boolean gender;
	private String job;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "T2_toStringVO [name=" + name + ", age=" + age + ", gender=" + gender + ", job=" + job + ", address="
				+ address + "]";
	}
	
// Scource + generate toString  // alt sss enter enter
//	@Override
//		public String toString() {  //입력값의 전달이 됐는지 찍어보는 것  //오버라이드 안하면 주소가 나옴
//			return "VO = [name="+name+" , age="+age+" , gender="+gender+" , job="+job+" , address="+address+"]"; //변수
//		}
	
	
}
