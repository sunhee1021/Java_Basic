package day0121;

import java.util.Scanner;
public class Hw01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키 : ");
		double height = scanner.nextDouble();
		
		System.out.print("몸무게 : ");
		double weight = scanner.nextDouble();
		
		
		while ( height>=0 || height<=2.72 ) {
            System.out.println("키를 다시 입력하세요.");
            System.out.print("키: ");
            height = scanner.nextDouble();            
        }
		
		//while문이 종료되었다.
		//=while의 조건이 false가 되었다.
		//=height의 값이 0~2.72이다.
		
        while (weight>=0 || weight<=465 ) {
            System.out.println("몸무게를 다시 입력하세요.");
            System.out.print("몸무게: ");
            weight = scanner.nextDouble();            
        }
        
        System.out.println("-----------------------");
        System.out.println("키: "+ height);
        System.out.println("몸무게: "+ weight);
		
		
		double BMI = weight/height/height;
		System.out.printf("BMI수치 : " + "%.3f\n",BMI);
		
		if(BMI < 18.5) {
			System.out.println("저체중입니다.");
		}else if(BMI < 23) {
			System.out.println("정상체중입니다.");
		}else if(BMI < 25) {
			System.out.println("과체중입니다.");
		}else {
			System.out.println("비만입니다.");
		}
		
		
		
		scanner.close();
	}

}
