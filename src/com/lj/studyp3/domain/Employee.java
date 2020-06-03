package com.lj.studyp3.domain;

/**
 * @program: day06-day18
 * @description: 普通员工
 * @author: Mr.Li
 * @create: 2020-05-27 15:37
 **/
public class Employee {
    private int id;
    private String name;
    private  int age;
    private double salary;

    public Employee () {
    }

    public Employee (int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public int getId () {
        return id;
    }
    /**
     * @description:
     * @param id
     * @return: void
     * @author: LiJie
     * @time: 2020/6/3 0003 上午 10:27
     */
    public void setId (int id) {

        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public double getSalary () {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    protected String getDetails() {
        return id + "\t" + name + "\t" + age+ "\t" +salary;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}
