package api2_System;

public class Test4_시험문제 {
	public static void main(String[] args) {  // cpu의 처리속도
		int tot = 0;
		
		long startTime = System.nanoTime();  // 시간을 숫자로 받아옴
		
		for (int i = 1; i <= 100000000; i++) {
			tot += i;
		}

		long endTime = System.nanoTime();
		
		System.out.println("작업에 소모된 시간? " + (endTime-startTime));
		System.out.println("작업끝");
	}
}
