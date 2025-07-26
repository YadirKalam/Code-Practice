package streamCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeOperation {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Alice", 60000, "IT"),
                new Employee(2, "Bob", 75000, "HR"),
                new Employee(3, "Charlie", 50000, "Finance"),
                new Employee(4, "David", 75000, "IT"),
                new Employee(5, "Eve", 45000, "Marketing"),
                new Employee(6, "Frank", 80000, "IT"),
                new Employee(7, "Grace", 90000, "HR")
        );

        // Task 1: Sort employees by salary (desc) and then by name (asc)
        List<Employee> sortedEmployees = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary)
                        .reversed()
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println("Sorted Employees:\n" + sortedEmployees);

        // Task 2: Filter employees with salary >= 50,000
        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getSalary() >= 50000)
                .collect(Collectors.toList());
        System.out.println("Filtered Employees:\n" + filteredEmployees);

        // Task 3: Group employees by department
        Map<String, List<Employee>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees Grouped by Department:\n" + groupedByDepartment);

        // Task 4: Find employee with the highest salary
        Optional<Employee> highestSalaryEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));
        highestSalaryEmployee.ifPresent(emp -> System.out.println("Highest Salary Employee:\n" + emp));

        // Task 5: Check if any employee in "HR" department has salary > 70,000
        Optional<Employee> highPaidHREmployee = employees.stream()
                .filter(emp -> "HR".equals(emp.getDepartment()) && emp.getSalary() > 70000)
                .findFirst();
        highPaidHREmployee.ifPresent(emp -> System.out.println("HR Employee with Salary > 70,000:\n" + emp));
    }
}