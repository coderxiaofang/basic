
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


        }
    }
}
