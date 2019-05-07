package com.princeli.pattern.factory.abstractfactory;

import com.princeli.pattern.factory.ICourse;
import com.princeli.pattern.factory.PythonCourse;

/**
 * @author : liyang
 * @version 1.0
 * @className PythonCourseFactory
 * @date 2019-05-07 22:22
 * @description: TODO
 */
public class PythonCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
