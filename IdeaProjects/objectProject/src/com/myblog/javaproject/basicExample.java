package com.myblog.javaproject;

import java.util.Scanner;
//面向对象之前的案例代码
public class basicExample {
    public static void main(String[] args) {
        //***求平方根的整数部分
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入：");
        int num1 = sc.nextInt();
        for(int i=1;i<=num1;i++){
            if(i*i==num1){
                System.out.println(i+"是");
                break;
            }else if(i*i>num1){
                System.out.println((i-1)+"是");
                break;
            }
        }
        //***求质数
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入：");
//        int num1 = sc.nextInt();
//        int n=0;
//        boolean flag=true;
//        for(int i=2;i<num1;i++){
//            if(num1%i==0){
//                flag=false;
//                break;
//            }
//        }
//        if(flag){
//            System.out.println(num1+"是质数");
//        }else{
//            System.out.println(num1+"不是质数");
//        }


        //***猜数字，直到正确
//        Random r=new Random();
//        //生成一个1~100的随机数
//        int number=r.nextInt(100)+1;
//        Scanner sc =new Scanner(System.in);
//        int count =0;
//        //无限循环
//        while (true) {
//            System.out.println("请输入你要猜的数字：");
//            int guessnumber = sc.nextInt();
//            //计数器
//            count++;
//            if(count==3){
//                System.out.println("猜对了");
//                break;
//            }
//            if (guessnumber > number) {
//                System.out.println("大了");
//            } else if (guessnumber < number) {
//                System.out.println("小了");
//            } else {
//                System.out.println("猜对了");
//                break;
//            }
//        }


//        //***生成10个1~100的随机数，并求和，平均值
//        int sum=0;
//        int count=0;
//        int[] arr1=new int[10];
//        Random r=new Random();
//        for(int i=0;i<=9;i++){
//            int number =r.nextInt(100)+1;
//            //数据不换行显示
//            System.out.print(number+" ");
//            arr1[i]=number;
//            sum+=arr1[i];
//        }
//        System.out.println("总和是："+sum);
//        int jun=sum/arr1.length;
//        System.out.println("平均数是："+jun);
//        for (int i = 0; i < arr1.length; i++) {
//            if(arr1[i]<jun){
//                System.out.println(arr1[i]);
//                count++;
//            }
//        }
//        System.out.println("比平均数小的有："+count);



//        //交换数组中索引
//        int[] arr1={1,2,3,4,5};
//        for(int i=0,j=arr1.length-1;i<j;i++,j--){
//            int temp =arr1[i];
//            arr1[i]=arr1[j];
//            arr1[j]=temp;
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]+" ");
//        }


//        //随机打乱数组中的所以数据
//        int[] arr1={1,2,3,4,5};
//        Random r =new Random();
//        for(int i=0;i<arr1.length;i++){
//            int random_index=r.nextInt(arr1.length);
//            int temp =arr1[i];
//            arr1[i]=arr1[random_index];
//            arr1[random_index]=temp;
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print(arr1[i]+" ");
//        }



//        //判断数组是否存在
//        public static void main(String[] args) {
//            int[] arr1={11,22,33,44,55};
//            Scanner sc =new Scanner(System.in);
//            System.out.println("请输入：");
//            int num =sc.nextInt();
//            System.out.println(max_num(arr1,num));
//        }
//        public  static boolean max_num(int[] arr1,int num) {
//            for (int i = 0; i < arr1.length; i++) {
//                if(arr1[i]==num){
//                    //执行到return时方法结束
//                    return true;
//                }
//            }
//            return false;
//        }



//        //将数组中的部分数据复制到性的数组中
//        int[] arr={1,2,3,4,5,6,7,8,9};
//        int[] copyarr2=copyOfRange(arr,3,6);
//        for (int i = 0; i < copyarr2.length; i++) {
//            System.out.println(copyarr2[i]);
//        }
//    }
//    public  static int[] copyOfRange(int[] arr,int from,int to){
//        int[] arr2=new int[to-from+1];
//        for (int i = from,j=0; i <=to&&j<=(to-from); i++) {
//            arr2[j]=arr[i];
//            j++;
//        }
//        return arr2;


        //求不同时期机票的价格
//        Scanner sc =new Scanner(System.in);
//        System.out.println("请输入原价：");
//        int money=sc.nextInt();
//        System.out.println("请输入月份：");
//        int month=sc.nextInt();
//        System.out.println("头等舱输1，经济舱输2：");
//        int plane=sc.nextInt();
//        switch (month){
//            case 5,6,7,8,9,10:
//                money= panduan(money,plane,0.9,0.85);
//                break;
//            case 11,12,1,2,3,4:
//                money= panduan(money,plane,0.7,0.65);
//                break;
//            default:
//                System.out.println("输入错误");
//                break;
//        }
//        System.out.println(money);
//    }
//    public static int panduan(int money,int plane,double num1,double num2){
//        if(plane==1){
//            money*=num1;
//        }else{
//            money*=num2;
//        }
//        return money;


        //求不同时期机票的价格
//        public class TestStudent {
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//                System.out.println("请输入机票的原价");
//                double ticket = sc.nextInt();
//                System.out.println("请输入机票的月份");
//                int month = sc.nextInt();
//                System.out.println("请输入机票的仓位，1经济2头等");
//                int seat = sc.nextInt();
//                if (month >= 5 && month <= 10) {
//                    getTicket(seat, ticket, 0.9, 0.85);
//                } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
//                    getTicket(seat, ticket, 0.7, 0.65);
//                } else {
//                    System.out.println("输入错误");
//                }
//            }
//            private static void getTicket(int seat, double ticket, double ticket1, double ticket2) {
//                if (seat == 1) {
//                    ticket *= ticket1;
//                } else if (seat == 2) {
//                    ticket *= ticket2;
//                } else {
//                    System.out.println("输入错误");
//                }
//            }
//        public static void main(String[] args) {



////        求出101~200之间有多少个质数
//        int sum = 0;
//        for (int i = 101; i < 201; i++) {
//            int count = 0;
//            boolean flag = true;
//            for (int j = 2; j < =i / 2; j++) {
//                if (i % j == 0) {
//                    flag = false;
////                    跳出内循环
//                    break;
//                }
//            }
//            if (flag) {
//                sum++;
//            }
//        }
//        System.out.println(sum);



//        //    构建生成五位验证码，前四位为随机大小写字母，最后一位为数字
//        public static void main(String[] args) {
//            for (int i = 0; i < 5; i++) {
//                if(i<4){
//                    System.out.print((char)randomNumber());
//                }else {
//                    System.out.println(randomNumberOne());
//                }
//            }
//        }
////    构建一个生成最后一位随机数的方法
//        public static int randomNumberOne(){
//            Random random3 = new Random();
//            int number3=random3.nextInt(10)+;
//            return number3;
//        }
////    构建生成随机大小写字母的方法
//        public static int randomNumber() {
//            Random random1 = new Random();
////        生成1的小写，二为大写
//            int number = random1.nextInt(2) + 1;
//            if(number==1){
//                int number2=random1.nextInt(26)+97;
//                return number2;
//            }else{
//                int number2=random1.nextInt(26)+97-32;
//                return number2;
//            }



//        //    共有六位评委打分，求除去最高分和最低分之后的平均值
////    自己原创的代码
//        public static void main(String[] args) {
//            int[] myArrey = new int[6];
//            for (int i = 0; i < myArrey.length; i++) {
//                myArrey[i] = Score();
//            }
//            int initialMax = myArrey[0];
//            int initialMin = myArrey[0];
//            int sum=0;
//            for (int i = 0; i < myArrey.length; i++) {
//                int a = myArrey[i];
//                if (a >=initialMax) {
//                    initialMax = a;
//                } else {
//                    initialMin = a;
//                }
//                sum+=a;
//            }
//            System.out.println("平均分是："+((double)(sum-(initialMin+initialMax))/(myArrey.length-2)));
//            System.out.println("最大值是：" + initialMax + "最小值是：" + initialMin);
//        }
//        private static int Score() {
//            Scanner sc = new Scanner(System.in);
//            int number1 = sc.nextInt();
//            return number1;
//        }
//
//        //    共有六位评委打分，求除去最高分和最低分之后的平均值
////    老师给的代码
//        public static void main(String[] args) {
//            int[] getArr = score();
//            int sum=0;
//            for (int i = 0; i < getArr.length; i++) {
//                sum+=getArr[i];
//            }
//            double avg=(double)(sum-max(getArr)-min(getArr))/(getArr.length-2);
//            System.out.println(avg);
//        }
//        public static int max(int[] getArr) {
//            int max = getArr[0];
//            for (int i = 0; i < getArr.length; i++) {
//                if (max <= getArr[i]) {
//                    max = getArr[i];
//                }
//            }
//            return max;
//        }
//        public static int min(int[] getArr) {
//            int min = getArr[0];
//            for (int i = 0; i < getArr.length; i++) {
//                if (min >=getArr[i]) {
//                    min = getArr[i];
//                }
//            }
//            return min;
//        }
//        public static int[] score() {
//            int[] myArry = new int[6];
//            for (int i = 0; i < myArry.length; ) {
//                Scanner sc = new Scanner(System.in);
//                int number = sc.nextInt();
//                if (number >= 0 && number <= 100) {
//                    myArry[i] = number;
//                    i++;
//                } else {
//                    System.out.println("输入错误！");
//                }
//            }
//            return myArry;
//        }



        //        回文数
//        Scanner sc=new Scanner(System.in);
//        System.out.println("输入一个四位数：");
//        int number =sc.nextInt();
//        int value=0;
//        while (number>0){
//            int number2=number%10;
//            number/=10;
//            value=value*10+number2;
//        }
//        System.out.println(value);
//    }




        //    随四位数进行加密
//    public static void main(String[] args) {
//
//        int[] getArr = encrypt();
//        int value=0;
////        利用指针倒叙输出
//        for (int i = 0,j = getArr.length - 1;i < j;i++, j--){
//            int temp =getArr[i];
//            getArr[i]=getArr[j];
//            getArr[j]=temp;
//        }
////        利用回文数输出不空格的数
//        for (int i = 0; i < getArr.length; i++) {
//            value=value*10+getArr[i];
//        }
//        System.out.println(value);
//    }
////    定义加密方法
//    public static int[] encrypt() {
//        int[] myArrey = new int[4];
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < myArrey.length; i++) {
//            int number = sc.nextInt();
//            myArrey[i] = (number + 5) % 10;
//        }
//        return myArrey;
//    }


        //    随四位数进行加密,复杂版代码
//    public static void main(String[] args) {
//        int[] getArr = encrypt();
////        System.out.println(getArr);
//        int value = 0;
////        利用指针倒叙输出
//        for (int i = 0, j = getArr.length - 1; i < j; i++, j--) {
//            int temp = getArr[i];
//            getArr[i] = getArr[j];
//            getArr[j] = temp;
//        }
////        利用回文数输出不空格的数
//        for (int i = 0; i < getArr.length; i++) {
//            value = value * 10 + getArr[i];
//        }
//        System.out.println(value);
//    }
//    //    定义加密方法，并且依次输出
//    public static int[] encrypt() {
//        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
//        int count = 0;
//        int temp2 = number;
//        while (number > 0) {
//            number /= 10;
//            count++;
//        }
//        int[] myArrey = new int[count];
//        for (int i = myArrey.length - 1; i >= 0; i--) {
//            int number2 = temp2 % 10;
//            temp2 /= 10;
//            myArrey[i] = (number2 + 5) % 10;
//        }
//        return myArrey;
//    }


        //        抽取随机奖项，每个奖只有一个（难点）
//        int[] arrI = {2, 588, 888, 1000, 10000};
//        int[] arrJ = new int[arrI.length];
//        Random r = new Random();
//        for (int j = 0; j < arrI.length;) {
//            int ranomNum = r.nextInt(5);
//            boolean flag = false;
////            重点！需要再加一层arrJ循环
//            for (int i = 0; i < arrI.length; i++) {
//                if (arrI[ranomNum] == arrJ[i]) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag) {
//                arrJ[j] = arrI[ranomNum];
//                System.out.println(arrI[ranomNum]);
//                j++;
//            }
//        }
//    }



        //        抽取随机奖项，每个奖只有一个（难点）
////        方法二(很简单)，先打乱数列的顺序，再依次输出
//        int[] arrI = {2, 588, 888, 1000, 10000};
//        for (int i = 0; i < arrI.length; i++) {
//            Random r =new Random();
//            int randomIndex=r.nextInt(5);
//            int temp=arrI[randomIndex];
//            arrI[randomIndex]=arrI[i];
//            arrI[i]=temp;
//        }
//        for (int i = 0; i < arrI.length; i++) {
//            System.out.println(arrI[i]);
//        }
//    }




        //输入不重复的6个数
//        Scanner sc = new Scanner(System.in);
////        int num =sc.nextInt();
//        int[] arr = new int[6];
//        for (int j = 0; j < arr.length; ) {
//            boolean flag = true;
//            int numRed = sc.nextInt();
//            for (int i = 0; i < arr.length; i++) {
//                if (numRed == arr[i] || (numRed < 1 || numRed > 33)) {
//                    flag = false;
//                    System.out.println("输入错误！请重新输入第" + (j + 1) + "次");
//                    break;
//                }
//            }
//            if (flag) {
//                arr[j] = numRed;
//                j++;
//            }
//        }



        //        二维数组计算营业额的问题
//        int[][] yearArr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
//        int sumYear = 0;
//        for (int i = 0; i < yearArr.length; i++) {
//            int sumSeason = seasonMoney(yearArr[i]);
//            System.out.println((i + 1) + "季度的营业额是：" + (sumSeason));
//            sumYear += sumSeason;
//        }
//        System.out.println("4个季度的总营业额是：" + (sumYear));
//    }
//
//    public static int seasonMoney(int[] arr) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return sum;
    }
}
