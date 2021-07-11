package day0119;

import java.util.Scanner;
public class Ex15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 두개를 입력해주세요");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		
		System.out.println("-----------------");
		System.out.printf("%.1f"+" + "+"%.1f 결과값은? \n",num1,num2);
		System.out.println(num1 + num2);
		
		System.out.println("-----------------");
		System.out.printf("%.1f"+" - "+"%.1f 결과값은? \n",num1,num2);
		System.out.println(num1 - num2);
		
		System.out.println("-----------------");
		System.out.printf("%.1f"+" * "+"%.1f 결과값은? \n",num1,num2);
		System.out.println(num1 * num2);
		
		System.out.println("-----------------");
		System.out.printf("%.1f"+" / "+"%.1f 결과값은? \n",num1,num2);
		System.out.println(num1 / num2);
		
		
		scanner.close();
	}
}
