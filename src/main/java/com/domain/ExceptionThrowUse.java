package com.domain;

import java.io.File;
import java.io.FileInputStream;

public class ExceptionThrowUse {
    public void method(){
        try {
            File f = new File("src/main/resources/a.doc");
            FileInputStream in = new FileInputStream(f);
        }catch (Exception ex){
            throw new MyException("我的异常");
        }
    }
    public static void main(String[] ar){
        ExceptionThrowUse exceptionThrowUse=new ExceptionThrowUse();
        exceptionThrowUse.method();
    }
}
