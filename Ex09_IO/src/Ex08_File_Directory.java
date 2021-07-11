import java.io.File;

public class Ex08_File_Directory {
    public static void main(String[] args) {
//        System.out.println(args[0]);
//        System.out.println(args[1]);
//        System.out.println(args[2]);
        if(args.length != 1) {
            System.out.println("사용법 : java 파일명 [디렉토리명]");
            System.exit(0); //프로그램 강제 종료
            
        }
        File f = new File(args[0]);
        if(!f.exists()|| !f.isDirectory()) { // = 존재하지 않거나 또는 디렉토리가 아니라면
           System.out.println("유효하지 않은 경로");
           System.exit(0);
        }
        
        //실제 존재하는 경로의 폴더라면
        File[] files = f.listFiles();  //C:\\Temp >> 안에 파일도 있고 폴더도 있음
        //Temp폴더 안에 >> a.txt-> 이것도 File, 참새폴더-> 이것도 File -각각의 파일들을 파일로 보는거임
        //files[0] >> a.txt
        //files[1] >> 참새폴더
        for(int i = 0; i < files.length; i++) {
            String name = files[i].getName();
            System.out.println(files[i].isDirectory()? "[DIR]"+name : name);
        }
        
        
    }

}
