package com.zion.immutable;

import com.zion.immutable.Address;

final class StudentImmutableClass {
    private final int studentId;
    private final String studentName;
    private final String studentCource;
    private final Address address;

    public StudentImmutableClass(int studentId, String studentName, String studentCource, Address address) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentCource = studentCource;
        this.address = address;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentCource() {
        return studentCource;
    }

    public Address getAddress() {
       // return address;
        return new Address(address);//copy constructor
    }

    @Override
    public String toString() {
        return "StudentImmutableClass{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentCource='" + studentCource + '\'' +
                ", address=" + address +
                '}';
    }
}
