
//            {
//                //游戏敏感词替换
//                public static void main(String[] args){
//                int[] arr={1,2,3};
//                String str="tmd,你个二比，sb玩意！";
//                String[] dirtStr={"二比","sb"};
//                for (int i = 0; i < dirtStr.length; i++) {
//                    str =str.replace(dirtStr[i],"***");
//
//                }
//                System.out.println(str);
//            }
//            }



//            {
//                //判断是否为对称字符串
//                public static void main(String[] args){
//                Scanner sc=new Scanner(System.in);
//                String str=sc.next();
//                StringBuilder sb=new StringBuilder(str);
//                //反转之后再转发为字符串
//                String str2=sb.reverse().toString();
//                if(str2.equals(str)){
//                    System.out.println("是对称数");
//                }else {
//                    System.out.println("不是对称数");
//                }
//            }
//            }



//            package com.myblog.javaproject;
//import java.util.Scanner;
//            public class test3 {
//                //拼接字符串
//                public static void main(String[] args){
//                    int[] strArr={1,2,3};
//                    String NewStr=SplicingStr(strArr);
//                    System.out.println(NewStr);
//                }
//                public static String SplicingStr(int[] strArr){
//                    StringBuilder sbr=new StringBuilder();
//                    sbr.append("[");
//                    for (int i = 0; i < strArr.length; i++) {
//                        if(i<strArr.length-1){
//                            sbr=sbr.append(strArr[i]+",");
//                        }else {
//                            sbr=sbr.append(strArr[i]);
//                        }
//                    }
//                    sbr.append("]");
//                    //sbr只是一个容器，不是字符串，故要转化为字符串
//                    return sbr.toString();
//                }
//            }



            //package com.myblog.javaproject;
//
//import java.util.Scanner;
//
//public class test3 {
//    //将字符串转化为罗马数字
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个字符串：");
//        String sbr=sc.next();
//        StringBuilder sb=new StringBuilder();
//        String[] numArr={"1","2","3","4","5","6","7","8","9"};
//        String[] Remo={"I","II","III","IV","V","VI","IV","VII","VIII","IX"};
//        for (int i = 0; i < sbr.length(); i++) {
//            char chs= sbr.charAt(i);
//            String tempStr=""+chs;
//            boolean flag =true;
//            int indedx=0;
//            for (int i1 = 0; i1 < numArr.length; i1++) {
//                if(numArr[i1].equals(tempStr)){
//                    flag=false;
//                    indedx=i1;
//                }
//            }
//            if(flag&&!tempStr.equals("0")){
//                sb.append(tempStr);
//            } else if (tempStr.equals("0")) {
//                sb.append(" ");
//            } else {
//                sb.append(Remo[indedx]);
//            }
//        }
//        sb.toString();
//        System.out.println(sb);
//    }
//}
//


            //package com.myblog.javaproject;
//
//import java.util.Scanner;
//
//public class test3 {
//    //判断A和B这两个字符串是否匹配
//    public static void main(String[] args) {
//        String str1="abcde";
//        String str2="eabcd";
//        for (int i = 0; i < str1.length(); i++) {
//            boolean flag=false;
//            str1=str1.substring(1)+str1.substring(0,1);
//            for (int j = 0; j < str2.length(); j++) {
//                str2=str2.substring(1)+str2.substring(0,1);
//                if(str1.equals(str2)){
//                    flag=true;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println("匹配成功!最近的一次匹配成功的结果为："+str1);
//                break;
//            } else {
//                System.out.println("匹配不成功！");
//                break;
//            }
//        }
//        //扩展：生成一个新的字符串数组的方法
//        char[] arr= str1.toCharArray();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//    }
//}
//



            //package com.myblog.javaproject;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class test3 {
//    //输入任意字符串，并打乱字符串里面的内容
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str=sc.next();
//        char[] strArr=str.toCharArray();
//        Random r=new Random();
//        int RandomIndex=r.nextInt(strArr.length);
//        char temp =strArr[0] ;
//        strArr[0]=strArr[RandomIndex];
//        strArr[RandomIndex]=temp;
//        String result="";
//        for (int i = 0; i < strArr.length; i++) {
//            result+=strArr[i];
//        }
//        System.out.println(result);
//    }
//}
//
           //package com.myblog.javaproject;
//
//import java.util.Random;
//
//public class test3 {
//    //五位验证码，四个字母一个数字，任意位置
//    public static void main(String[] args) {
//        Random r=new Random();
//        String[] resultArr=new String[5];
//        StringBuilder sbr=new StringBuilder();
//        for (int i = 0; i < 4; i++) {
//            sbr.append(GenerateJame(r));
//        }
//        int randomNum=GenerateNum(r,10,0);
//        int randomString=GenerateNum(r,5,0);
//        //方法一，利用insert插入，方法二，随机截取插入
//        String result=sbr.insert(randomString,randomNum).toString();
////        String result=sbr.substring(0,randomString)+(randomNum)+sbr.substring(randomString);
//        System.out.println(result);
//    }
//    //随机生成一个大小写字母
//    public static char GenerateJame(Random r){
//        //65~65+25:大写,//97~97+25：小写
//        char jame;
//        boolean PossibleNum=r.nextBoolean();
//        if(PossibleNum){
//             jame=(char)(GenerateNum(r,25,97));
//        }else {
//             jame=(char)(GenerateNum(r,25,65));
//        }
//        return jame;
//    }
//    //生成一个随机数
//    public static int GenerateNum(Random r,int a,int b){
//        int RandomNum=r.nextInt(a)+b;
//        return RandomNum;
//    }
//}
//




            //package com.myblog.javaproject;
//
//import java.util.Random;
//
//public class test3 {
//    public static void main(String[] args) {
//        //由若干单词组成的字符串，计算其最后一个单词的长度
//        String str="how are your";
//        for (int i = str.length()-1; i > 0; i--) {
//            char chs=str.charAt(i);
//            if(chs==' '){
//                System.out.println(str.substring(i+1).length());
//                break;
//            }
//        }
//    }
//}
//




            //package com.myblog.javaproject;
//
//import java.util.Scanner;
//
//public class TestStudent {
//    //存储学生信息，包含判断是否能添加，是否能删除等
//    public static void main(String[] args) {
//        Student g1 = new Student(1, "小明", 11);
//        Student g2 = new Student();
//        Student[] arrAge = new Student[3];
//        arrAge[0] = g1;
//        //添加一个学生，进行学号唯一判断
//        Scanner sc = new Scanner(System.in);
//        arrAge[1] = g2;
//        System.out.println("请输入你要添加的学生的学号：");
//        int age = sc.nextInt();
//        //信息不存在则增添
//        append(arrAge, age,1,sc);
//        System.out.println(g2.getStuNumber() + "," + g2.getAge() + "," + g2.getName());
//        System.out.println("请输入你要删除的学生信息：");
//        int deleteStu=sc.nextInt();
//        //判断学生信息是否存在，存在即可删除
//        delete(arrAge,deleteStu,sc);
//        //判断这两个学号的学生是否存在
//        exist(arrAge,2,1);
//        exist(arrAge,4,1);
//        //打印剩余学生的信息
//        remain(arrAge);
//    }
//    //添加学生信息
//    public static void append(Student[] arr, int age, int ge, Scanner sc) {
//        while (true){
//            boolean flag=true;
//            if(exist(arr,age,0)) {
//                arr[ge].setStuNumber(age);
//                arr[ge].setAge(12);
//                arr[ge].setName("fang");
//                break;
//            }
//            if(flag) {
//                System.out.println("学号存在!请重新输入你要添加的学号：");
//                age = sc.nextInt();
//            }
//        }
//
//    }
//    //删除学生信息
//    public static void delete(Student[] arr, int deleteStu, Scanner sc){
//            boolean flag=true;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i]!=null&&deleteStu==arr[i].getStuNumber()){
//                    //删除该信息，设置为Null即可
//                    arr[i]=null;
//                    System.out.println(deleteStu+"要删除的该信息存在，删除成功！");
//                    flag=false;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println("要删除的该信息不存在，删除失败！");
//            }
//    }
//    //判断该学生的学号是否存在,存在就将年龄加一
//    public static boolean exist(Student[] arr, int num, int zero){
//            boolean flag = true;
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] != null && num == arr[i].getStuNumber()) {
//                    System.out.println(num+"这个学号存在!固将其年龄加1");
//                    if (zero==1){
//                        arr[i].setAge(arr[i].getAge()+1);
//                    }
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println(num+"这个学号不存在！");
//            }
//            return flag;
//    }
////    打印剩余学生的信息
//    public static void remain(Student[] arrAge){
//        for (int i = 0; i < arrAge.length; i++) {
//            if(arrAge[i]!=null){
//                System.out.println("剩余学生信息为："+arrAge[i].getStuNumber()+"年龄为："+arrAge[i].getAge()+"姓名为："+arrAge[i].getName());
//            }
//        }
//    }
//}
//
//
//
        }
    }
}
