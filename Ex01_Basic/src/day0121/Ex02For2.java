package day0121;
// 1. 1부터 10까지 출력되는 for 문을 작성하시오
// 2. 8부터 3까지 출력되는 for 문을 작성하시오
// 3. 사용자로부터 시작 숫자와 끝 숫자를 입력받아서
//    그 숫자들을 차례대로 출력하시오
// 4. 사용자로부터 숫자를 하나 입력 받아서
//    1부터 그 수까지의 홀수들만 출력하시오
// 5. 사용자로부터 숫자를 하나 입력 받아서
//    1부터 그 수 까지의 합을 구하시오
// 6. 사용자로부터 숫자를 하나 입력 받아서
//    1부터 그 수 까지의 곱을 구하시오
// 힌트 : 5,6번은 변수의 선언위치를 고민해보시오.
import java.util.Scanner;
public class Ex02For2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1. 1부터 10까지 출력되는 for 문을 작성하시오
		System.out.println("---------------1번----------------");
		int start = 1;
		int end = 10;
		
		for(int i = start; i <= end; i++) {
			System.out.println(i);
		}
		
		// 2. 8부터 3까지 출력되는 for 문을 작성하시오
        System.out.println("---------------2번----------------");
        //여기서 int start로 안하는 이유 (중복 선언이 되기때문에)
        start = 8;
        end = 3;
        
        for(int i = start; i >= end; i--) {
			System.out.println(i);
		}
        // 3. 사용자로부터 시작 숫자와 끝 숫자를 입력받아서
        //      그 숫자들을 차례대로 출력하시오
        System.out.println("---------------3번----------------");
        System.out.println("시작 지점: ");
        start = scanner.nextInt();
        System.out.println("끝 지점: ");
        end = scanner.nextInt();
        if(start <= end) {
        for(int i = start; i <= end; i++) {
        	System.out.println(i);
        }
        }else {
        	for(int i = start; i>=end; i--) {
        		System.out.println(i);
        	}
        }
        // 4. 사용자로부터 숫자를 하나 입력 받아서
        //    1부터 그 수까지의 홀수들만 출력하시오
        System.out.println("---------------4번----------------");
        
        start = 1;
        
        System.out.print("숫자: ");
        end = scanner.nextInt();
        
        for(int i=start; i <= end; i++ ) {
        	if(i%2 == 1) {
        		System.out.println(i);
        	}
        }
        
        // 5. 사용자로부터 숫자를 하나 입력 받아서 
        //    1부터 그 수 까지의 합을 구하시오
        System.out.println("---------------5번----------------");
        
        start = 1;
        System.out.print("숫자: ");
        end = scanner.nextInt();
        
        //for문에서 더해지는 값을 받으려면 이 위치에 선언을 해야함,for문안에 말고(int sum=0;)
        //for문앞에 sum=0;을 선언하면 계속 초기화 되기때문
        int sum = 0;
        for(int i = start; i <= end; i++) {
        	sum += i;
        }
        System.out.printf("1부터 %d 까지의 합: %d\n", end,sum);
        
     
        // 6. 사용자로부터 숫자를 하나 입력 받아서
        //      1부터 그 수 까지의 곱을 구하시오
        System.out.println("---------------6번----------------");
		
        start = 1;
        System.out.print("숫자: ");
        end = scanner.nextInt();
        int factorial = 1;
        
        if(end >= 13) {
        	System.out.println("오버플로우가 발생하여 정확한 결과를 출력할수 없습니다.");
        }else {
        	for(int i = start; i <= end; i++) {
            	factorial *= i;
            }
            System.out.printf("1부터 %d 까지의 곱: %d\n", end,factorial);
        }
        //숫자가 늘어나면 오버플로우가 발생
        //이유는 int는 20억까지만 가능하기때문
        //13 이후부터는 20억이 넘어가서 부정확한 값이 나옴
        
		scanner.close();
	}
}









