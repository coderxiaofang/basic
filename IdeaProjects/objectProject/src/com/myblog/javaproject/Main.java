package com.myblog.javaproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        public class TestStudent {
//            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                // 初始化学生数组
                Person[] students = new Person[4];
                students[0] = new Person(1, "张三", 20);
                students[1] = new Person(2, "李四", 21);
                students[2] = new Person(3, "王五", 22);

                // 添加新的学生对象
                System.out.println("请输入新学生的学号：");
                int stuNumber = sc.nextInt();
                System.out.println("请输入新学生的姓名：");
                String name = sc.next();
                System.out.println("请输入新学生的年龄：");
                int age = sc.nextInt();
                appendStudent(students, new Person(stuNumber, name, age));

                // 遍历显示所有学生信息
                for (Person student : students) {
                    if (student != null) {
                        System.out.println("学号：" + student.getStuNumber() + ", 姓名：" + student.getName() + ", 年龄：" + student.getAge());
                    }
                }

                // 通过ID删除学生信息
                System.out.println("请输入你要删除的学生的学号：");
                int deleteStu = sc.nextInt();
                deleteStudent(students, deleteStu);

                sc.close();
            }

            public static void appendStudent(Person[] arr, Person newStudent) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != null && arr[i].getStuNumber() == newStudent.getStuNumber()) {
                        System.out.println("学号已存在，添加失败！");
                        return;
                    }
                    if (arr[i] == null) {
                        arr[i] = newStudent;
                        System.out.println("学生添加成功！");
                        return;
                    }
                }
                System.out.println("没有空间添加新学生！");
            }

            public static void deleteStudent(Person[] arr, int stuNumber) {
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] != null && arr[i].getStuNumber() == stuNumber) {
                        arr[i] = null;
                        System.out.println("学号为 " + stuNumber + " 的学生已被删除！");
                        return;
                    }
                }
                System.out.println("未找到学号为 " + stuNumber + " 的学生，删除失败！");
            }
        }


