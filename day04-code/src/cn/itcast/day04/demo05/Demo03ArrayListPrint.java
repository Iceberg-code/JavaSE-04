package cn.itcast.day04.demo05;

import java.lang.ref.SoftReference;
import java.util.ArrayList;

/*
* 题目：
* 定义以指定格式打印集合的方法（ArrayList类型作为参数），使用{}扩起集合，使用@分割每个元素
* 格式参照 {元素@元素@元素}
*
* */
public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("源氏");
        list.add("铁拳");
        list.add("安娜");
        list.add("卢西奥");
        System.out.println(list);   //[源氏, 铁拳, 安娜, 卢西奥]
        printArrayList(list);
    }
    /*
    * 定义方法的三要素：
    * 1、返回值名称：只是进行打印而已，没有运算、没有结果，所以用void类型
    * 2、方法名称：printArrayList
    * 3、参数列表：ArrayList
    * */
    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            if(i == list.size() - 1)
                System.out.print(name + "}");
            else
                System.out.print(name + "@");
        }
    }

}
