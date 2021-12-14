package test;

import java.io.*;

public class FileTest {
    public static void main(String[] args) throws IOException {
//        File f=new File("C:/Users/xiaoxiao/Desktop/hello.txt");
        File f = new File("D:/hello.txt");
        if (f.exists()) {
            System.out.println("文件已存在");
        } else {
            try {
                f.createNewFile();
                System.out.println("文件创建成功");
            } catch (Exception e) {
                System.out.println(e.toString());
                System.out.println("文件创建失败");
            }
        }

        System.out.println("字符流的读写操作");
        FileInputStream in = new FileInputStream(f);
        InputStreamReader inputStreamReader = new InputStreamReader(in, "UTF-8");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
        inputStreamReader.close();


        String out = "start";
        FileOutputStream fileOutputStream = new FileOutputStream(f);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        bufferedWriter.write(out);
        bufferedWriter.close();
        outputStreamWriter.close();
        fileOutputStream.close();

        System.out.println("字节流的读写操作：");

        for (int i = 0; i < f.length(); i++) {
            byte[] bs = new byte[1024];
            byte[] bs1 = new byte[(int) f.length()];
            System.out.println(new String(bs));
            System.out.println(new String(bs1));
            char ch = (char) (in.read());
            System.out.println(ch);
        }

        System.out.println("");
        FileOutputStream fileOutputStream1 = new FileOutputStream(f, true);//在文件末尾添加
        String s = "guess";
        byte[] buff = s.getBytes();
        try {
            fileOutputStream1.write(buff);
            System.out.println("写入成功");

        } catch (IOException e) {
            e.toString();
        } finally {
            try {
                fileOutputStream1.close();
            } catch (IOException e) {
                e.toString();
            }
        }


//        OutputStream out=new FileOutputStream(f);
//        InputStream in=new FileInputStream(f);
//        System.out.println(f.exists());
    }
}
