import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {
    public static void main(String[] args) {
        //Set 인터페이스 : 순서를 보장하지!않음!, 중복허용하지!않음!
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("B");
        hs.add("A");
        hs.add("F");
        hs.add("K");
        hs.add("G");
        hs.add("D");
        hs.add("P");
        hs.add("A");
        hs.add("C");
        System.out.println(hs.toString());
        //[P, A, B, C, D, F, G, K] 순서 없지, 중복도 없고
        
        //TreeSet
        //순서x , 중복허용x >> 정렬(O)
        //순서는 BAFKG~ 이고
        //정렬은 ABCDE~ 이거야 헷갈리지말자
        //검색하거나 정렬 필요로 하는 자료구조(데이터의 집합을)
        
        //1. 이진트리구조
        //2. 데이터가 저장될때 정렬된다.
        //로또네!
        Set<Integer> lotto = new TreeSet<Integer>();
        for(int i = 0; lotto.size() < 6; i++) {
            lotto.add((int)(Math.random()*45+1));
        }
        System.out.println(lotto.toString());
        
    }

}
