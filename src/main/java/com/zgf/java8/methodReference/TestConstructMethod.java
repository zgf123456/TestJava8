package com.zgf.java8.methodReference;

import com.zgf.java8.methodReference.model.Person;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by zgf on 17/6/8.
 * <p>
 * 构造方法引用测试
 */
public class TestConstructMethod {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        List<Person> personList = Arrays.asList(persons);

        // lambda写法
        HashSet<Person> personsDest = Person.transferElements(personList, () -> new HashSet<Person>());

        //使用方法引用
        //引用的是构造方法
        HashSet<Person> personsDest2 = Person.transferElements(personList, HashSet::new);
    }
}
