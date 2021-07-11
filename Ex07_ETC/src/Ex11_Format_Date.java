import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex11_Format_Date {

	public static void main(String[] args) throws Exception {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
		System.out.println(dateFormat.format(cal.getTime()));

		
		DecimalFormat df = new DecimalFormat("#,###.0");
		String result = df.format(1234567.89);
		System.out.println(result);
		
		
		 Date date = new Date();
		    long mstime =  date.getTime();
		    //getTime�� Date object�� January 1, 1970, 00:00:00 
		    //GMT���� �� �и��ʳ� �������� �������ִ� ������ �մϴ�.
		    System.out.println("mstime :" + mstime);
		    
		    SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			Date d1 = format.parse("02:10:10");
			System.out.println("d1 : " + d1);
			Date d2 = format.parse("01:05:07");
			System.out.println("d2 : "  + d2);
			long diff = d1.getTime() - d2.getTime();
			long sec = diff / 1000;
			long m = diff / 60000;
			long h = diff / 3600000;
			System.out.println("dif : " + diff + " "+  sec + "�� , " + m  + "�� , " + h  + "�� ���� �߻�");
		    /*
			 1000�и��ʴ� 1�ʴϱ�, getTime()���� ���� ���� 1000���� ������ �ʸ� ����ϴ�.
	                ���������� ���� ���� ���� 1000*60=60000���� ������,
	                �ø� ���� ���� 1000*60*60=3600000���� �����ϴ�.
			*/
			
			System.out.println(diffOfDate("20180101", "20180110"));
		}

		public static long diffOfDate(String begin, String end) throws Exception {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");

			Date beginDate = formatter.parse(begin);
			Date endDate = formatter.parse(end);
			System.out.println("beginDate : " + beginDate);

			long diff = endDate.getTime() - beginDate.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);

			return diffDays;
		}
}



