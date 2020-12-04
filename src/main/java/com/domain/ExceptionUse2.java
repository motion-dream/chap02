package com.domain;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ExceptionUse2 {
    public void method() throws IOException {
       File f=new File("src/main/resources/a.doc");
       InputStream in=new FileInputStream(f);
    }
    public static void main(String[] a)throws IOException{
        ExceptionUse2 ex=new ExceptionUse2();
        ex.method();
    }
}
