package lambdas;

import java.util.ArrayList;
import java.util.List;

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

public class mainLamdas {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("printing from lambdas");
            System.out.println("printing from lambdas: 2");
        }).start();
        
        Employee john = new Employee("juan", 30);
        Employee tim  = new Employee("tim", 31);
        Employee jack = new Employee("jack", 34);
        
        
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        
//        Collections.sort(employees, new Comparator<Employee>() {
//
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
//
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }
//
//
//        Collections.sort(employees,
//                         (o1, o2) -> o2.getName().compareTo(o1.getName()));
//
//        for (Employee employee : employees) {
//            System.out.println(employee.getName());
//        }
//
//
//        Collections.sort(employees,
//                         Comparator.comparing(Employee::getName));
//
//
//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, employees.get(0).getName(), employees.get(1).getName());
//
//
//        UpperConcat upperConcat =
//            (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
//        String sillyString2 =
//            doStringStuff(upperConcat, employees.get(0).getName(),
//                          employees.get(1).getName());
//
//        String sillyString3 =
//            doStringStuff(upperConcat, employees.get(0).getName(),
//                          employees.get(1).getName());
//
//
//        System.out.println(sillyString2);
//
//
//        AnotherClass anotherClass = new AnotherClass();
//        String s = anotherClass.doSomething();
//        System.out.println(s);
//
        
    }
    
    public final static String doStringStuff(UpperConcat uc, String s1,
                                             String s2) {
        return uc.upperAndConcat(s1, s2);
        
    }
    
    
}

class Employee {
    private String name;
    private int    age;
    
    public Employee(String name, int age) {
        this.name = name;
        this.age  = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}


class AnotherClass{
    
    public String doSomething(){
        System.out.println("AnotherClass class name: "+getClass().getSimpleName());
        UpperConcat uc = (s1,s2) ->{
            System.out.println("lambda exp:"+getClass().getSimpleName());
            String result = s1.toLowerCase()+s2.toUpperCase();
            return result;
        };
       
        return mainLamdas.doStringStuff(uc,"String12","String32");
        
//        return mainLamdas.doStringStuff(new UpperConcat() {
//
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                System.out.println("Annonymous class name: "+getClass().getSimpleName());
//                return s1.toUpperCase()+s2.toUpperCase();
//            }
//        }, "String1","String2");
    }
}