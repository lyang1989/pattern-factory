package com.princeli.pattern.factory;

/**
 * @author : liyang
 * create at:  2019-03-28  20:46
 * @description:
 */
public class JavaCourse implements ICourse{

    @Override
    public void record(){
        System.out.println("录制java课程");
    }
}
