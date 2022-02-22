package Practice.immutable;

public final class Employee {
    private final String empName;
    private final String empDept;
    private final Address address;


    public Employee(String empName, String empDept, Address address) {
        this.empName = empName;
        this.empDept = empDept;
        this.address = address;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public Address getAddress() {
        return new Address(address);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empDept='" + empDept + '\'' +
                ", address=" + address +
                '}';
    }
}
