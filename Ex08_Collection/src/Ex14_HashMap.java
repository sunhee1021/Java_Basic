import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
HashMap<k,V>

HashMap<String, String>
HashMap<Integer, String>
HashMap<String,Emp>    -> values 가 여러개의 값을 가진다 (활용많이하세요)
>> ex) put("kim",new Emp());

 */
class Student{
    int kor;
    int math;
    int eng;
    String name;
    
    public Student(int kor, int math, int eng, String name) {
        super();
        this.kor = kor;
        this.math = math;
        this.eng = eng;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [kor=" + kor + ", math=" + math + ", eng=" + eng + ", name=" + name + "]";
    }
    
}
public class Ex14_HashMap {
    public static void main(String[] args) {
        //선생님이 학생마다 고유아이디 부여
        HashMap<String, Student> sts = new HashMap<String, Student>();
        sts.put("kim", new Student(100,99,88,"홍길동"));
        sts.put("hong", new Student(50,40,60,"김유신"));
        //반 20명 관리
        
        Student std = sts.get("hong");
        System.out.println(std);
        
        
        //TIP 1
        //Map key, value 값으로 관리하잖아
        Set set = sts.entrySet();  // key + "=" + value 를 하나의 문자열로 만들어서 관리함
        //왜 Set으로 해줘야하나? 중복값이 없으니까? 있으면 안되니까?
        //모르겠네 공부하자
        
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        //hong=Student [kor=50, math=40, eng=60, name=김유신]
        //kim=Student [kor=100, math=99, eng=88, name=홍길동]
        
        
        //TIP 2
        //분리된 key, value 값 획득 가능? ㅇㅇ
        //class Entry {Object key, Object value}
        //Map{Entry[] elements} >> Map.Entry 인터페이스
        for(Map.Entry m : sts.entrySet()) {
            System.out.println(m.getKey() + "/" + ((Student)m.getValue()).name);
        }
        
        
        //set으로 받으면 한번에 / Map.Entry 타입으로 받으면 key와 value를 분리해서 얻을수 있다.

    }

}













