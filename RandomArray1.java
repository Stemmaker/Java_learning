package com.itheima.demo1;

import java.util.Random;

public class RandomArray1 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();
        // 初始化
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }

        // 前打印
        System.out.print("before:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // 随机取数
        for (int i = 0; i < arr.length; i++) {
            int rind = r.nextInt(5);
            int temp = arr[rind];
            arr[rind] = arr[i];
            arr[i] = temp;
        }

        // 后打印
        System.out.print("\nafter:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        char b = (char)(97 + 29);
        System.out.println("\n"+(int)'A');
    }
}
