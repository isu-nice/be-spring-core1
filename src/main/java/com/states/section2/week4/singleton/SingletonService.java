package com.states.section2.week4.singleton;

public class SingletonService {

    // static 영역에 딱 한개의 객체만 생성한다
    private static final SingletonService instance = new SingletonService();

    // 이 메서드를 통해서만 인스턴스를 조회할 수 있도록 한다
    public static SingletonService getInstance() {
        return instance;
    }

    // 외부에서 new로 객체를 생성할 수 없도록 한다
    private SingletonService() {
    }
}
