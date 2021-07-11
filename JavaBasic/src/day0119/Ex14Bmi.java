package day0119;

import java.util.Scanner;
public class Ex14Bmi {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("BMI 계산기");
		System.out.println("=======================");
		
		System.out.println("키를 입력해주세요.");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력해주세요.");
		double weight = scanner.nextDouble();
		System.out.println("=======================");
		
		System.out.printf("키:" +"%.1f\n",height);
		System.out.printf("몸무게:" +"%.1f\n",weight);
		
		double bmi = (weight / (height*height))*10000;
		System.out.printf("BMI수치:" +"%.1f",bmi);
		
				
		scanner.close();
	}

}
