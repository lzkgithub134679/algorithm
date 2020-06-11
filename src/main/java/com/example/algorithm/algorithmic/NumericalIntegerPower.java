package com.example.algorithm.algorithmic;

/**
 * @Description : 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 * @Author : lizhikang@youngyedu.com, 2020/6/2 16:59
 * @Modified : lizhikang@youngyedu.com, 2020/6/2
 */
public class NumericalIntegerPower {

    public static void main(String[] args) {

        System.out.println(Power(5,10));
    }

    public static double Power(double base, int exponent) {
        double total = base;
        if(exponent > 0){
            for(int i=2;i<= exponent;i++){
                total = total * base;
            }
            return total;
        }else if(exponent < 0){
            exponent = - exponent;
            for(int i =2;i<=exponent;i++){
                total = total * base;
            }
            total = 1/total;
        }else{
            return 1;
        }
        return total;
    }
}
