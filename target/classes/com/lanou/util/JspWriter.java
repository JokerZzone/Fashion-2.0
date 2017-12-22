package com.lanou.util;

import com.lanou.model.Topic;

import javax.servlet.http.HttpServletRequest;
import java.io.*;

/**
 * Created by joker on 2017/12/18
 * Param:
 * Function:
 */
public class JspWriter {

    public static void writeJsp(Topic topic, HttpServletRequest request){
        String filePath = "";
        String fileName = topic.getTopicName() + ".jsp";
        FileUtil.createFile(filePath,fileName);
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath + "/" + fileName),"utf-8"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        try {
            out.write(topic.getTemplate());
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
