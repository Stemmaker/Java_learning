package com.itheima.demo1;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("请输入星期:");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        switch (week){
            case 1,2,3,4,5 -> System.out.println("Weekday!");
            case 6,7 -> System.out.println("Weekend!");
            default -> System.out.println("Error!");
        }
    }
}
