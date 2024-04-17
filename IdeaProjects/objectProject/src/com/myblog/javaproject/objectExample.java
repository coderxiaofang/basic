package com.myblog.javaproject;

import java.util.Scanner;

public class objectExample {
    public static void main(String[] args) {
        //可以将char转化为string类型
        char[] chs={'a','b','c'};
        String s1=new String(chs);
        System.out.println(s1);
        //可以将byte转化为string类型
        byte[] bytes={97,98,99,100};
        String s2=new String(bytes);
        System.out.println(s2);
        //遍历字符串
        String str="我abc123的";
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            System.out.println(c);
        }
        System.out.println(str.length());
        //ctrl+alt+v自动补齐
        {
//             用户密码登录
//            public static void main(String[] args) {
//            String rightName="lulu";
//            String rightPassword="123";
//            Scanner sc =new Scanner(System.in);
//            System.out.println("请输入用户名：");
//            String name = sc.next();
//            System.out.println("请输入密码：");
//            String password=sc.next();
//            if(name.equals(rightName)){
//                for (int i = 3; i >0; i--) {
//                    if (password.equals(rightPassword)) {
//                        System.out.println("密码正确，成功登录！");
//                        break;
//                    } else if ((i -1)> 0){
//                        System.out.println("密码错误，请重新输入密码,您还有" + (i - 1) + "次机会");
//                        password = sc.next();
//                    }else {
//                        System.out.println("密码错误，账号锁定！");
//
//                    }
//                }
//            } else {
//                System.out.println("用户名输入错误！");
//            }
//        }


//            {
//                //统计自已字符串中大写字母，小写字母，数字的个数
//                public static void main(String[] args) {
//                Scanner sc =new Scanner(System.in);
//                System.out.println("请输入一个字符串：");
//                String str=sc.next();
//                int smallNumber=0;
//                int bigNumber=0;
//                int figureNumber=0;
//                for (int i = 0; i < str.length(); i++) {
//                    char strChar=str.charAt(i);
//                    if(strChar>='a'&&strChar<='z'){
//                        smallNumber++;
//                    }else if(strChar>='A'&&strChar<='Z'){
//                        bigNumber++;
//                    }else if(strChar>='0'&&strChar<='9'){
//                        figureNumber++;
//                    }
//                }
//                System.out.println("小写字母有："+smallNumber);
//                System.out.println("大写字母有："+bigNumber);
//                System.out.println("数字字符串有："+figureNumber);
//            }
//            }



//            {
//                //将列表转化为字符串
//                public static void main(String[] args) {
//                int[] arr={1,2,3};
//                String s=ArrToString(arr);
//                System.out.println(s);
//            }
//                public static String ArrToString(int[] arr){
//                String str="[";
//                for (int i = 0; i < arr.length; i++) {
//                    if(i<arr.length-1){
//                        str+=arr[i]+",";
//                    }else {
//                        str+=arr[i];
//                    }
//                }
//                str+="]";
//                return str;
//            }
//            }



//            {
//                //将列表转化为字符串
//                public static void main(String[] args) {
//                System.out.println(ReversalString("abc"));
//            }
//                public static String ReversalString(String str){
//                String origionalStr="";
//                for (int i = 0; i < str.length(); i++) {
//                    char chs=str.charAt(i);
//                    System.out.println(chs);
//                    origionalStr+=chs;
//                }
//                return origionalStr;
//            }
//            }




//            {
//                public static void main(String[] args) {
//
//                Scanner sc = new Scanner(System.in);
//                // 初始化学生数组
//                Person[] students = new Person[4];
//                students[0] = new Person(1, "张三", 20);
//                students[1] = new Person(2, "李四", 21);
//                students[2] = new Person(3, "王五", 22);
//
//                // 添加新的学生对象
//                System.out.println("请输入新学生的学号：");
//                int stuNumber = sc.nextInt();
//                System.out.println("请输入新学生的姓名：");
//                String name = sc.next();
//                System.out.println("请输入新学生的年龄：");
//                int age = sc.nextInt();
//                appendStudent(students, new Person(stuNumber, name, age));
//
//                // 遍历显示所有学生信息
//                for (Person student : students) {
//                    if (student != null) {
//                        System.out.println("学号：" + student.getStuNumber() + ", 姓名：" + student.getName() + ", 年龄：" + student.getAge());
//                    }
//                }
//
//                // 通过ID删除学生信息
//                System.out.println("请输入你要删除的学生的学号：");
//                int deleteStu = sc.nextInt();
//                deleteStudent(students, deleteStu);
//
//                sc.close();
//            }
//
//                public static void appendStudent(Person[] arr, Person newStudent) {
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] != null && arr[i].getStuNumber() == newStudent.getStuNumber()) {
//                        System.out.println("学号已存在，添加失败！");
//                        return;
//                    }
//                    if (arr[i] == null) {
//                        arr[i] = newStudent;
//                        System.out.println("学生添加成功！");
//                        return;
//                    }
//                }
//                System.out.println("没有空间添加新学生！");
//            }
//
//                public static void deleteStudent(Person[] arr, int stuNumber) {
//                for (int i = 0; i < arr.length; i++) {
//                    if (arr[i] != null && arr[i].getStuNumber() == stuNumber) {
//                        arr[i] = null;
//                        System.out.println("学号为 " + stuNumber + " 的学生已被删除！");
//                        return;
//                    }
//                }
//                System.out.println("未找到学号为 " + stuNumber + " 的学生，删除失败！");
//            }
//            }




//            {
//                //银行存储金额转换
//                public static void main(String[] args) {
//                Scanner sc=new Scanner(System.in);
//                String getConvert=convert(sc.nextInt());
//                if(getConvert!=""){
//                    String[] module={"佰","拾","万","仟","佰","拾","元"};
//                    String strResult="";
//                    for (int i = 0; i < module.length-getConvert.length(); i++) {
//                        strResult+="零"+module[i];
//                    }
//                    for (int i = 0; i < getConvert.length(); i++) {
//                        char chs=getConvert.charAt(i);
//                        strResult+=chs+module[module.length-getConvert.length()+i];
//                    }
//                    System.out.println("存储成功！存储金额为："+strResult);
//                }
//            }
//                public static String convert(int StrNum){
//                String s2="";
//                String general="";
//                if(StrNum>0&&StrNum<=9999999){
//                    String StrNumber=StrNum+s2;
//                    String[] complexForm={"壹","贰","叁","肆","伍","陆","柒","捌","玖","拾"};
//                    for (int i = 0; i < StrNumber.length(); i++) {
//                        char chs=StrNumber.charAt(i);
//                        int num=chs-'0';
//                        String convertNum=complexForm[num-1];
//                        general+=convertNum;
//                    }
//                }else {
//                    System.out.println("存储金额不符！");
//                }
//                return general;
//            }
//            }



//            {
//                public static void main(String[] args){
//                //隐藏手机号的3~7位
//                String phoneNumber="12345678910";
//                String startNumber=phoneNumber.substring(0,3);
//                //后面只有一位，表示从该位截取到末尾
//                String endNumber=phoneNumber.substring(7);
//                System.out.println(startNumber+"****"+endNumber);
//            }
//            }



//            {
//                //通过身份证打印人物信息
//                public static void main(String[] args){
//                String Id="360721200111225261";
//                String BirthDate=Id.substring(6,14);
//                String year=BirthDate.substring(0,4);
//                String month=BirthDate.substring(4,6);
//                String day=BirthDate.substring(6);
//                String result="";
//                result+=year+"年"+month+"月"+day+"日";
//                char IdGender=Id.charAt(17);
//                int GenderNum=IdGender-48;
//                System.out.println("出生日期为："+result);
//                if(GenderNum%2==0){
//                    System.out.println("性别为：女");
//                }else {
//                    System.out.println("性别为：男");
//                }
//            }
//            }
        }
    }
}
