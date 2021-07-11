package kr.or.bit;
import java.util.Scanner;
import java.util.Random;

class SeatReservation {
	private static int i;
	private static int j;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		String[][] seat = new String[4][5];

		while(true) {

			System.out.println("□□□□□□□□□□□□□□□□□□□");
			System.out.println("□□□영화 예매 시스템□□□");
			System.out.println("□□□□□□□□□□□□□□□□□□□");
			System.out.println("1. 예매하기");
			System.out.println();
			System.out.println("2. 예매조회");
			System.out.println();
			System.out.println("3. 예매취소");
			System.out.println();

			int userChoice = sc.nextInt();

			if(userChoice == 1) {

				System.out.println("========좌석 현황========");

				for(int i = 0; i < seat.length; i++) {
					for(int j = 0; j < seat[i].length; j++) {
						seat[i][j] = "["+(i+1)+"-"+(j+1)+"]"; //좌석
					}
				}
				for(int i = 0; i < seat.length; i++) {
					for(int j = 0; j < seat[i].length; j++) {
						System.out.print("["+(i+1)+"-"+(j+1)+"]");//좌석
					}
					System.out.println();

				}
				System.out.println("=======================");
				System.out.println("좌석을 선택해주세요. 예)1-1");
				System.out.println("이미 예매된 좌석은 \"예매\"라고 표시됩니다.");

				int row = sc.nextInt();
				int col = sc.nextInt();

				if(seat[row][col].equals(seat[i][j])) {
					System.out.println("예매가 완료되었습니다.");
				}else {
					System.out.println("예매");
				}


			}else if(userChoice == 2) {
				System.out.println("예매번호를 입력해주세요.");


			}else if(userChoice == 3) {
				System.out.println("예매번호를 입력해주세요.");
				System.out.println();


				for(int i = 0; i < seat.length; i++) {
					for(int j = 0; j < seat[i].length; j++) {
						seat[i][j] = "__"; //좌석
					}
				}
				System.out.printf("고객님이 예매하신 좌석은 [%d-%d] 입니다.\n", i+1,j+1);
				System.out.println();
				System.out.println("예매를 취소하시겠습니까?");
				System.out.println("예(1) , 아니오(2) 중 하나를 입력해주세요.");
				userChoice = sc.nextInt();
				if(userChoice == 1) {
					System.out.println("예매가 취소되었습니다. 감사합니다.");

				}else if(userChoice == 2) {
					return;
				}

			}


		}
	}

}
