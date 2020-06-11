package com.example.algorithm.algorithmic;

/**
 * @Description : 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，
 * 当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 * @Author : lizhikang@youngyedu.com, 2020/6/1 14:10
 * @Modified : lizhikang@youngyedu.com, 2020/6/1
 */

public class ReplaceSpace {

    public static void main(String[] args) {
        StringBuffer st = new StringBuffer("We Are Happy");
        System.out.println(replaceSpace(st));
    }


    public static  String replaceSpace(StringBuffer str) {
        String stt = "";
        for(int i=0;i<str.length()-1;i++){
            if(' ' == str.charAt(i)){
                stt += "%20";
            }else{
                stt += str.charAt(i);
            }
        }
        return stt;
    }
}
