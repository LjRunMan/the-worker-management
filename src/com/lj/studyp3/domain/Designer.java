package com.lj.studyp3.domain;



/**
 * @program: day06-day18
 * @description: 设计师
 * @author: Mr.Li
 * @create: 2020-05-27 15:39
 **/
public class Designer extends  Programmer {
    private double bonus;//表示奖金
    public Designer(){
        super();
    }

    public Designer (int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super (id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus () {
        return bonus;
    }

    public void setBonus (double bonus) {
        this.bonus = bonus;
    }
    public String getDetailsForTeam() {
        return getMemberDetails() + "\t设计师\t" + getBonus();
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" +
                getBonus() +"\t\t\t\t" + getEquipment().getDescription();
    }
}
