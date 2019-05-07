package com.princeli.pattern.factory.abstractfactory;

import com.princeli.pattern.factory.ICourse;
import com.princeli.pattern.factory.JavaCourse;

/**
 * @author : liyang
 * @version 1.0
 * @className JavaCourseFactory
 * @date 2019-05-07 22:16
 * @description: TODO
 */
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
