package com.example.algorithm.algorithmic;

/**
 * @Description : 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 * @Author : lizhikang@youngyedu.com, 2020/6/2 16:53
 * @Modified : lizhikang@youngyedu.com, 2020/6/2
 */
public class TheNumberOneTotal {

    public static void main(String[] args) {


        System.out.println(NumberOf1(43534));
    }

    public static int NumberOf1(int n) {
        if(n == 0){
            return 0;
        }
        String s = Integer.toBinaryString(n);
        int num = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1'){
                num++;
            }
        }
        return num;
    }
}
