package com.zgf.java8.methodReference.model;

import java.time.LocalDate;
import java.util.Collection;
import java.util.function.Supplier;

/**
 * Created by zgf on 17/6/8.
 * <p>
 * 类的静态方法引用测试，从java7过度到java8
 */
public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    public String name;
    public LocalDate birthday;
    public Sex gender;
    public String emailAddress;

    public String getEmailAddress() {
        return emailAddress;
    }

    public Sex getGender() {
        return gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    public static int compareByAge(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public int compare(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }


    // 构造方法引用测试用，关注supplier的使用
    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(SOURCE sourceColletions, Supplier<DEST> colltionFactory) {
        DEST result = colltionFactory.get();
//        for (T t : sourceColletions) {
//            result.add(t);
//        }
        sourceColletions.forEach(result::add);
        return result;
    }
}
