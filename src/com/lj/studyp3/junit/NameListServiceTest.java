package com.lj.studyp3.junit;

import com.lj.studyp3.domain.Employee;
import com.lj.studyp3.service.NameListService;
import org.junit.Test;

/**
 * @program: day06-day18
 * @description: No Description
 * @author: Mr.Li
 * @create: 2020-05-27 20:04
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
