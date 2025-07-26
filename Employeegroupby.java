package streamCoding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employeegroupby {
	int empId;
    String name;
    int deptId;
    public Employeegroupby(int empId, String name, int deptId) {
        this.empId = empId;
        this.name = name;
        this.deptId = deptId;
    }
    public int getDeptId() {
        return deptId;
    }
    @Override
    public String toString() {
        return "Employee{" + "empId=" + empId + ", name='" + name + '\'' + ", deptId=" + deptId + '}';
    }
	public static void main(String[] args) {
		
		        List<Employeegroupby> employees = Arrays.asList(
		                new Employeegroupby(101, "John", 1),
		                new Employeegroupby(102, "Jane", 1),
		                new Employeegroupby(103, "Doe", 2),
		                new Employeegroupby(104, "Mark", 1),
		                new Employeegroupby(105, "Alice", 2)
		        );
	//	Map<Integer, Long> depcount= 
				employees.stream()
						.collect(Collectors.groupingBy(Employeegroupby::getDeptId, Collectors.counting()))
						.forEach((a, b) -> System.out.println("DeptId:" + a + " " + "EmployeCount:" + b));
				//	depcount.forEach((a,b)->System.out.println("DeptId:"+ a +" "+ "EmployeCount:" + b));
	
		        
	}

}
