import java.util.Scanner;

public class Cinema3 {
	
	private Scanner scanner; // 입력
	private String[][] seat;
	private int[][] reservedNumber;
	
	public Cinema3() {
		scanner = new Scanner(System.in);
		seat = new String[4][5];
		reservedNumber = new int[4][5];
	}
	
	// 메뉴 선택 
	
	public void selectSeatStart() {
	
		loop_1:while(true) {	
		String selectnum = showMenu();
	
		switch(selectnum) {
		case "1":
			selectSeat(); // 좌석 예매
			break;
		case "2":
			seatInfo();   // 좌석 조회 
			break;
		case "3":
			reservedConfirm(); 	  // 예매 조회		
			break;
		case "4":
			cancel(); // 예매 취소
			break;
		case "5":
			break loop_1; // break문이 while 라벨 위치로 감 
			
			}
		}
	}
	
	// 좌석 초기화
	public void seatInit() {
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				seat[i][j] =(i+1) + "-" + (j+1);
			}
		}
	}
	// 메뉴 보기
	public String showMenu() {
		System.out.println("*************");
		System.out.println("1. 예매 하기");
		System.out.println("2. 좌석 조회");
		System.out.println("3. 예매 조회");
		System.out.println("4. 예매 취소");
		System.out.println("5. 종료 하기");
		String selectnum  = scanner.nextLine();
		return selectnum;
	}
	
	public void selectSeat() {
		System.out.println("좌석을 선택해주세요 예)1-1");
		System.out.println("이미 예매된 좌석은 \"예몌\"라고 표시합니다.");
		String select1 = scanner.nextLine(); // 좌석 선택 
		
		System.out.println("예매 가능합니다. 예매 하시겠습니까?");
		System.out.println("네(1) 아니오(2) 중 하나를 입력해주세요.");
		int select2 = Integer.parseInt(scanner.nextLine()); // 네 아니오 
		
		switch(select2) {
		case 1:
			for(int i = 0; i < seat.length; i++) {
				for(int j = 0; j < seat[i].length; j++) {
					if(select1.equals(seat[i][j])) { 
						seat[i][j] = "예매";
						reservedNumber[i][j] =(int)(Math.random()*10000000);
						System.out.println("예매가 완료되었습니다.");
						System.out.printf("예매한 좌석번호 : [%d-%d] / 예매번호[%d]\n",i+1,j+1,reservedNumber[i][j]);
					} else if(seat[i][j] == "예매") { // 이미 예매로 되어있는 경우
						System.out.println("이미 예약중 입니다.");
					} 
				}
			} 
			break;
		case 2:
			System.out.println("다시 선택해주세요.");
			break;
		default:
			break;
		}	
	}
	// 2번 좌석 조회
	public void seatInfo() {
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				System.out.printf("[%s]",seat[i][j]);
			}
			System.out.println();
		} 
	}
	// 3번 예매 조회
	private void reservedConfirm() { 
		System.out.println("예매 번호를 입력해주세요.");
		int select = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(select == reservedNumber[i][j]) {
					// 숫자끼리는 == 로 비교 
					System.out.printf("고객님이 예매하신 번호는 [%d-%d] 입니다." , i+1 , j+1);
				}
			}
		}		
	}	
	// 4번 예매 취소 - 예매번호를 입력받고 고객님의 예매번호 출력후  예매취소하겠냐 물은다음 예매번호가 내가 선택한 번호랑 같으면
	// 다시 초기값 0 으로 되돌린다.
	private void cancel() {
		System.out.println("예매 번호를 입력해주세요.");
		int select1 = Integer.parseInt(scanner.nextLine());
		
		for(int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				if(select1 == reservedNumber[i][j]) {
					System.out.printf("고객님이 예매하신 좌석은 [%d-%d] 입니다.\n", i+1,j+1);
				}
			}
		}
		
		System.out.println("예매를 취소 하시겠습니까 ?");
		System.out.println("네(1) , 아니오(2) 중 하나를 입력하세요.");
		int select2 = (int)Integer.parseInt(scanner.nextLine());
		switch(select2) {
		case 1:
			for(int i = 0; i < reservedNumber.length; i++) {
				for(int j = 0; j < reservedNumber.length; j++) {
					if(reservedNumber[i][j] == select1) {
						seat[i][j] = (i+1) + "-" +(j+1);
						reservedNumber[i][j] = 0;
						System.out.println("예매가 취소되었습니다.");
					}
				}
			}
			break;
		case 2:
			System.out.println("다시 선택하세요.");
			break;
		default :
			break;
		}	
	}	

}
