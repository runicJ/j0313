package api2_System;

public class Test3 {
	public static void main(String[] args) {
		int i, tot=0;
		
		for(i=1; i<=100000000; i++) {
			tot += i;
			if(tot >= 10000) {
				System.out.println("합이 10000이상 일때 i값은? " + i);
				// break;
				//return;
				System.exit(0);  // main 메소드 종료  // jvm에서 끝내버리라고 명령
			}
		}
		System.out.println("작업끝");
	}
}
