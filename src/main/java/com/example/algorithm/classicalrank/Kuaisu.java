package com.example.algorithm.classicalrank;

/**
 * @Description : 快速排序
 * @Author : lizhikang@youngyedu.com, 2020/6/9 10:42
 * @Modified : lizhikang@youngyedu.com, 2020/6/9
 */
public class Kuaisu {
    public static void main(String[] args) {
        int []array = {49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22};
        quickSort(array,0,array.length-1);
        for (int s :array){
            System.out.println(s);
        }
    }


    public static void quickSort(int []arr,int left,int right){
        if(left>right){
            return;
        }
        // 定义基准值
        int base = arr[left];
        int i = left,j=right;
        while (i<j){
            while(i<j && arr[j] >= base){
                j--;
            }
            while(arr[i] <= base && i<j){
                i++;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = base;
        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }


    public static void sort(int []array,int left,int right){
        if(left>right){
            return;
        }
        // 放入基准
        int base = array[left];
        int i = left ,j = right;
        while (i <j){
            while (array[j] >= base && i<j){
                j --;
            }
            while (array[i] <= base && i<j){
                i++;
            }
            if(i<j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        array[left] = array[i];
        array[i] = base;

        sort(array,left,i-1);
        sort(array,i+1,right);
    }

}
