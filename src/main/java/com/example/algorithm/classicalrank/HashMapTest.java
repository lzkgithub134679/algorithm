package com.example.algorithm.classicalrank;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description : 
 * @Author : lizhikang@youngyedu.com, 2020/4/29 11:51
 * @Modified : lizhikang@youngyedu.com, 2020/4/29
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String,Person> map = new HashMap<>();
        map.put("张三",new Person("张三",21));
        map.put("李四",new Person("李四",17));
        map.put("王五",new Person("王五",32));
        map.put("赵六",new Person("赵六",12));
        map.put("孙七",new Person("孙七",32));
        map.put("周八",new Person("周八",12));
        map.put("钱九",new Person("钱九",3));
        map.put("吴十",new Person("吴十",112));

        System.out.println(map);
    }
    @Data
    static class Person{
        private String name;
        private Integer age;
        public Person(String name,Integer age){
            this.name = name;
            this.age = age;
        }

    }
}
