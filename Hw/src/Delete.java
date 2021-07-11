import java.io.File;

public class Delete {
    public static void main(String[] args) throws Exception {

        if(args.length != 3 && args.length != 4) {
            System.out.println("사용법 : [파일경로] delete [대상파일명.확장자]");
            System.exit(0);

        }

        File f = new File(args[0]);
        if(!f.exists() || !f.isDirectory()) {
            System.out.println("유효하지 않은 경로입니다");
            System.exit(0);
        }

        if(args[1].equals("delete")) {

            args[2] = f.getPath() + "\\" + args[2];

            File newfile = new File(args[2]);

            if(newfile.exists()) {
                newfile.delete();
            }else {
                System.exit(0);

            }

        }
    }
}
