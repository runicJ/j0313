package api9_format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Test1 {
	public static void main(String[] args) {
		// DacimalFormat : 데이터 출력 포멧을 지정한다.
		// 서식기호 - 0:숫자를 표시(해당 자리에 숫자가 없으면 0으로 표시)
		// 					#:숫자를 표시(의미가 없는 0(무효의 제로)를 화면에 출력시켜주지 않는다.
		
		double su = 12345.0;
		System.out.println("원본 : " + su);
		
		DecimalFormat df = new DecimalFormat();
		System.out.println("1:" + df.format(su));
		
		df = new DecimalFormat("0");  // 같은변수 쓰려면  // 정수
		System.out.println("2:" + df.format(su));
		
		df = new DecimalFormat("0,000");  // 큰데이터는 괜찮은데 작은 데이터는 소수점 아래 반올림 하고 0,013 서식기호때문
		System.out.println("3:" + df.format(su));
		
		df = new DecimalFormat("#,###");
		System.out.println("4:" + df.format(su));
		
		df = new DecimalFormat("#");  // 프로그램에서는 의미, 엑셀에서는 0인 경우 아무것도 표시x
		System.out.println("5:" + df.format(su));
		
		df = new DecimalFormat("#,##0");  // 마지막 0을 의미가 있는 것으로 봄 // 가장 보편적인 방법
		System.out.println("6:" + df.format(su));

		df = new DecimalFormat("#,##0.#");
		System.out.println("7:" + df.format(su));
		
		df = new DecimalFormat("#,##0.0");  // 소수 이하가 0인 경우도 표시하고 싶을때
		System.out.println("8:" + df.format(su));
		
		df = new DecimalFormat("@@@@@@@@@@@.0");
		System.out.println("9:" + df.format(su));
		
		double su2 = 0.9576;
		df = new DecimalFormat("0.0%");  // 0.00
		System.out.println("10:" + df.format(su2));
		
		df = new DecimalFormat("W#,##0");
		System.out.println("11:" + df.format(su));
		
		df = new DecimalFormat("\u00A4#,##0");  // 유니코드
		System.out.println("12:" + df.format(su));
		
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(su2));
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
		nf2.setMinimumFractionDigits(2);
		System.out.println(nf.format(su));
	}
}
