package com.itheima.demo1;

import java.util.Scanner;

public class HuiWenNumber {
    public static void main(String[] args) {
        System.out.println("请输入一个数：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num;
        int numReverse = 0;
        while (temp!=0){
            int s = temp % 10;
            temp = temp / 10;
            numReverse = numReverse * 10 + s;
        }
        if (num==numReverse){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
