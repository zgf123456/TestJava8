package com.zgf.java8.methodReference;

import com.zgf.java8.methodReference.model.Person;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zgf on 17/6/8.
 */
public class TestMethod {
    public static void main(String[] args) {
        Person[] persons = new Person[5];

        // 使用匿名类
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.birthday.compareTo(o2.birthday);
            }
        });


        // 使用lambda
        Arrays.sort(persons, (o1, o2) -> o1.birthday.compareTo(o2.birthday));

        // 使用类的普通方法引用，需要通过实例化对象引用
        final Person person = new Person();

        // 使用lambda和类的静态方法
        Arrays.sort(persons, (o1, o2) -> person.compare(o1, o2));

        // 使用类的普通方法引用
        Arrays.sort(persons, person::compare);


        // =====================================
        // 测试使用基础类型对象的实例方法
        String[] stringsArray = {"Hello", "World"};

        //使用lambda表达式和类型对象的实例方法
        Arrays.sort(stringsArray, (s1, s2) -> s1.compareToIgnoreCase(s2));

        //使用方法引用
        //引用的是类型对象的实例方法, 为何java类型的方法引用不需要实例化???
        Arrays.sort(stringsArray, String::compareToIgnoreCase);
    }
}
