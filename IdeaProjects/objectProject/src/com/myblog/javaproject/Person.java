package com.myblog.javaproject;

public class Person {
    private int stuNumber;
    private String name;
    private int age;

//    private String gender;
//    private String interest;

    // 构造方法，用于创建Person对象时初始化属性
    public Person() {
    }
    public Person(int stuNumber, String name, int age) {
        this.stuNumber = stuNumber;
        this.name = name;
        this.age = age;
    }
    // Getter方法，用于获取name属性的值
    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // introduce方法，接受一个Person对象作为参数，并打印介绍
    public void introduce(Person otherPerson) {
        System.out.println("我是" + this.getName() + "，今年" + this.age + "岁。");
        System.out.println("这位是" + otherPerson.getName() + "，今年" + otherPerson.getAge() + "岁。");
    }
}