package com.princeli.pattern.factory.simplefactory;

import com.princeli.pattern.factory.ICourse;
import com.princeli.pattern.factory.JavaCourse;

/**
 * @author : liyang
 * @version 1.0
 * @className SimpleFactoryTest
 * @date 2019-03-28 22:00
 * @description: TODO
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
            CourseFactory factory = new CourseFactory();
            ICourse course = factory.create(JavaCourse.class);
            course.record();
    }
}
