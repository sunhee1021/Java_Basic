
interface Touchable{
	Boolean TouchPen = true;
	void Touching();
}

class Pc{
	public int price;   
	public String color = "Black"; 
	public String brandName = "삼성";
	Pc(int price){
		this.price = price;
	}

}

//데스크탑
class Desktop extends Pc{

	Desktop() {
		super(1000);
	}
	String mainBody = "메인바디";
	boolean VGAport = true;        
}

//노트북
abstract class myNoteBook extends Pc{

	myNoteBook(int price) {
		super(price);
	}

	void folding() {
		
	}
}


class ANoteBook extends myNoteBook {

	ANoteBook() {
		super(5000);
	}
	@Override
	void folding() {
		System.out.println("A노트북의 폴딩기능");
	}
	
	private boolean cdrom = true;


}

class BNoteBook extends myNoteBook implements Touchable {

	BNoteBook() {
		super(4000);
	}

	private boolean ssdCard = true;


	@Override
	public void Touching() {
		System.out.println("터치 기능");
		// TODO Auto-generated method stub

	}
	@Override
	void folding() {
		System.out.println("B노트북의 폴딩기능");
	}

}

class CNoteBook extends myNoteBook implements Touchable{
	CNoteBook() {
		super(3000);
	}

	boolean ramExtendedSlot = true;

	@Override
	public void Touching() {
		System.out.println("터치 기능");
		// TODO Auto-generated method stub    
	}
	@Override
	void folding() {
		System.out.println("C노트북의 폴딩기능");
	}
}

	class smartPhone implements Touchable{
		void call() {
			System.out.println("통화 기능 입니다.");

		}
		void message() {
			System.out.println("메시지 기능입니다.");
		}    
		@Override
		public void Touching() {
			System.out.println("터치 기능입니다.");       
		}    
	}




public class Diagram {
	public static void main(String[] args) {
		Desktop desktop = new Desktop();
		ANoteBook anotebook = new ANoteBook();
		BNoteBook bnotebook = new BNoteBook();
		CNoteBook cnotebook = new CNoteBook();
		smartPhone phone = new smartPhone();

		anotebook.folding();
		bnotebook.folding();
		cnotebook.folding();

		bnotebook.Touching();
		cnotebook.Touching();
		phone.Touching();
		

		System.out.println(cnotebook.color);
		System.out.println(bnotebook.price);


	}
}

















