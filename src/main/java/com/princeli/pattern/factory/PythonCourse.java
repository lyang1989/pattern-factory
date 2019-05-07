package com.princeli.pattern.factory;

/**
 * @author : liyang
 * @version 1.0
 * @className PythonCourse
 * @date 2019-03-28 22:24
 * @description: TODO
 */
public class PythonCourse implements ICourse{
    @Override
    public void record(){
        System.out.println("录制python课程");
    }
}
