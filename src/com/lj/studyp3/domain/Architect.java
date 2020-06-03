package com.lj.studyp3.domain;



/**
 * @program: day06-day18
 * @description: 架构师
 * @author: Mr.Li
 * @create: 2020-05-27 15:39
 **/
public class Architect extends Designer {
    private int stock;//表示公司奖励的股票数量


    public Architect(){
        super();
    }

    public Architect (int id, String name, int age, double salary ,Equipment equipment, double bonus, int stock) {
        super (id, name, age, salary,equipment, bonus);
        this.stock = stock;
    }

    public int getStock () {
        return stock;
    }

    public void setStock (int stock) {
        this.stock = stock;
    }
    public String getDetailsForTeam() {
        return getMemberDetails() + "\t架构师\t" +
                getBonus() + "\t" + getStock();
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" +
                getBonus() + "\t\t" + getStock() + "\t" + getEquipment().getDescription();
    }
}
