package com.zion.comparable;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String dept;

    public Student(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
    //TYPE - 1  (id)
      /*  if (this.getId()==student.getId()){            //ascending order (id)
            return 0;
        }else if(this.getId()>student.getId()){          // for descending change > to <
            return 1;
        }else
            return -1;*/

      //TYPE -2   (id)

     //   return this.getId()<student.getId()?-1:(this.getId()==student.getId()?0:1);// ascending // for descending change < to >

      // TYPE -3     (id)

       // return Integer.compare(this.getId(),student.getId()); //ascending
     //   return Integer.compare(student.getId(),this.getId());  //descending

        //TYPE -4   (name)

     //   return this.getName().compareTo(student.getName());  // ascending
     //   return student.getName().compareTo(this.getName());    // descending

    // TYPE - 5  (dept)
       // return this.getDept().compareTo(student.getDept());   // ascending
        return student.getDept().compareTo(this.getDept()); // descending


    }
}
