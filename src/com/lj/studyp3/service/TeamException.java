package com.lj.studyp3.service;

/**
 * @program: day06-day18
 * @description: No Description
 * @author: Mr.Li
 * @create: 2020-05-27 17:41
 **/
public class TeamException extends Exception{
    static final long serialVersionUID = -33876993124229948L;

    public TeamException () {
        super();
    }
    public TeamException(String msg){
        super(msg);
    }
}
