package com.example.algorithm.classicalrank;

import java.util.Arrays;

/** https://sort.hust.cc/3.insertionsort
 *
 * @Description : 插入排序
 * 插入排序的代码实现虽然没有冒泡排序和选择排序那么简单粗暴，但它的原理应该是最容易理解的了，
 * 因为只要打过扑克牌的人都应该能够秒懂。插入排序是一种最简单直观的排序算法，它的工作原理是通过构建有序序列，
 * 对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * 插入排序和冒泡排序一样，也有一种优化算法，叫做拆半插入。
 * @Author : lizhikang@youngyedu.com, 2020/1/21 9:35
 * @Modified : lizhikang@youngyedu.com, 2020/1/21
 */
public class InsertSort {

    public static int [] insertSort(int [] arr){
        int num = 0;
        for(int i =1;i<arr.length;i++){
            int temp = arr[i];
            int left = i-1;
            while(left>=0 && arr[left]>temp){
                arr[left+1] = arr[left];
                left --;
            }
            arr[left+1] = temp;
        }
        System.out.println("执行循环次数: "+num);
        return arr;
    }
    public static void main(String [] args){
        int [] arr = new int[]{34,324,23,42,34,1,23,12,3};
//        insertSort2(arr);
        insertSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

    public static void insertSort2(int [] arr){
        int num = 0;
        for(int i =1;i<arr.length;i++){
           num++;
           int temp;
           if(arr[i]<arr[i-1]){
            temp = arr[i];
            for(int j = i;j>=0;j--){
                num++;
                if(j>0 && arr[j-1]>temp){
                    arr[j] = arr[j-1];
                }else{
                    arr[j] = temp;
                    break;
                }
            }
           }
        }
        System.out.println(Arrays.toString(arr));
    }


//    for(int i = 1;i<arr.length;i++){
//        int temp = arr[i];
//        int leftTemp = i-1;
//        while(leftTemp>=0 && arr[leftTemp]>temp){
//            arr[leftTemp+1] = arr[leftTemp];
//            leftTemp--;
//            num++;
//        }
//        num++;
//        arr[leftTemp+1]  = temp;
//    }
}
