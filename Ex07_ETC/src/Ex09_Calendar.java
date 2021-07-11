import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.Edu_Date;


/*
* Calendar 를 상속받아 완전히 구현한 클래스는
 * GregorianCalendar
   buddhisCalendar 있는데 getInstance()는 [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
      �±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
     �� �ν��Ͻ��� ��ȯ�Ѵ�
   GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
   �׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
   �׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
   ������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......   }  }
  API : ������ Protected Calendar() 
 */
//Java API
//날짜 : Date (구) -> Calendar(신)
public class Ex09_Calendar {
	public static void main(String[] args) {
	    Date dt = new Date();
	    System.out.println(dt.toString());
	    
	    //신버전
	    //Calendar cal = new Calendar(); //추상클래스라 new 할수 없어
	    Calendar cal = Calendar.getInstance(); // 내부적으로 new 날짜 객체생성 주소전달
	    System.out.println(cal.toString()); //재정의 (날짜 정보 다 출력)
	    
	    //당신이 필요한 형식을 추출해서 조합 사용해라
	    System.out.println("년도 : " + cal.get(Calendar.YEAR));
	    System.out.println("월(0~11) : " + (cal.get(Calendar.MONTH)+1));
	    System.out.println("년도 : " + cal.get(Calendar.DATE));
	    
	    //cal.get() 리턴타입 >> 정수 >> 결과 >> 연산
	    
	    System.out.println("이 달의 몇째 주 : " + cal.get(Calendar.WEEK_OF_MONTH));
	    System.out.println("이 달의 몇번째 일 : " + cal.get(Calendar.DAY_OF_MONTH));
	    System.out.println("이 주의 몇번째 일 : " + cal.get(Calendar.DAY_OF_WEEK));
	    System.out.println("시 : " + cal.get(Calendar.HOUR));
	    System.out.println("시 : " + cal.get(Calendar.MINUTE));
	    System.out.println("시 : " + cal.get(Calendar.SECOND));
	    
	    System.out.println("시 : " + cal.get(Calendar.AM_PM)); //오전 0
	    
	    //학사관리 시스템
	    //회원가입 페이지, 학사 신청 페이지 >> 페이지 본수 200페이지
	    //150페이지는 날짜 저보
	    //상단에 현재 날짜 출력 ex)2021-02-17
	    //요구사항 : 2021년 02월 17일
	    //150 수정을 통해서 변경......
	    
	    //별도의 class 설계 >> method 통해서 >>
	    //150 >> EduDate.today() >> 호출 >> 변경 >> today 함수 한번만 수정
	    
	    String result = Edu_Date.DateString(cal);
	    System.out.println(result);
	    
	    result = Edu_Date.DateString(cal,"-");
        System.out.println(result);
        
        result = Edu_Date.monthFormat_DateString(cal);
        System.out.println(result);
        
	    
	    
	}
	
}








