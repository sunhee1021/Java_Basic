import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
Stream 중간 매개체(데이터 통로) -> default모양은 : Byte들이 통과할수있는

JAVA API
추상 클래스
InputStream, OutPutStream

입출력 [대상] 두개의 추상클래스를 상속받아서 재정의 사용

1. Memory : ByteArrayInputStream, ByteArrayOutputStream.....
2. File : FileInputStream, FileOutputStream...(이게 젤중요)



 */
public class Ex01_Stream {
    public static void main(String[] args) {
        //byte(-128~127) 정수를 저장하는 데이터 타입
        byte[] inSrc = {0,1,2,3,4,5,6,7,8};
        byte[] outSrc = null; //현재 메모리를 가지고 있지 않다 (초기화)
        
        //데이터를 read, write 대상 memory
        ByteArrayInputStream input = null;
        ByteArrayOutputStream output = null;
        
        input = new ByteArrayInputStream(inSrc); //inSrc 배열(메모리)에 빨대를 꽂은거임 >> 얘를 read 하겠다
        output = new ByteArrayOutputStream(); //어디다가 write 할지 정해지지 않음
        
        System.out.println("ourSrc before : " + Arrays.toString(outSrc));
        
        //공식같은 로직
        int data = 0;
        while((data = input.read()) != -1) { //더이상 read data 없으면 -1
            System.out.println("data : " + data); //read()함수가 내부적으로 next를 하기때문에
                                                  //while(input.read() != -1) 해서
                                                  //System.out.println(input.read()); 해버리면
                                                  //결과값이 1,3,5,7,-1 이렇게 나옴
         
            //read 한 데이터를 다른 메모리 write 하고싶음
            output.write(data);
            //write의 대상이 data가 아니라!!!!!!
            //ByteArrayOutputStream 자신의 통로 data 가진다
            //data를 읽어서 ByteArrayOutputStream 객체에다가 write를 하는거임
            
        }
        System.out.println(output.toByteArray()); //가지고 있는곳의 주소
        
        outSrc = output.toByteArray();
        
        System.out.println("outSrc after : " + Arrays.toString(outSrc));
        //배열도 메모리 빨대도 메모리 잘 이해해봐
    }

}
//유스케이스
//포함관계(의무사항)반드시해야하는것
//extends include 화살표방향 확인
// or        and 
//