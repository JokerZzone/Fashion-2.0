package com.lanou.util;

import java.io.File;
import java.io.IOException;

/**
 * Created by joker on 2017/12/18
 * Param:
 * Function:
 */
public class FileUtil {

    //创建文件
    public static void createFile(String filePath, String fileName){
        File file = new File(filePath);
        File newFile = new File(filePath + "/" + fileName);
        System.out.println(newFile);
        if (file.isDirectory()){
            try {
                newFile.createNewFile();
                System.out.println(111111111);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else {
            file.mkdirs();
            try {
                newFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(22222222);
        }
    }
}
