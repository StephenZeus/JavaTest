package com.xiaoaxiao.test.object_and_string_test;

/**
 * Created by xiaoaxiao on 2019/7/8
 * Description: 覆写toString()与equals()
 */
class Person{

    private String name;
    private int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "姓名："+this.name+"，年龄："+this.age;
    }

    public boolean equals(Object object){

        // 如果传入的object是一个null，没有可比性，直接返回false
        if (object==null){
            return false;
        }

        // 如果object与this指向的是同一个对象，
        // 自己与自己作比较也没有意义，直接返回true
        if(object == this){
            return true;
        }

        // 判断obj是否为Person类的实例
        // 若不是，两个不同类的对象根本就没有可比性，直接返回false
        if(!(object instanceof Person)){
            return false;
        }

        // 否则的话(obj是当前类或其子类的实例)
        // 向下转型（引入参数的时候所有类型都向上转型为Object），取得Person的属性
        Person person = (Person)object;
        return person.name.equals(this.name) && person.age == this.age;
    }
}

interface IMessage{
    void test();
}

class MessageImpl implements IMessage{
    public void test(){
        System.out.println("hello");
    }
}

public class ObjectTest {

    public static void main(String[] args){
//        com.xiaoaxiao.test.Person person = new com.xiaoaxiao.test.Person("xiao",18);
//        com.xiaoaxiao.test.Person person1 = new com.xiaoaxiao.test.Person("xiao",18);
//        System.out.println(person.equals(person1));
//        Object obj = new int[]{1,3,5,7,9};
//        int[] ret = (int[])obj;
//        System.out.println(ret[0]);
        IMessage msg = new MessageImpl();
        Object obj = msg;
        System.out.println(obj);
    }
}
