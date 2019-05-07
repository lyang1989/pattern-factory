package com.princeli.pattern.factory.abstractfactory;

import com.princeli.pattern.factory.ICourse;

/**
 * @author : liyang
 * @version 1.0
 * @className ICourseFactory
 * @date 2019-03-28 22:23
 * @description: TODO
 */
public interface ICourseFactory {

    public ICourse createCourse();

    public INote createNote();

    public IVideo createVideo ();



}
