import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Images {
    public static void main(String[] args) {
        System.out.println(new Date());
        FileInputStream in = null;
        FileOutputStream out = null;
        String[] fileName = GetFileName.getFileName("C:\\Users\\lbb\\Desktop\\img\\a");
        for (String s : fileName) {
            try {
                String sourceFileUrl = "C:\\Users\\lbb\\Desktop\\img\\a\\"+s;//文件存放目录

                String targetFileUrl = "C:\\Users\\lbb\\Desktop\\img\\b\\"+s.substring(0,31)+".png";//输出目录
                in = new FileInputStream(sourceFileUrl);
                out = new FileOutputStream(targetFileUrl);
                byte[] bytes = new byte[1024];
                int data = 0;
                while ((data=in.read(bytes))!=-1){
                    //将读取到的字节异或上一个数，加密输出
                    for (int i = 0; i < bytes.length; i++) {
                        bytes[i] = (byte) (bytes[i]^(0xe3));//0xc6可以改
                    }
                    out.write(bytes);//0xc6可以改
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                //在finally中关闭开启的流
                if (in!=null){
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (out!=null){
                    try {
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        System.out.println(new Date());
    }
}
class GetFileName {

    public static String[] getFileName(String path) {

        File file = new File(path);

        String[] fileName = file.list();

        return fileName;

    }
}