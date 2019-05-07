package com.princeli.pattern.factory.factorymethod;

import com.princeli.pattern.factory.ICourse;
import com.princeli.pattern.factory.JavaCourse;

/**
 * @author : liyang
 * @version 1.0
 * @className JavaCourseFactory
 * @date 2019-03-28 22:25
 * @description: TODO
 */
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create(){
        return new JavaCourse();
    }
}
