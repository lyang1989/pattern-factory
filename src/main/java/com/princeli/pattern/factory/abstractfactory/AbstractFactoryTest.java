package com.princeli.pattern.factory.abstractfactory;

/**
 * @author : liyang
 * @version 1.0
 * @className AbstractFactoryTest
 * @date 2019-05-07 22:19
 * @description: TODO
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse();
        factory.createNote();
        factory.createVideo();

    }
}
