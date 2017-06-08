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
    }
}
