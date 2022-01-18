package com.example.intent_java_task4;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String age;
    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @NonNull
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
