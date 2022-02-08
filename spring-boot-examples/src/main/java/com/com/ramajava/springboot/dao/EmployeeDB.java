package com.com.ramajava.springboot.dao;

import java.util.ArrayList;
import java.util.List;

import com.com.ramajava.springboot.model.EmployeeVO;

public class EmployeeDB {
	 
    public static List<EmployeeVO> getEmployeeList()
    {
        List<EmployeeVO> list = new ArrayList<>();
 
        EmployeeVO empOne = new EmployeeVO(1, "rama", "krishna", "ramakrishnagoud.j@gmail.com");
        EmployeeVO empTwo = new EmployeeVO(2, "sowji", "sowri", "sowji.s@yahoo.com");
        EmployeeVO empThree = new EmployeeVO(3, "kranthi", "krishn", "kkranthi@gmail.com");
 
        list.add(empOne);
        list.add(empTwo);
        list.add(empThree);
 
        return list;
    }
}
