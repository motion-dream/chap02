package com.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionUse {
    public static void main(String ar[]) throws Exception{
        File f;
        InputStream in;
        try{
           f=new File("src/main/resources/a.doc");
          in=new FileInputStream(f);
        }
        catch(Exception e){
           try {
               f = new File("src/main/resources/q.doc");
               in = new FileInputStream(f);
           }catch(IOException ex){
               ex.printStackTrace();
           }
        }finally{
            System.out.println("over");
        }
        System.out.println("ok");

    }
}
