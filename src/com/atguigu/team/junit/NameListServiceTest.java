package com.atguigu.team.junit;
import com.atguigu.team.domain.Employee;
import com.atguigu.team.service.NameListService;
import org.junit.Test;

/**
 * @program: day06-day18
 * @description: No Description
 * @author: Mr.Li
 * @create: 2020-05-27 20:25
 **/
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService nameListService = new NameListService ();
        Employee[] employees =  nameListService.getAllEmployees ();
        for (int i = 0;i<employees.length;i++){
            System.out.println (employees[i]);
        }
    }
}
