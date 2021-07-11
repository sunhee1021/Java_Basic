
public class BattleIronman extends Ironman{
	
	@Override 
	public void prepare_Ironman() {
		System.out.println("BattleIronman 의 부품을 가져옵니다.");
		System.out.println("BattleIronman 의 무기를 가져옵니다.");
		System.out.println("============준비완료============");
	}
	
	@Override
	public void assemble_Ironman() {
		System.out.println("BattleIronman의 부품을 조립합니다.");
		System.out.println("============조립완료============");
	}
}
