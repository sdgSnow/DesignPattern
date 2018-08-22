package com.weidu.designpattern.builder;

/**
 * 建造者模式
 * 需要什么属性就拿什么属性，以这个Person为例，不需要创建N个构造方法，增加代码可读性
 * 最重要的是我们需要什么就点什么，开发起来身心愉悦
 * */
public class Person {
    private final String name;//姓名
    private final int age;//年龄
    private final String sex;//性别
    private final String identity;//身份

    private Person(PersonBuilder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.sex = builder.sex;
        this.identity = builder.identity;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getIdentity() {
        return identity;
    }

    /**
     * 创建PersonBuilder
     * */
    public static class PersonBuilder{
        private final String name;//姓名(如果必选则需要final)
        private int age;//年龄
        private String sex;//性别
        private String identity;//身份

        /**
         * 因为name是必选，所以添加一个带参name的构造
         * */
        public PersonBuilder(String name){
            this.name = name;
        }

        public PersonBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PersonBuilder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public PersonBuilder setIdentity(String identity) {
            this.identity = identity;
            return this;
        }

        //直接build返回person对象
        public Person build(){
            return new Person(this);
        }

        //添加限制条件再返回person对象
//        public Person build(){
//        //注意事项，先创建对象，再返回，因为PersonBuilder不是线程安全的，如果后创建对象，可能属性会被其他线程改变
//            Person person = new Person(this);
//            if (person.getAge()>100){
//                throw  new IllegalStateException("哥们，年龄这么大，你超神了");
//            }
//            return person;
//        }
    }
}
