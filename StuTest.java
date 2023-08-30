package com.itheima.demo1;

public class StuTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("李四",21);
        String name = s2.getName();
        int age = s2.getAge();
        System.out.println(name);
        System.out.println(age);
    }
}
