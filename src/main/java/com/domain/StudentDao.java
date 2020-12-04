package com.domain;

public class StudentDao {
    public Student[] sortByAge(Student ss[]){
        for(int i=0;i<ss.length-1;i++){
            for(int j=i+1;j<ss.length;j++){
                if (ss[i].getAge()>ss[j].getAge()){
                    Student tmp=ss[i];
                    ss[i]=ss[j];
                    ss[j]=tmp;
                }
            }
        }
        return ss;
    }
}
