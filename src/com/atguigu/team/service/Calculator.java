package com.atguigu.team.service;

/**
 * @program: day06-day18
 * @description: No Description
 * @author: Mr.Li
 * @create: 2020-05-15 11:38
 **/
public class Calculator {
    public int result=0;
    public int add(int operand1,int operand2){
        result=operand1+operand2;   //将两个传入参数进行相加操作
        return result;
    }
    public  int subtract(int operand1,int operand2){
        result=operand1-operand2;   //将两个传入参数进行相减操作
        return  result;
    }
    public int multipe(int operand1,int operand2){
        result=operand1*operand2;   //将两个传入参数进行相乘操作
        for(;;){                    //死循环
        }
    }
    public int divide(int operand1,int operand2){
        result=operand1/0;      //除0操作
        return result;
    }
    public int getResult(){
        return this.result;     //返回计算结果
    }

}

