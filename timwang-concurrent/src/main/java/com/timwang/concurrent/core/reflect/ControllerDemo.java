package com.timwang.concurrent.core.reflect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author tim.wang
 * @date 2020/5/31 16:09
 */
public class ControllerDemo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException {
//        UserController userController = new UserController();
//        final Class<? extends UserController> controllerClass = userController.getClass();
//
//        final Field[] declaredFields = controllerClass.getDeclaredFields();
//        for(Field field : declaredFields) {
//            final Reference annotation = field.getAnnotation(Reference.class);
//            if(annotation != null) {
//                final Class aClass = field.getType();
//                final Object object = aClass.newInstance();
//                // 属性赋值
//                field.set(userController, object);
//            }
//        }
    }
}
