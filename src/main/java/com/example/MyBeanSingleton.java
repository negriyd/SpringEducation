package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by dmitriyn on 4/22/16.
 */
@Component
@Scope("prototype")
public class MyBeanSingleton {
    @Autowired
    private MyBeanDependency1 dependency1;
    @Autowired
    private MyBeanDependency2 dependency2;


    @Override
    public String toString() {
        return "{dependency1 = " + getDependency1() + ", dependency2 = " + getDependency2() + "}";
    }


    public MyBeanDependency1 getDependency1() {
        return dependency1;
    }


    public MyBeanDependency2 getDependency2() {
        return dependency2;
    }

}
