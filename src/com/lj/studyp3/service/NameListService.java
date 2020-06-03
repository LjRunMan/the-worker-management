package com.lj.studyp3.service;

import com.lj.studyp3.domain.*;

import static com.lj.studyp3.service.Data.*;

/**
 * @program: day06-day18
 * @description: 功能：负责将Data中的数据封装到Employee[]数组中，同时提供相关操作Employee[]的方法。
 * 说明：
 * employees用来保存公司所有员工对象
 * NameListServiceTest()构造器：
 * 根据项目提供的Data类构建相应大小的employees数组
 * 再根据Data类中的数据构建不同的对象，包括Employee、Programmer、Designer和Architect对象，以及相关联的Equipment子类的对象
 * 将对象存于数组中
 * Data类位于com.atguigu.team.service包中
 * @author: Mr.Li
 * @create: 2020-05-27 17:29
 *
 */

public class NameListService {


    private Employee[] employees;//employees用来保存公司所有员工对象

    public Employee[] getEmployees () {
        return employees;
    }

    public void setEmployees (Employee[] employees) {
        this.employees = employees;
    }

    public NameListService () {

        employees = new Employee[EMPLOYEES.length];//根据项目提供的Data类构建相应大小的employees数组

        for (int i = 0; i < EMPLOYEES.length; i++) {

            // 获取公司员工通用的属性
            int type = Integer.parseInt (EMPLOYEES[i][0]);
            int id = Integer.parseInt (EMPLOYEES[i][1]);
            String name = String.valueOf (EMPLOYEES[i][2]);
            int age = Integer.parseInt (EMPLOYEES[i][3]);
            double salary = Integer.parseInt (EMPLOYEES[i][4]);

            Equipment eq;
            double bonus;
            int stock;
            //根据员工ID获取相对应的设备
            switch (type) {
                case EMPLOYEE:
                    employees[i] = new Employee (id, name, age, salary);
                    break;
                case PROGRAMMER:
                    eq = createEquipment (i);
                    employees[i] = new Programmer (id, name, age, salary, eq);
                    break;
                case DESIGNER:
                    eq = createEquipment (i);
                    bonus = Integer.parseInt (EMPLOYEES[i][5]);
                    employees[i] = new Designer (id,name,age,salary,eq,bonus);
                    break;
                case ARCHITECT:
                    eq = createEquipment(i);
                    bonus = Integer.parseInt(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, eq, bonus, stock);
                    break;
            }
        }

    }
    /**
     * @param index
     * @description: 根据员工类型分配不同的设备
     * @return:
     * @author: LiJie
     * @time: 2020/5/27 0027 下午 6:29
     */
    private Equipment createEquipment (int index) {
        int type = Integer.parseInt (EQIPMENTS[index][0]);
        switch (type) {
            case PC:
                return new PC (EQIPMENTS[index][1], EQIPMENTS[index][2]);
            case NOTEBOOK:
                int price = Integer.parseInt (EQIPMENTS[index][2]);
                return new NoteBook (EQIPMENTS[index][1], price);
            case PRINTER:
                return new Printer(EQIPMENTS[index][1], EQIPMENTS[index][2]);
        }
        return null;
    }



    /**
     * @param
     * @description: 获取当前所有员工。
     * @return: 包含所有员工对象的数组
     * @author: LiJie
     * @time: 2020/5/27 0027 下午 5:39
     */
    public Employee[] getAllEmployees () {

        return employees;
    }

    /**
     * @param id//指定员工的ID
     * @description: 获取指定ID的员工对象。
     * @return: 指定员工对象
     * @author: LiJie
     * @time: 2020/5/27 0027 下午 5:39
     */
    public Employee getEmployee (int id) throws TeamException {

        throw new TeamException("该员工不存在");
    }

}
