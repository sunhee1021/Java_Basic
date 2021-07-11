import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
Map 인터페이스
Map (key, value) 쌍(pair)의 구조를 갖는 배열
ex) (02,서울) (031,경기)
key : 중복(허용하지않음)
value : 중복(허용)
generic 지원 (= key값과 value값도 타입을 강제할수 있다)

Map 인터페이스 구현
구버전 : HashTable 동기화보장
신버전 : HashMap 동기화를 강제하지 !않음! : 성능고려해서 설계 (한강_비빔밥)


 */
public class Ex12_Map_Interface {
    public static void main(String[] args) {
        //HashMap<K,V>
        HashMap map = new HashMap();
        map.put("Tiger", "1004"); //사용자 아이디 패스워드에 사용하면 되겠다
        map.put("scott", "1004");
        map.put("superman", "1004");
        System.out.println(map.containsKey("tiger")); // false(왜? 자바는 대소문자를 구분하잖아)
                                                      //아이디 중복확인시 사용하면 좋다
        System.out.println(map.containsKey("scott"));
        System.out.println(map.containsValue("1004"));
        System.out.println(map.containsValue("1007"));
        //value값은 하나라도 있으면 true
        
        //Point
        //Key를 제공하면 value값을 알수있다(핵심)
        System.out.println(map.get("superman")); // get함수로 key값을 던져주면 value값을 리턴한다
        System.out.println(map.get("hong")); //해당 키에 해당하는 value값이 없으면 null값을 리턴한다
                                             
        
        map.put("Tiger", "1007"); //key는 중복이 안되고 value값을 덮어쓴다(오버라이트)
                                  //=("Tiger", "1004")->("Tiger", "1007")
                                  //비밀번호 변경시 사용하면 좋다
        System.out.println(map.get("Tiger"));
        System.out.println(map.size());
        
        
        Object value = map.remove("superman"); 
        //key값을 삭제할때 혹시 나중에 value 값이 필요할지몰라서 저장(?)해주는거임???????????
        //나중에 확인
        System.out.println("value : "+value);
        
        System.out.println(map.toString());
        //{scott=1004, Tiger=1007} 재정의
        
        Set set = map.keySet(); 
        //key 집합 >> 규칙 > 순서없음 > 대신 중복되지 않음 == Set
        Iterator it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        
        Collection clist = map.values();
        System.out.println(clist.toString());
        //value는 중복값이 있어서 set에 못들어가서(?) List에 넣어줘야해 그래서 return값이 Collection
        
        //Map 하고 List를 혼합(String 채팅방, ArrayList 참여자)
        //HashMap<String,ArrayList> room = new HashMap<String,ArrayList>();
        //HashMap<String,List> room = new HashMap<String,List>();
        //room.add("1",new ArrayList()); 1번방에 참여자들list
        

    }

}
