package com.example.algorithm.algorithmic;

/**
 * @Description : 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * @Author : lizhikang@youngyedu.com, 2020/6/1 16:03
 * @Modified : lizhikang@youngyedu.com, 2020/6/1
 */
public class FrogJumps {

    public static void main(String[] args) {

        System.out.println();
    }

    public int JumpFloor(int target) {
        int a = 1,b=2,sum=0;
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        for(int i=2;i<target;i++){
            sum = a+b;
            b = a;
            a = sum;
        }
        return 1;
    }
}
