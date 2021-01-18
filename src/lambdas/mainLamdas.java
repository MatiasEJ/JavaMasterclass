package lambdas;

import java.util.*;

public class mainLamdas {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("printing from lambdas");
            System.out.println("printing from lambdas: 2");
        }).start();
        
        Employee john = new Employee("juan", 30);
        Employee tim = new Employee("tim", 31);
        Employee jack = new Employee("jack", 34);
    
    
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
    
        Collections.sort(employees, new Comparator<Employee>(){
    
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        
        for (Employee employee : employees){
            System.out.println(employee.getName());
        }
    
    
        Collections.sort(employees,
                         (o1, o2) -> o2.getName().compareTo(o1.getName()));
    
        for (Employee employee : employees){
            System.out.println(employee.getName());
        }
    
    
    
        Collections.sort(employees,
                         Comparator.comparing(Employee::getName));
        
        
    }
}
