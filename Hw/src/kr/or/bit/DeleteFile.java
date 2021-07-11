package kr.or.bit;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        
        if(args.length != 3 && args.length != 4) {
            System.out.println("사용법 : [파일경로] delete [대상파일명.확장자]");
            System.out.println("예시 : java DeleteFile C:\\Temp delete Test.txt");
            System.exit(0);
        }
        File f = new File(args[0]);
        if(!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 경로입니다.");
            
            System.exit(0);
        }
    }
    
    public static void deleteFolder(String path) {
        
        File folder = new File(path);
        try {
        if(folder.exists()){
                File[] folder_list = folder.listFiles(); //파일리스트 얻어오기
                
        for (int i = 0; i < folder_list.length; i++) {
            if(folder_list[i].isFile()) {
            folder_list[i].delete();
            System.out.println("파일이 삭제되었습니다.");
            }else {
            deleteFolder(folder_list[i].getPath()); //재귀함수호출
            System.out.println("폴더가 삭제되었습니다.");
            }
            folder_list[i].delete();
         }
         folder.delete(); //폴더 삭제
           }
       } catch (Exception e) {
        e.getStackTrace();
       }
    }
}