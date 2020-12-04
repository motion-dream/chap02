package com.domain;

public class Student {
    private String name;
    private String tel;
    private int age;
    // Alt+Insert自动插入get and set方法
    public String toString(){
        return "student";
    }

    public Student(String name, String tel, int age) {
        this.name = name;
        this.tel = tel;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
