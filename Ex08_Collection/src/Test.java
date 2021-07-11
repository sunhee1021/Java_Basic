
public class Test {

	public static void main(String[] args) {
		String regExp = "^([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\."
							+"([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\."
							+"([01]?\\d?\\d|2[0-4]\\d|25[0-5])\\."
				            +"([01]?\\d?\\d|2[0-4]\\d|25[0-5])$";
				
		String ipNum1 = "0.0.0.0";
		String ipNum2 = "0-0-0-0";
		String ipNum3 = "255.255.255.255";
		String ipNum4 = "255.255.255.256";
		String ipNum5 = "300.255.255.255";
		String ipNum6 = "22.33.44.55";
		String ipNum7 = "192.168.1.215";
		String ipNum8 = "192..1.215";
		
		System.out.println("ip주소(IPv4기준) 테스트 결과1 : " +ipNum1.matches(regExp));
		System.out.println("ip주소(IPv4기준) 테스트 결과2 : " +ipNum2.matches(regExp));
		System.out.println("ip주소(IPv4기준) 테스트 결과3 : " +ipNum3.matches(regExp));
		System.out.println("ip주소(IPv4기준) 테스트 결과4 : " +ipNum4.matches(regExp));
		System.out.println("ip주소(IPv4기준) 테스트 결과5 : " +ipNum5.matches(regExp));
		System.out.println("ip주소(IPv4기준) 테스트 결과6 : " +ipNum6.matches(regExp));
		System.out.println("ip주소(IPv4기준) 테스트 결과7 : " +ipNum7.matches(regExp));
		System.out.println("ip주소(IPv4기준) 테스트 결과8 : " +ipNum8.matches(regExp));
	}

}
