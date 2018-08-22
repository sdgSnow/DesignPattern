package com.weidu.designpattern.singleton;

/**
 * 单例模式
 * 单例模式有很多种，饿汉式,懒汉式，双重锁模式
 * */
public class Singleton2 {

    /**
     * 懒汉式：比较常用的模式
     * */
    private static Singleton2 instance = null;
    private static synchronized Singleton2 getInstance(){
        if(instance == null){
            return new Singleton2();
        }
        return instance;
    }
}
