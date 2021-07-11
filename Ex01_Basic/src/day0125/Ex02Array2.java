package day0125;
// 1. 크기가 4인 int 배열을 만들어서
//    3 -4 22 11 이란 값을 넣어보세요
// 2. 크기가 3인 String 배열을 만들어서
//    "김철수" "이영희" "Jane Doe" 란 값을 넣어보세요
// 3. 크기가 6인 배열을 만들어서
//    사용자로부터 1~45의 값을 입력하도록 하시오
//    단, 사용자가 범위를 벗어난 값을 입력하면 올바른 범위의 값이 들어올때까지
//    다시 입력을 받으세요
// 4. 사용자로부터 3개의 이름을 입력 받아
//    String 배열에 저장하세요
import java.util.Scanner;
public class Ex02Array2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] intArray = new int[4];
		intArray[0] = 3;
		intArray[1] = -4;
		intArray[2] = 22;
		intArray[3] = 11;
		
		for(int i=0; i < intArray.length; i++) {
			System.out.printf("intArray[%d]: %d\n",i,intArray[i]);
		}
		
		String[] stringArray = new String[3];
		stringArray[0] = "김철수";
		stringArray[1] = "이영희";
		stringArray[2] = "Jane Doe";
		
		for(int i = 0; i < stringArray.length; i++) {
			System.out.printf("stringArray[%d]: %s\n",i,stringArray[i]);
		}
		
		
		 System.out.println("======3번문제======");
		   int[] intArray2 = new int[6];
		   
		   
		   
		   
		   for(int i = 0; i < 6; i++) {
		      
		      System.out.print((i+1)+"번째 숫자를 입력하세요 (범위: 1~45) > ");
		      int userNumber = scanner.nextInt();
		      
		      while(userNumber < 1 || userNumber > 45) {
		         System.out.println("숫자 범위를 초과하셨습니다.");
		         System.out.print("숫자를 다시 입력해주세요. (범위:1~45) >");
		         userNumber = scanner.nextInt();
		      }
		      
		      intArray2[i] = userNumber;
		   }
		   
		   
		   for(int i = 0; i <6; i++) {
		      System.out.printf("intArray2[%d]: %d\n", i, intArray2[i]);
		   }
		//--------------------------------------------------------
		   System.out.println("======4번문제======");
		   
		   
		   String[] stringArray2 = new String[3];
		   
		   
		   scanner.nextLine();
		   
		   
		   for(int i = 0; i < stringArray2.length; i++){
			   
			   System.out.print("이름을 입력해주세요: ");
			   stringArray2[i] = scanner.nextLine();
           }

           for(int i = 0; i < stringArray2.length; i++){

           System.out.println("이름: " +stringArray2[i]);

       }
			
		
		scanner.close();
	}

}















