
public class IronmanMain {
	public static void main(String[] args) {
		
		// 템플릿 메소드 사용
		Ironman SI = new SupportIronman();
		SI.makeIronMan();
		System.out.println("==============================");
		
		// 템플릿 메소드 사용
		Ironman BI = new BattleIronman();
		BI.makeIronMan();
	}
}