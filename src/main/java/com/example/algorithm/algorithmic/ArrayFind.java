package com.example.algorithm.algorithmic;

/**
 * @Description :在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * @Author : lizhikang@youngyedu.com, 2020/6/1 13:46
 * @Modified : lizhikang@youngyedu.com, 2020/6/1
 */
public class ArrayFind {

    public static void main(String[] args) {
        int [] [] array = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 1;
        System.out.println(Find(target,array));

    }

    public static boolean Find(int target, int [][] array) {
        int zongsize = array.length;
        int hengsize = array[0].length;
        int i,j;
        for(i = zongsize-1,j = 0; i>0 && j<hengsize;){
            if(target == array[i][j]){
                return true;
            }if(target > array[i][j]){
                j++;
                continue;
            }else if(target < array[i][j]){
                i--;
                continue;
            }
        }
        return false;
    }
}
