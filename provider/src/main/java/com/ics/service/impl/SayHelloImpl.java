package com.ics.service.impl;


import com.ics.service.SayHello;

public class SayHelloImpl implements SayHello {

    public String sayHello(String name) {

        return "Hello "+name;
    }
}
