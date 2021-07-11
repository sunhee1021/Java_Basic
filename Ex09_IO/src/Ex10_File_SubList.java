import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_SubList {
    static int totalfiles = 0;
    static int totaldirs = 0;
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("사용법 : java [실행할 파일명] [경로명]");
            System.out.println("예시 : java Ex10_File_SubList C:\\Temp");
            System.exit(0);
        }
        File f = new File(args[0]);
        if(!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 경로");
            System.exit(0);
        }
        //정상적인 경로, 폴더
        printFileList(f);
        //여기서 누적된 값을 나오게 하면됨
        System.out.println("누적 총 파일수 : " + totalfiles);
        System.out.println("누적 총 폴더수 : " + totaldirs);
    }
    
    static void printFileList(File dir) {
        System.out.println("[Full path : ]" + dir.getAbsolutePath());
        
        List<Integer> subdir = new ArrayList<Integer>();
        File[] files = dir.listFiles();
        //[0] >> a.txt
        //[1] >> 1.jpg
        //[2] >> 2021 폴더
        //[3] >> 2022 폴더
        
        for(int i = 0; i < files.length; i++) {
            String filename = files[i].getName();
            if(files[i].isDirectory()) {
                filename = "<DIR> [" + filename + "]";
                
                
                //POINT
                subdir.add(i); //왜 이런짓을할까?
                //list[0] >> 2
                //list[1] >> 3 폴더의 위치값 (텍스트파일 ,jpg말고)
                        
            }else {
                filename = filename + " / " + files[i].length() + "Byte";
            }
            
            System.out.println("  " + filename);
        }
        int dirnum =subdir.size();  //폴더개수
        int filenum = files.length - dirnum; //파일개수 (전체-폴더개수)
        
        //함수가 종료되어도 가지고 있고 싶어요
        //static 변수
        totaldirs += dirnum; // 총 누적 (하위폴더까지 나옴)
        totalfiles += filenum;
        
        System.out.println("[Current dirNum] : " + dirnum);
        System.out.println("[Current fileNum] : " + filenum);
        System.out.println("**********************************");
        
        //POINT (폴더안의 폴더(하위 폴더))도 보고싶으면
        for(int j = 0; j < subdir.size(); j++) {
            int index = subdir.get(j);
            //index > 2
            //printFileList(C:\\Temp\\2021)
            //static void printFileList 로 돌아가서 
            //다시 찾기시작하는거야
            printFileList(files[index]); //POINT 
        }
        
        
    }

}
