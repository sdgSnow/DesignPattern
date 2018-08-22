package com.weidu.designpattern.singleton;
/**
 * 单例模式
 * 单例模式有很多种，饿汉式,懒汉式，双重锁模式
 * */
public class Singleton1 {
    /**
     * 饿汉式：需要的时候就new
     * */
    //提供一个内部实例
    public static final Singleton1 instance = new Singleton1();
    private Singleton1(){}
    //提供静态外部调用方法
    public static Singleton1 getInstance(){
        return instance;
    }
}
