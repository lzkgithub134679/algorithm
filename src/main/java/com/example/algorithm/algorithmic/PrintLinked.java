package com.example.algorithm.algorithmic;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @Description : 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * @Author : lizhikang@youngyedu.com, 2020/6/1 14:21
 * @Modified : lizhikang@youngyedu.com, 2020/6/1
 */
public class PrintLinked {

    public static class ListNode {
       int val;
       ListNode next = null;

       ListNode(int val) {
           this.val = val;
       }
    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> num = new ArrayList<>();
        Stack<Integer>stack = new Stack();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.empty()){
            num.add(stack.pop());
        }
        return num;
    }


    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        l.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        ArrayList<Integer> integers = printListFromTailToHead(l);
        System.out.println(integers);
    }
}
