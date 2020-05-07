package cn.itcast.day04.demo04;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("源氏");
        list.add("卢西奥");
        list.add("麦克雷");

        for (int i = 0; i < list.size(); i++) {     //可以用list.fori或者list.size().fori生成
            System.out.println(list.get(i));
        }
    }
}
