package com.example.algorithm.algorithmic;

import java.util.Stack;

/**
 * @Description : 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 * @Author : lizhikang@youngyedu.com, 2020/6/1 15:29
 * @Modified : lizhikang@youngyedu.com, 2020/6/1
 */
public class StackRealizationQueue {
    public static void main(String[] args) {
        StackRealizationQueue s = new StackRealizationQueue();
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(65);
        s.push(7);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    public void push(int node) {
        stack1.push(node);
    }
    public int pop() {
        if(stack1.empty() && stack2.empty()){
            throw new RuntimeException("没数据");
        }
        if(stack2.empty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
