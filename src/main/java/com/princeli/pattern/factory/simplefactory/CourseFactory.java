package com.princeli.pattern.factory.simplefactory;


import com.princeli.pattern.factory.ICourse;

/**
 * @author : liyang
 * @version 1.0
 * @className CourseFactory
 * @date 2019-03-28 22:02
 * @description: TODO
 */
public class CourseFactory {

//    public ICourse create(String name){
//        if ("java".equals(name)){
//            return new JavaCourse();
//        }else {
//            return null;
//        }
//    }

    public ICourse create(Class clazz){
        try {
            if (null != clazz){
                    return  (ICourse)clazz.newInstance();
            }
        }catch (Exception e){

        }
        return  null;
    }
}
