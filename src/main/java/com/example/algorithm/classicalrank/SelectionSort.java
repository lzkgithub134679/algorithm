package com.example.algorithm.classicalrank;

import java.util.Arrays;

/** https://sort.hust.cc/2.selectionsort
 *
 * @Description : 选择排序
 *  选择排序是一种简单直观的排序算法，无论什么数据进去都是 O(n²) 的时间复杂度，所以用到它的时候，数据规模越小
 *  越好。唯一的好处可能就是不占用额外的内存空间。
 * 步骤:
 * 1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
 * 2.再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
 * 3.重复第二步，直到所有元素均排序完毕。
 * @Author : lizhikang@youngyedu.com, 2020/1/20 10:12
 * @Modified : lizhikang@youngyedu.com, 2020/1/20
 */
public class SelectionSort {

    public static int [] selectopmSort(int [] arr){
        int num = 0;
        for(int i  = 0 ;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    int temp = arr[min];
                    arr[min] = arr[j];
                    arr[j] = temp;
                }
                num++;
            }
            num++;
        }
        System.out.println("执行循环次数: "+num);
        return arr;
    }
    public static void main(String [] args){
        int [] arr = new int[]{34,324,23,42,34,1,23,12,3};
        selectopmSort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }

}
