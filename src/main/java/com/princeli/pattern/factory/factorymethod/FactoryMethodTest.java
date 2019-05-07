package com.princeli.pattern.factory.factorymethod;

import com.princeli.pattern.factory.ICourse;

/**
 * @author : liyang
 * @version 1.0
 * @className FactoryMethodTest
 * @date 2019-03-28 22:27
 * @description: TODO
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new PythonCourseFactory();
        ICourse course =  factory.create();
        course.record();
    }
}
