package com.zion.comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(103,"Jeff Bezos","Amazon"));
        studentList.add(new Student(102, "Elon Musk","SpaceX"));
        studentList.add(new Student(101,"MarK Zukerberg","Facebook"));
        studentList.add(new Student(104,"Ratan Tata","Tata"));

        Collections.sort(studentList);

        studentList.forEach(System.out::println);

    }


}
