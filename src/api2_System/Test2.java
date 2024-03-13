package api2_System;

public class Test2 {
	public static void main(String[] args) {
		int i, tot=0;
		
		for(i=1; i<=100000000; i++) {
			tot += i;
			if(tot >= 10000) {
				System.out.println("합이 10000이상 일때 i값은? " + i);
				// break;
				return;  // 위험. jvm은 헷갈려함 
			}
		}
		System.out.println("작업끝");
	}
}
