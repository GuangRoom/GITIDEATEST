package com.atguigu.com.atguigu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Filetool {
    public static void main(String[] args) throws Exception {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        while (a) {
            System.out.println("请输入要读取的文件路径(路径中不能有空格)，中间用英文逗号相隔，以及写入的文件路径");
            Scanner scan = new Scanner(System.in);
            String[] str = scan.next().split(",");
            File infile = new File(str[0]);
            if (infile.isFile()) {
                File read = new File(str[1]);
                if (read.isFile()) {
                    Date date = new Date();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
                    String path = System.getProperty("user.dir") + dateFormat.format(date).toString() + ".txt";
                    File outfile = new File(path);
                    //创建fileinputstream对象，与file文件关联
                    System.out.println("开始读取数据，请耐心等待...............");
                    long begin = System.currentTimeMillis();
                    FileInputStream in = new FileInputStream(infile);
                    FileInputStream rad = new FileInputStream(read);
                    FileOutputStream out = new FileOutputStream(outfile);
                    for (int i = 0; i < infile.length(); i++) {
                        int flag = in.read();
                        out.write(flag);
                    }
                    for (int i = 0; i < read.length(); i++) {
                        int liu = rad.read();
                        out.write(liu);
                    }
                    long end = System.currentTimeMillis();
                    System.out.println("读取数据成功,耗时：");
                    System.out.print(end - begin);
                } else {
                    System.out.println("请输入正确的文件路径");
                }
            } else {
                System.out.println("文件路径错误!!!");
            }

        }

    }

}
