package com.lj.studyp3.domain;


import com.lj.studyp3.service.Status;

/**
 * @program: day06-day18
 * @description: 程序员
 * @author: Mr.Li
 * @create: 2020-05-27 15:39
 **/
public class Programmer extends Employee {
    private int memberId;//memberId 用来记录成员加入开发团队后在团队中的ID
    private Status status = Status.FREE;
    private Equipment equipment;

    public Status getStatus () {
        return status;
    }

    public void setStatus (Status status) {
        this.status = status;
    }

    public Equipment getEquipment () {
        return equipment;
    }

    public void setEquipment (Equipment equipment) {
        this.equipment = equipment;
    }

    public int getMemberId () {
        return memberId;
    }

    public void setMemberId (int memberId) {
        this.memberId = memberId;
    }



    public Programmer () {
        super();
    }

    public Programmer (int id, String name, int age, double salary,Equipment equipment ) {
        super (id, name, age, salary);
        this.equipment = equipment;
    }

    protected String getMemberDetails() {
        return getMemberId() + "/" + getDetails();
    }

    public String getDetailsForTeam() {
        return getMemberDetails() + "\t程序员";
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + status + "\t\t\t\t\t\t" + equipment.getDescription() ;
    }
}

