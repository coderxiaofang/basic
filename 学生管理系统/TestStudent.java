package com.myblog.javaproject;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//学生管理系统(耗时两天)
public class TestStudent {
    public static void main(String[] args) {
        ArrayList<login> loginList = new ArrayList<>();
        //创建一个初始用户
        login User = new login("lulu", "12345", "1", "1");
        loginList.add(User);
        ArrayList<Student> StudentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //输入三个初始数据
        Student s1 = new Student(1, "a", 1, "A");
        Student s2 = new Student(2, "b", 2, "B");
        Student s3 = new Student(3, "c", 3, "C");
        StudentList.add(s1);
        StudentList.add(s2);
        StudentList.add(s3);
        while (true) {
            System.out.println("登录页");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.忘记密码");
            System.out.println("4.退出");
            System.out.println("\"请输入您的选择:\"");
            String choiceL = sc.next();
            switch (choiceL) {
                case "1":
                    LoginStudent(loginList, sc);
                    if (LoginStudent(loginList, sc)) {
                        //loop用于退出外层循环
                        Loop:
                        while (true) {
                            System.out.println("登录成功！欢迎进入系统！");
                            System.out.println("\"1:添加学生\"");
                            System.out.println("\"2:删除学生\" ");
                            System.out.println("\"3:修改学生\"");
                            System.out.println("\"4:查询学生\"");
                            System.out.println("\"5:退出\"");
                            System.out.println("\"请输入您的选择:\"");
                            int choice = sc.nextInt();
                            switch (choice) {
                                case 1:
                                    AddStudent(StudentList, sc);
                                    break;
                                case 2:
                                    DeleteStudent(StudentList, sc);
                                    break;
                                case 3:
                                    ModifyStudent(StudentList, sc);
                                    break;
                                case 4:
                                    QueryStudent(StudentList, sc);
                                    break;
                                case 5:
                                    //方法一
                                    //                    flag = false;
                                    System.out.println("成功退出！");
                                    //方法二
                                    break Loop;
                                //退出外层循环的方法三
                                //                            System.exit(0);
                                default:
                                    System.out.println("输入错误,请重新输入！");
                                    break;
                            }
                        }
                    }
                    break;
                case "2":
                    RegisterStudent(loginList, sc);
                    break;
                case "3":
                    ForgetPassward(loginList, sc);
                    break;
                case "4":
                    System.out.println("感谢使用！");
                    System.exit(0);
                default:
                    System.out.println("输入错误！");
            }
        }
    }

    //展示登录用户信息
    public static void showLogin(ArrayList<login> list, Scanner sc) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }

    //判断用户是否存在
    public static boolean ExistName(ArrayList<login> list, Scanner sc, login newLogin) {
        boolean flag;
        while (true) {
            flag = true;
            System.out.println("请重新输入用户名：");
            String InputName = sc.next();
            if (checkInputName(InputName)) {
                for (int i = 0; i < list.size(); i++) {
                    if (InputName.equals(list.get(i).getName())) {
                        System.out.println("该用户存在！请重新输入");
                        flag = false;
                        break;
                    }
                }
                //若不存在则添加信息
                if (flag) {
                    System.out.println("用户不存在！");
                    newLogin.setName(InputName);
                    break;
                }
            } else {
                System.out.println("输入的用户名格式不正确！!");
                flag = false;
            }
        }
        return flag;
    }

    //检查用户名格式是否正确
    private static boolean checkInputName(String inputName) {
        //长度3~15，
        int inputNameLen = inputName.length();
        if (inputNameLen < 3 || inputNameLen > 15) {
            System.out.println("长度错误！");
            return false;
        }
        //字母和数字结合，
        for (int i = 0; i < inputName.length(); i++) {
            char chs = inputName.charAt(i);
            if (!((chs >= 'a' && chs <= 'z') || (chs >= 'A' && chs <= 'Z') || (chs >= '0' && chs <= '9'))) {
                System.out.println("类型错误！");
                return false;
            }
        }
        //不能是纯数字
        int count = 0;
        for (int i = 0; i < inputName.length(); i++) {
            char chs = inputName.charAt(i);
            if (!(chs >= '0' && chs <= '9')) {
                count++;
                System.out.println("输入的用户名格式正确！");
                break;
            }
        }
        return count > 0;
    }

    //忘记密码
    public static void ForgetPassward(ArrayList<login> list, Scanner sc) {
        System.out.println("请输入手机号：");
        String phoneNumber = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if (phoneNumber.equals(list.get(i).getPhoneNumber())) {
                System.out.println("请输入身份证号：");
                String idNumber = sc.next();
                if (idNumber.equals(list.get(i).getIdNumber())) {
                    System.out.println("请重新输入密码：");
                    list.get(i).setPassward(sc.next());
                    System.out.println("密码修改成功！");
                }
            } else {
                System.out.println("请输入正确的手机号：");
            }
        }
    }

    //注册
    public static void RegisterStudent(ArrayList<login> list, Scanner sc) {
        login newLogin = new login();
        boolean result = ExistName(list, sc, newLogin);
//        System.out.println("执行了注册："+result);
        if (result) {
            while (true) {
                System.out.println("请输入密码：");
                String passward = sc.next();
                System.out.println("请再次输入密码：");
                String rePassward = sc.next();
                if (passward.equals(rePassward)) {
                    newLogin.setPassward(passward);
                    break;
                } else {
                    System.out.println("两次密码输入不一致，请重新输入：");
                }
            }

            while (true) {
                System.out.println("请输入身份证号：");
                String inputIdNumber = sc.next();
                if (checkIdNumber(inputIdNumber)) {
                    newLogin.setIdNumber(inputIdNumber);

                } else {
                    System.out.println("身份证号格式错误！请重新输入身份证号：");
                    continue;
                }
                System.out.println("请输入手机号：");
                String inputPhoneNumber = sc.next();
                if (checkPhoneNumber(inputPhoneNumber)) {
                    newLogin.setPhoneNumber(inputPhoneNumber);

                } else {
                    System.out.println("手机号格式错误！请重新输入手机号：");
                    continue;
                }
                list.add(newLogin);
                System.out.println("注册成功！");
                showLogin(list, sc);
                break;

            }
        }
    }

    //检查身份证号格式
    private static boolean checkIdNumber(String inputIdNumber) {
        //长度必须为18
        if (inputIdNumber.length() != 18) {
            return false;
        }
        //不能以0开头
        if (inputIdNumber.charAt(0) == '0') {
            return false;

        }
        //前17位必须为数字，
        for (int i = 0; i < inputIdNumber.length() - 1; i++) {
            char chs = inputIdNumber.charAt(i);
            if (!(chs >= '0' && chs <= '9')) {
                return false;
            }
        }
        //最后1位为X或x或者数字;
        char chs = inputIdNumber.charAt(inputIdNumber.length() - 1);
        if (!((chs == 'X') || (chs == 'x') || (chs >= '0' && chs <= '9'))) {
            return false;
        }
        return true;
    }

    //检查手机号格式
    private static boolean checkPhoneNumber(String inputPhoneNumber) {
        boolean flag = true;
        //长度必须为11
        if (inputPhoneNumber.length() != 11) {
            System.out.println("长度必须为11");
            flag = false;
        }
        //不能以0开头
        if (inputPhoneNumber.charAt(0) == '0') {
            System.out.println("不能以0开头");
            flag = false;
        }
        //11位必须为数字，
        for (int i = 0; i < inputPhoneNumber.length() - 1; i++) {
            char chs = inputPhoneNumber.charAt(i);
            if (!(chs >= '0' && chs <= '9')) {
                flag = false;
                System.out.println("必须为数字");
            }
        }
        return flag;
    }

    //五位验证码，4个字母1个数字,字母大小写、位置随机
    public static String identifyCode() {
        Random r = new Random();
        int strAs = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            int smallOrBig = r.nextInt(2);
            if (smallOrBig == 0) {
                strAs = r.nextInt(25) + 65;
            } else {
                strAs = r.nextInt(25) + 97;
            }
            char chs = (char) strAs;
            sb.append(chs);
        }
        int randomIndex = r.nextInt(5);
        int randomNum = r.nextInt(10);
        String result = sb.substring(0, randomIndex) + randomNum + sb.substring(randomIndex);
        System.out.println(result);
        return result;
    }

    //查看是否登录成功
    public static boolean LoginStudent(ArrayList<login> list, Scanner sc) {
        boolean flag = false;
        boolean flag2 = true;
        System.out.println("请输入用户名：");
        String InputName = sc.next();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            if (InputName.equals(list.get(i).getName())) {
                flag2 = false;

                System.out.println("请输入密码：");
                String InputPassward = sc.next();
                while (count < 3) {
                    if (InputPassward.equals(list.get(i).getPassward())) {
                        String gainCode = identifyCode();
                        System.out.println("验证码已发，请输入验证码：");
                        String inputCode = sc.next();
                        if (inputCode.equals(gainCode)) {
                            System.out.println("密码正确！");
                            flag = true;
                            break;
                        } else {
                            System.out.println("验证码错误");

                        }

                    } else {
                        count++;
                        if (count <= 2) {
                            System.out.println("密码错误！您还有" + (3 - count) + "次机会");
                        } else {
                            System.out.println("账号锁定");
                        }
                    }
                }
            }
        }
        if (flag2) {
            System.out.println("用户名未注册，请先注册！");
            RegisterStudent(list, sc);
        }
        return flag;
    }

    //增加功能，若id存在，则无法添加，不存在则可以添加
    public static void AddStudent(ArrayList<Student> list, Scanner sc) {
        String Add = "添加";
        if (ExistId(list, Add, sc) < 0) {
            System.out.println("请依次录入id、姓名、年龄、地址：");
            Student addStu = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next());
            list.add(addStu);
            ShowStudent(list);
            sout(true, Add);
        } else {
            sout(false, Add);
        }

    }

    //删除功能，存在则删除
    public static void DeleteStudent(ArrayList<Student> list, Scanner sc) {
        String Add = "删除";
        int GainTndex = ExistId(list, Add, sc);
        if (GainTndex >= 0) {
            list.remove(GainTndex);
            sout(true, Add);
            //打印剩余学生的信息
            ShowStudent(list);
        } else {
            sout(false, Add);
        }
    }

    //查询功能，存在则打印所有学生信息
    public static void QueryStudent(ArrayList<Student> list, Scanner sc) {
        String Add = "查询";
        if (ExistId(list, Add, sc) >= 0) {
            ShowStudent(list);
            sout(true, Add);
        } else {
            sout(false, Add);
        }
    }

    //修改学生信息
    public static void ModifyStudent(ArrayList<Student> list, Scanner sc) {
        String Add = "修改";
        int GainIndex = ExistId(list, Add, sc);
        if (GainIndex >= 0) {
            System.out.println("请输入你要修改的学生的信息，依次输入姓名、年龄、地址");
            list.get(GainIndex).setName(sc.next());
            list.get(GainIndex).setAge(sc.nextInt());
            list.get(GainIndex).setAddress(sc.next());
            ShowStudent(list);
            sout(true, Add);
        } else {
            sout(false, Add);
        }
    }

    //判断id是否存在的功能
    public static int ExistId(ArrayList<Student> list, String fiction, Scanner sc) {
        System.out.println("请输入你要" + fiction + "的id：");
        int InputId = sc.nextInt();
        boolean flag = true;
        int ExistIndex = 0;
        //id存在则返回id
        for (int i = 0; i < list.size(); i++) {
            if (InputId == list.get(i).getId()) {
                flag = false;
                System.out.println("提示！id存在！");
                ExistIndex = i;
                break;
            }
        }
        if (flag) {
            System.out.println("提示！id不存在！");
            //-1表示不存在
            return -1;
        }
        return ExistIndex;
    }

    //打印所有学生的信息
    public static void ShowStudent(ArrayList<Student> list) {
        System.out.printf("%-5s %-5s %-5s %-5s%n", "id", "name", "age", "address");
        for (int i = 0; i < list.size(); i++) {
            Student result = list.get(i);
            System.out.printf("%-5s %-5s %-5s %-5s%n", result.getId(), result.getName(), result.getAge(), result.getAddress());
        }
    }

    //打印执行是否成功
    public static void sout(boolean bool, String add) {
        if (bool) {
            System.out.println(add + "成功！");
        } else {
            System.out.println(add + "失败！");
        }
    }
}



