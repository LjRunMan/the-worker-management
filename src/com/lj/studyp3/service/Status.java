package com.lj.studyp3.service;

/**
 * @program: day06-day18
 * @description: Status枚举类位于service包中，封装员工的状态
 * @author: Mr.Li
 * @create: 2020-05-27 16:02
 **/
public class Status {
    private final String NAME;
    private Status(String name) {
        this.NAME = name;
    }
    public static final Status FREE = new Status("FREE");
    public static final Status VOCATION = new Status("VOCATION");
    public static final Status BUSY = new Status("BUSY");
    public String getNAME() {
        return NAME;
    }
    @Override
    public String toString() {
        return NAME;
    }

}
