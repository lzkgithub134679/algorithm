package com.example.algorithm.classicalrank;

import java.util.Arrays;

/** 参考地址 https://sort.hust.cc/1.bubblesort
 *
 * @Description : 冒泡排序是一种简单直观的算法。它重复的走访要排序的数列，一次比较两个元素，如果他们的顺序错误，
 * 就把他们交换过来。
 * 算法步骤:
 * 1.比较相邻的元素，如果第一个比第二个大，就交换他们两个。
 * 2.对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对，这步做完后，最后的元素会是最大的数。
 * 3.针对所有元素重复以上的步骤，除了最后一个、
 * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 * @Author : lizhikang@youngyedu.com, 2020/1/20 9:25
 * @Modified : lizhikang@youngyedu.com, 2020/1/20
 */
public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {
        int num = 0;
        int temp;
        for (int i = 1; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = false;
                }
                num++;
            }
            if(flag){
                break;
            }
            num ++;
        }
        System.out.println("执行循环次数: "+num);
        return arr;
    }

    public static void main(String [] args){
        int [] arr = new int[]{34,324,23,42,34,1,23,12,3};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

}
