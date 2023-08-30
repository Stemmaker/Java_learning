package com.itheima.demo1;

public class DoubleArray {
    public static void main(String[] args) {
        int[][] sales = {
                {12,13,11},
                {9,9,11},
                {21,10,9},
                {19,18,21}
        };
        int saleYear = 0;
        for (int i = 0; i < sales.length; i++) {
            int saleSeason = cal_season_sum(sales[i]);
            System.out.println("第"+(i+1)+"个季度的营业额："+saleSeason);
            saleYear += saleSeason;
        }
        System.out.println("全年总营业额:"+saleYear);
    }
    public static int cal_season_sum(int[] arr){
        int sumSeason = 0;
        for (int i = 0; i < arr.length; i++) {
            sumSeason += arr[i];
        }
        return sumSeason;
    }
}
