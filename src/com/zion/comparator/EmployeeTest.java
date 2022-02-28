package com.zion.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(101,"saitej","Spring"));
        list.add(new Employee(104,"krish","AWS"));
        list.add(new Employee(103,"sunny","Devops"));
        list.add(new Employee(102,"vamshi","UI"));

     /*   Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
               // return e1.getId()<e2.getId()?-1:(e1.getId()==e2.getId()?0:1);
              //  return e1.getName().compareTo(e2.getName());
            }
        });*/

       // Collections.sort(list,new TechComparator());


     //   list.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
        list.sort((e1,e2)->e1.getTech().compareTo(e2.getTech()));

        list.forEach(System.out::println);
    }
}
