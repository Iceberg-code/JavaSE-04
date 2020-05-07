package cn.itcast.day04.demo04;

import java.util.ArrayList;

/*
* 数组的长度不可以发生改变。
* 但是ArrayList集合的长度是可以随意变化的
*
* 对于ArrayList来说，有一个尖括号<E>代表泛型
* 泛型：也就是装在集合当中的所有元素，全都是统一的什么类型
* 注意：泛型只能是引用类型，不能是基本类型
*
* 注意事项：
* 对于ArrayList集合来说，直接打印得到的不是地址值，而是内容
* 如果内容是空，得到的是空的中括号：[]
* */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合的名称是list，里面装的全都是String字符串类型数据
        //备注：从JDK1.7+开始，右侧的尖括号内部可以不写内容，但是<>本身还是要写的
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);   // []

        //向集合当中添加一些数据，需要用到add方法
        list.add("雷军");
        System.out.println(list);

        list.add("小美");
        list.add("麦克雷");
        list.add("安娜");
        System.out.println(list);

//        list.add(10);   //错误写法！因为创建的时候尖括号泛型已经说了是字符串，添加进去的类型必须都是字符串类型才行
    }

}
