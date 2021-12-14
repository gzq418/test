package test;

import javax.swing.*;

public class ExtendsTest {
    private int age;
    private String sex;

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public ExtendsTest(){
        System.out.print("ExtendsTest:");
    }
    void test(){
        System.out.println("ExtendsTest test:");
    }
}

