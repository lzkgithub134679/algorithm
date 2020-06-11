package com.example.algorithm.algorithmic;

/**
 * @Description : 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @Author : lizhikang@youngyedu.com, 2020/6/2 17:10
 * @Modified : lizhikang@youngyedu.com, 2020/6/2
 */
public class AdjustArray {

    public static void main(String[] args) {

        System.out.println();
    }

    public static void reOrderArray(int [] array) {
        int temp = 0;
        for(int i = 0;i<array.length;i++){
            for(int j = 0 ;i<array.length-i-1;j++){
                if(array[j] %2 ==0 && array[j+1]%2==1){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
