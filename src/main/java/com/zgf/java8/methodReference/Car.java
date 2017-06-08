package com.zgf.java8.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by zgf on 17/6/8.
 * <p>
 * 方法引用测试
 */
public class Car {

    public static Car create(Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void colllide(Car car) {
        System.out.println("collide " + car.toString());
    }

    public void follow(Car another) {
        System.out.println("foller " + another.toString());
    }

    public void repair() {
        System.out.println("repair " + this.toString());
    }

    public static void main(String[] args) {
        // 构造方法引用
        Car car = Car.create(Car::new);
        List<Car> cars = Arrays.asList(car);

        // 静态方法引用
        cars.forEach(Car::colllide);

        // 类实例方法引用
        cars.forEach(Car::repair);

        // 特殊的类方法
        cars.forEach(car::follow);
    }
}
