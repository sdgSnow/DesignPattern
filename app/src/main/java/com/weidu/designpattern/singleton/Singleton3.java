package com.weidu.designpattern.singleton;
/**
 * 单例模式
 * 单例模式有很多种，饿汉式,懒汉式，双重锁模式
 * */
public class Singleton3 {
    private volatile static Singleton3 instance = null;

    private Singleton3() {
    }
    /**
     * 提供外部调用方法获取实例，通过双重if判断，避免多次同步，只获取第一次对象的时候才同步
     * 优点：防止其他对象实例化其自己的 Singleton3 对象的副本，确保唯一性
     * 弊端：多了一层判断实例，增大了开销
     * */
    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
