import java.util.Scanner;

public class Jumin {

	//4. 여기가 메인 메소드
	//check()함수에가서 InputJumin(입력받은값이) 함수를 돌면서 true인지 확인하고
	//genderCheck()함수에 가서 InputJumin(입력받은값이) 함수를 돌면서 true 인지 확인해서
	//&& 연산자로 이어져 있으니까 둘다 true이면
	//genderPrint()함수를 실행해라
	//그리고 break= 멈춰라 라는 뜻임
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("주민등록번호를 입력해주세요.(-를 포함해서 입력)");
			String InputJumin = scanner.nextLine();
			
			if(check(InputJumin) == true && genderCheck(InputJumin) == true) {
			genderPrint(InputJumin);
			break;
			}
		}


	}
	
	//1.입력받은 주민등록번호가 14자리가 맞는지, 입력받은 주민등록번호중 7번째문자가 "-"이게 맞는지 확인하는 메소드
	static boolean check(String InputJumin) {
		return (InputJumin.length() == 14 && InputJumin.substring(6, 7).equals("-") ? true : false);
	}
	
	//2.입력받은 주민등록번호의 8번째 문자를 int로 바꿔서 genderNum에 저장하고
	//그 값이 1에서 4사이인지 체크해주는 메소드
	static boolean genderCheck(String InputJumin) {
		int genderNum = Integer.parseInt(InputJumin.substring(7, 8));
		return genderNum > 0 && genderNum < 5 ? true : false;
		
	}

	//3.입력받은 주민등록번호의 7번째 문자를
	//char gender에 저장
	//그 저장된 값이 1 또는 3이면 남자
	//그밖의 숫자면 여자 라고 출력해준다
	//여기서 그밖이라고 그냥 else를 쓴이유는
	//위에서 1~4사이라고 조건을 걸어놨기때문
	static void genderPrint(String InputJumin) {
		
		char gender = InputJumin.charAt(7);

		if(gender == '1' || gender == '3') {
			System.out.println("성별 : 남자");
		}else{
			System.out.println("성별 : 여자");
		}

	}
}


