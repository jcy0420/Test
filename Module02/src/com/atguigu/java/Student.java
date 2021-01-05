package com.atguigu.java;
/**
 * @author jcy
 * @data 2021/1/4 - 20:17
 */
public class Student extends Person{
    public void eat(){
        System.out.println("学生吃饭");
    }
    public static void main(String[] args) {
        Person p = new Student();
        p.eat();
    }

}
