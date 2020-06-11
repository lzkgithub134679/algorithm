package com.example.algorithm.classicalrank;

import java.util.Arrays;

/**https://sort.hust.cc/4.shellsort
 *
 * @Description : 希尔排序
 * @Author : lizhikang@youngyedu.com, 2020/1/21 10:16
 * @Modified : lizhikang@youngyedu.com, 2020/1/21
 */
public class HillSort {

    public static void main(String [] args){
        int [] arr = new int[]{34,324,23,42,34,1,23,12,3};
        shellSort(arr);
    }

    public static void shellSort(int[] arr){
        int n = arr.length;
        // 进行分组，最开始时的增量(gap) 为数组长度的一半
        for(int gap = n/2;gap>0; gap/=2){
            // 对各组进行插入排序
            for(int i= gap; i<n;i++){
                // 将arr[i] 插入到所在分组的正确位置上
                insertI(arr,gap,i);
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void insertI(int[] arr, int gap, int i) {
        int inserted = arr[i];
        int j;
        for(j= i-gap;j>=0 && inserted<arr[j];j-=gap){
            arr[j+gap] = arr[j];
        }
        arr[j+gap] = inserted;

    }

}
