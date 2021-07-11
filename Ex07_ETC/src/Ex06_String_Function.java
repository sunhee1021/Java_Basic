
public class Ex06_String_Function {

	public static void main(String[] args) {
		//일상적으로 다루는 데이터 : 문자열, 숫자, 날짜 >> 함수 (시스템 함수)
		String str = "hello";
		String concatstr = str.concat("world");
		System.out.println(concatstr);
		
		boolean bo = str.contains("ello");
		System.out.println(bo);
		
		bo = str.contains("elo");
		System.out.println(bo);
		
		String str2 = "a b c d";
		System.out.println(str2.length());
		
		String filename = "hello java world";
		System.out.println(filename.indexOf("j"));
		System.out.println(filename.indexOf("java"));
		System.out.println(filename.indexOf("개폭망"));
		//****배열에서 값이 없다는건 return 값이 -1
		
		//신문사설에서 단어 찾을때
		//0보다 큰 값이 나오면 최소 1개 사설
		//-1 return 이면 찾는 단어가 없구나!
		if(filename.indexOf("wo") != -1) {
			System.out.println("wo 하나라도 가지고 있구나");
		}
		
		System.out.println(filename.lastIndexOf("a"));
		//뒤에서 가장 먼저 만나는 a의 값을 알아내라
		//뒤에서부터 세면 안돼ㅋㅋㅋㅋㅋㅋㅋㅋ배열이 뒤에서 부터 오는게 어딨어
		//앞에서 부터 해서 뒤쪽 a!
		
		//length(), indexOf(), substring(), replace(), split()
		
		String result = "superman";
		System.out.println(result.substring(0)); //superman
		
		System.out.println(result.substring(2)); //perman
		
		System.out.println(result.substring(1,2)); 
		//up가 나오나?
		//endindex(마지막 index)는 -1 처리 된대 // 그래서 결과는 u
		
		System.out.println(result.substring(0,0));
		//(0,-1) 인거지 결과는 안나와요!
		
		System.out.println(result.substring(0,1)); //s 
		
		System.out.println(result.substring(2,3)); //p 
		
		//Quiz
		String filename2 = "hong.jpeg"; //또는 파일명이 hong.png 또는 파일명이 h.tmp
		//여기서 파일명과 확장자를 분리해서 화면에 출력하세요
		//1. 파일명 h
		//2. 확장자는 jpeg
		//힌트. 위에서 배운 함수만 사용하세요.
		String[] name = filename2.split(".");
		
		for(String a : name) {
			System.out.println(a);
		}
		int position = filename2.indexOf(".");
		String file = filename2.substring(0,position);
		
		String extention2 = filename2.substring(position+1, filename2.length());
		String extention = filename2.substring(++position);
		
		System.out.println(file);
		System.out.println(extention);
		System.out.println(extention2);
		
		//replace (치환함수)
		String str3 = "ABCDADDDDDDA";
		String result3 = str3.replace("DDDD", "오늘은 월요일");
		System.out.println(result3); //ABCDA오늘은 월요일DDA
		
		result3 = str3.replace("A", "a");
		System.out.println(result3); //aBCDaDDDDDDa
		
		//ETC
		System.out.println(str3.charAt(0)); //A
		System.out.println(str3.charAt(3)); //D
		
		System.out.println(str3.endsWith("DDDA")); //true
		System.out.println(str3.endsWith("BDDDA")); //false
		
		System.out.println(str3.equalsIgnoreCase("abcDADDDDDDA"));
		//대소문자 구별하지 않는다
		
		//TODAT POINT(Split)
		/*
		String str4 = "슈퍼맨,팬티,노랑색,우하하,우하하";
		
		String[] namearray = str4.split(",");
		for(String s:namearray) {
			System.out.println(s);
		}
		*/
		
		//정규표현식
		String str4 = "슈퍼맨.팬티.노랑색.우하하.우하하";
        
        String[] namearray = str4.split("\\.");
        //자바가 \(역슬래시)를 이스케이프 문자로 인식하기때문에
        // \.(정규표현식) -> \ (역슬래시)를 하나더 해야 함 -> (\\.)
        for(String s:namearray) {
            System.out.println(s);
        }
       
        
		//String[] java.lang.String.split(String regex)
        //정규표현식 문법이어야 함
        //java, javascript, Oracle, C# > 언어들에서 정규표현식을 씀
        //어떠한 문자를 만들때 [규칙을 부여하자] >> 유효성에 대한 판단 근거를 만들자
        //주민번호 숫자 6자리-숫자 7자리  : {\d6}-{\d7}
        //                           십진수 6자리 - 십진수 7자리
        //123-1234567 >>  false
        //핸드폰번호, 차량번호, 우편번호, 한글처리, 도메인주소, 이메일주소
        //정규표현식은 이미 다 있어요 (정규표현식을 read 할줄 알아야 한다)
        //추후 과제로 올릴거임
        

		//TIP) Java 특수문자
		//이스케이프 문자 >> 특정 문자 앞에 \

		char sing = '\''; 

		// 야 나는 ' 하나를 표현하고 싶어 .... 역슬러시라는 문자와 결합해서 사용하면 ... 문자 인정 

		System.out.println(sing);
		
		//홍"길"동 이라는 문자를 String 변수에 저장하고 화면에 출력

		String ename = "홍\"길\"동";

		System.out.println(ename);
		
		
		//넌센스
		String str6 = "홍        길         동";
		//공백이 없어야해 // 가운데 공백을 제거하는 함수는 없어
		//공백을 제거해서 >> "홍길동" 이렇게 저장해야해
		System.out.println(str6.replace(" ", ""));
		
		String str7 = "       홍길동      ";
		//양쪽 공백을 제거하는 함수는 있다!
		System.out.println("<"+str7+">");
		System.out.println("<"+str7.trim()+">");
		
		String str8 = "     홍    길     동     ";
		String result5 = str8.trim();
		String result6 = str8.replace(" ", "");
		System.out.println(result6);
		
		
		//자바에서 여러개의 함수를 적용 (method chain 기법을 활용)
		System.out.println(str8.trim().replace(" ", "").substring(2));
		
		
		//Quiz - 1
		int sum = 0;
		String[] numarr = {"1","2","3","4","5"};
		//문제: 배열에 있는 문자값들의 합을 sum 변수에 담아서 출력 : 결과 15
		for(String s : numarr) {
			sum += Integer.parseInt(s);
		}
		System.out.println("합계 : "+sum);
		
		
		
		 //Quiz-2
		   String jumin="123456-1234567";
		   //위 주민번호의 합을 구하세요_1
		   int sum2=0;
		   for(int i = 0 ; i < jumin.length() ; i++) {
			   String numstr =jumin.substring(i, i+1);
			   if(numstr.equals("-")) continue;
			   sum2+= Integer.parseInt(numstr);
		   } 
		   System.out.println("주민번호 합:" + sum2);
		   
		 //위 주민번호의 합을 구하세요_2
		 //String jumin="123456-1234567";
		   String[] numarr2 = jumin.replace("-","").split("");
		   int sum3=0;
		   for(String i : numarr2) {
			   sum3+= Integer.parseInt(i);
		   }
		   System.out.println("주민번호 합2:" + sum3);
		   
		 //위 주민번호의 합을 구하세요_3
		   String jumin4 = jumin.replace("-", "");
		   int sum4=0;
		   for(int i = 0 ; i < jumin4.length() ;i++) {
			   sum4+=Integer.parseInt(String.valueOf(jumin4.charAt(i)));
		   }
		   System.out.println("주민번호 합4:" + sum4);
		
		}
		
	}


