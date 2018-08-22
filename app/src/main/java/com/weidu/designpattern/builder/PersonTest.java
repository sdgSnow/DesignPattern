package com.weidu.designpattern.builder;

/**
 * 普通的模式
 * */
public class PersonTest {
    private String name;//姓名(如果必选则需要final)
    private int age;//年龄
    private String sex;//性别
    private String identity;//身份

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }
}
