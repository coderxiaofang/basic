package com.myblog.javaproject;

import java.util.Scanner;

public class TestStudent {
    //存储学生信息，包含判断是否能添加，是否能删除等
    public static void main(String[] args) {
        Person g1 = new Person(1, "小明", 11);
        Person g2 = new Person();
        Person[] arrAge = new Person[3];
        arrAge[0] = g1;
        //添加一个学生，进行学号唯一判断
        Scanner sc = new Scanner(System.in);
        arrAge[1] = g2;
        System.out.println("请输入你要添加的学生的学号：");
        int age = sc.nextInt();
        //信息不存在则增添
        append(arrAge, age,1,sc);
        System.out.println(g2.getStuNumber() + "," + g2.getAge() + "," + g2.getName());
        System.out.println("请输入你要删除的学生信息：");
        int deleteStu=sc.nextInt();
        //判断学生信息是否存在，存在即可删除
        delete(arrAge,deleteStu,sc);
        //判断这两个学号的学生是否存在
        exist(arrAge,2,1);
        exist(arrAge,4,1);
        //打印剩余学生的信息
        remain(arrAge);
    }
    //添加学生信息
    public static void append(Person[] arr, int age, int ge,Scanner sc) {
        while (true){
            boolean flag=true;
            if(exist(arr,age,0)) {
                arr[ge].setStuNumber(age);
                arr[ge].setAge(12);
                arr[ge].setName("fang");
                break;
            }
            if(flag) {
                System.out.println("学号存在!请重新输入你要添加的学号：");
                age = sc.nextInt();
            }
        }

    }
    //删除学生信息
    public static void delete(Person[] arr,int deleteStu,Scanner sc){
            boolean flag=true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]!=null&&deleteStu==arr[i].getStuNumber()){
                    //删除该信息，设置为Null即可
                    arr[i]=null;
                    System.out.println(deleteStu+"要删除的该信息存在，删除成功！");
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println("要删除的该信息不存在，删除失败！");
            }
    }
    //判断该学生的学号是否存在,存在就将年龄加一
    public static boolean exist(Person[] arr, int num,int zero){
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null && num == arr[i].getStuNumber()) {
                    System.out.println(num+"这个学号存在!固将其年龄加1");
                    if (zero==1){
                        arr[i].setAge(arr[i].getAge()+1);
                    }
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(num+"这个学号不存在！");
            }
            return flag;
    }
//    打印剩余学生的信息
    public static void remain(Person[] arrAge){
        for (int i = 0; i < arrAge.length; i++) {
            if(arrAge[i]!=null){
                System.out.println("剩余学生信息为："+arrAge[i].getStuNumber()+"年龄为："+arrAge[i].getAge()+"姓名为："+arrAge[i].getName());
            }
        }
    }
}



