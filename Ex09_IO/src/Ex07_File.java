import java.io.File;

/*
파일과 폴더 다루는 클래스

JAVA : 파일, 폴더 하나의 클래스 : File
>> a.txt 생성, 삭제, 정보 read
>> Temp 폴더 생성, 삭제, 정보 read

c# : File 클래스, Directory 클래스

절대경로 : C:\\, D:\\ >> C:\\Temp\\a.txt

상대경로 : 현재 파일을 중심으로 C:\\Test >> .. /Temp/
 */
public class Ex07_File {

    public static void main(String[] args) {
        String path = "C:\\Temp\\file.txt";
        File f = new File(path);
        //File 클래스 사용하면 : file에 대한 다양한 정보를 얻어낼수 있음
        System.out.println("파일명 : " + f.getName());
        System.out.println("전체경로 : " + f.getPath());
        System.out.println("절대경로 : " + f.getAbsolutePath());
        //path 를 로또 파일로 바꿨을때
//        파일명 : Lotto.txt
//        전체경로 : Lotto.txt
//        절대경로 : C:\Users\bitcamp\eclipse-workspace\Ex09_IO\Lotto.txt
        System.out.println("너 폴더니? : " + f.isDirectory()); //false
        System.out.println("너 파일이니? : " + f.isFile()); //true
        System.out.println("파일 크기 : " + f.length() + "byte"); //length는 byte값을 반환
        System.out.println("부모경로 : " + f.getParent());
        System.out.println("파일 폴더 실 존재여부 : " + f.exists());
        
        //f.createNewFile(); 파일생성
        //f.delete(); 파일삭제
        //f.canRead() 
        
    }

}
