package in.AnkitCoding.challenge79;

public class TestEmployee {
    public static void main(String[] args) {

        Employee employee = new Employee("Ankit kumar", 18, 50000);

        System.out.println(employee.grtEmployeeDetails());

        employee.setName("Moto");
        employee.setAge(20);
        employee.setSalary(25000);

        System.out.println(employee.grtEmployeeDetails());

    }
}
