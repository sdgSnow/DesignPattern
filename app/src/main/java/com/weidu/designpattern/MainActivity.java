package com.weidu.designpattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.weidu.designpattern.builder.Person;
import com.weidu.designpattern.builder.PersonTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //普通模式获取PersonTest对象
        PersonTest personTest = new PersonTest();
        personTest.setName("候明天的雪");
        personTest.setAge(18);
        personTest.setSex("男");
        personTest.setIdentity("码农");

        //通过builder创建一个Person对象
        Person person = new Person.PersonBuilder("候明天的雪")
                .setAge(18)
                .setSex("男")
                .setIdentity("码农")
                .build();
    }
}
