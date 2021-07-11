package day0121;
//숙제 1: BMI 계산기를 만들어서 사용자의 BMI 수치와 현재 체중 상태를
//출력하는 프로그램을 작성하시오.
//단 사용자가 잘못된 키나 몸무게를 입력하면 올바른 값을 입력할 때까지
//다시 입력을 받으세요.

import java.util.Scanner;
public class Hw01_1 {
	// 사용자의 최대 키 값 (상수들)
    static final double MAX_HEIGHT = 2.72;
    // 사용자의 최대 몸무게 값
    static final double MAX_WEIGHT = 465;
    // 저체중 BMI 값
    static final double LOW_WEIGHT_BMI = 18;
    // 정상체중 BMI 값
    static final double NORMAL_WEIGHT_BMI = 23;
    // 과체중 BMI 값
    static final double OVER_WEIGHT_BMI = 25;

    
    public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("키를 m단위로 입력하세요. ");
        double height=scanner.nextDouble();
        
        while(height<0 || height>MAX_HEIGHT) {
           
        	System.out.println("잘못입력하셨습니다.");
            System.out.println("키를 m단위로 입력하세요.");   
         height=scanner.nextDouble();

        }
        
        // while문이 종료되었다
        // =while 의 조건이 false가 되었다
        // =height의 값이 0~2.72사이이다.
        
        System.out.println("몸무게를 kg단위로 입력하세요.");
        double weight=scanner.nextDouble();
        
        while(weight<0 || weight>MAX_WEIGHT) {
            System.out.println("잘못입력하셨습니다.");
            System.out.println("키를 m단위로 입력하세요."); 
           weight=scanner.nextDouble();

        }


        double BMI = weight/height/height;
            
        System.out.printf("당신의 BMI:%.2f\n ",BMI);
        
        // 키랑 몸무게 둘다 0보다 크기때문에 bmi>0 조건은 필요없음
        if(BMI<LOW_WEIGHT_BMI) {
            System.out.println("저체중");
        }else if(BMI<NORMAL_WEIGHT_BMI) {
            System.out.println("정상체중");
        }else if(BMI<OVER_WEIGHT_BMI) {
            System.out.println("과체중");
        }else {
            System.out.println("비만");
        }
        
               
        scanner.close();
        }
    }
    
