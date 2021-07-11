package day0125;
// 정렬
// 정렬이란?
// 값에 따라서 오름차순 혹은 내림차순으로
// 배열안의 값들을 정리해주는 것
// 오름차순 : 인덱스가 작을수록 값도 작음
// 내림차순 : 인덱스가 작을수록 값음 큼

// 우리가 직접 정렬을 만들어보자
public class Ex05Sort {
	public static void main(String[] args) {
		int[] intArray = {3, 1, 9, 4, 8, 2};
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.printf("intArray[%d] : %d\n", i , intArray[i]);
		}
		
		// 우리가 구현할 정렬 방법은
		// 인덱스와 그 다음 인덱스의 값을 비교해서
		// 만약 다음 인덱스가 더 작으면
		// 두개의 위치를 바꿔주고 처음부터 다시 검사하는 형식으로
		// 진행되게 된다.
		
		for(int i = 0; i < intArray.length - 1; i++) {
			// length-1을 안해주면 ↓배열5랑 배열6이랑 비교하게되겠지,그럼 배열6이 없잖아
			// 그렇기때문에 -1을 해주는거임
			if(intArray[i] > intArray[i+1]) {
				System.out.println(i+"번째가 "+(i+1)+"번째보다 크므로 바꾼다.");
				
				//전구를 갈려면 3명이 필요 temp가 도와줘야함
				int temp = intArray[i];
				intArray[i] = intArray[i+1];
				intArray[i+1] = temp;
				i = -1;
				//0번 인덱스인 제일 앞에서 부터 다시 검사해야하니까
				//i++를 대비해서 마이너스 처리 하는거임 합치면 0 이 되니까
				System.out.printf("%d %d %d %d %d %d\n",
						intArray[0],intArray[1],intArray[2],
					intArray[3],intArray[4],intArray[5]);
			}
				
		}
	}
}

// 숙제
// 가위바위보 게임을 만드세요
// 가위 : int 1
// 바위 : int 2
// 보  : int 3

// 예시 :
// 가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)
// > 5
// 잘못입력하셨습니다.
// 가위바위보 중 하나를 선택해주세요(가위: 1 바위: 2 보: 3)
// > 2
// 사용자: 바위
// 컴퓨터: 가위
// 사용자 승!!!
// 현재 전적: 1승 3무 2패
// 1. 플레이 2. 현재 전적 보기 3. 종료
// > 2
// 현재 전적은 1승 3무 2패입니다. 승률은 16.6667퍼센트 입니다.
// 1. 플레이 2. 현재 전적 보기 3. 종료
// > 3
// 사용해주셔서 감사합니다.













