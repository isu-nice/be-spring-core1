package com.states.section2.week4;

import com.states.section2.week4.singleton.SingletonService;

public class SingletonTest {

    static SingletonService singletonService1 = SingletonService.getInstance();
    static SingletonService singletonService2 = SingletonService.getInstance();

    public static void main(String[] args) {
        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);
    }
}
