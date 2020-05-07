package cn.itcast.day04.demo04;

import java.util.ArrayList;

/*
* ArrayList当中的常用方法有：
*
* public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功
* 备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
* 但对于其他集合（今后学习）来说，add添加动作不一定成功
* public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素
* public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素
* public int size()：获取集合的尺寸长度，返回值是集合中包含元素的个数
* */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        boolean success = list.add("士兵76");     //布尔值success验证添加的动作是否成功
        System.out.println(list);   //[士兵76]
        System.out.println("添加的动作是否成功：" + success); //true

        list.add("源氏");
        list.add("卢西奥");
        list.add("麦克雷");
        list.add("安娜");
        System.out.println(list);   //[士兵76, 源氏, 卢西奥, 麦克雷, 安娜]

        //从集合中获取元素：get。索引值从0开始
        String name = list.get(2);
        System.out.println("第2号索引位置：" + name);
//        System.out.println(list.get(1));  //也对

        //从集合中删除元素：remove。索引值从0开始
        String whoRemoved = list.remove(1);
        System.out.println("被删除的人是：" + whoRemoved);
//        System.out.println(list.remove(3));   //也对
        System.out.println(list);

        //获取集合的长度尺寸，也就是其中的元素个数
        int size = list.size();
        System.out.println("集合长度是：" + size);
//        System.out.println(list.size());  //也对
    }
}
