package Practice.immutable;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee emp = new Employee("saitej","IT", new Address("HYD",500064));
        System.out.println("emp = " + emp);
        Address address =emp.getAddress();
        address.setCityName("NY");
        address.setCiteCode(10001);
        System.out.println("emp = " + emp);
    }
}
