package com.itheima.demo1;

public class ShangYu {
    public static void main(String[] args) {
        int a = 15,b = 5;
        int shang = 0;
        int yu;
        while (a >= b){
            a -= b;
            shang++;
        }
        yu = a;
        System.out.println("shang="+shang);
        System.out.println("yu="+yu);

    }
}
