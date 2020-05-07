package cn.itcast.day04.demo04;
/*
* 题目：
* 定义一个数组，用来存储三个Person对象
*
* 数组有一个缺点：一旦创建，程序运行期间长度不可以发生改变
* */
public class Demo01Array {
    public static void main(String[] args) {
        //创建一个长度为3的数组，里面用来存放Person类型的对象
        Person[] array = new Person[3];

        Person one = new Person("雷军", 37);
        Person two = new Person("余承东", 47);
        Person three = new Person("罗永浩", 57);

        array[0] = one;
        array[1] = two;
        array[2] = three;

//        System.out.println(one);
//        System.out.println(two);
//        System.out.println(three);
//
        //将one当中的地址赋值到数组元素的0号元素位置
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);

//        Person person = array[1];
//        System.out.println(person.getName());
        System.out.println(array[1].getName());
    }

}
