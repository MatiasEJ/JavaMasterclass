package lambdas.interfacesAndPredicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class MainPredicates {
    public static void main(String[] args) {
        Employee john  = new Employee("juan carlos", 30);
        Employee tim   = new Employee("tim alberto", 31);
        Employee jack  = new Employee("jack rodriguez", 34);
        Employee carlo = new Employee("carlo Martinez", 21);
        Employee diego = new Employee("diego Maradona", 23);
        Employee marko = new Employee("marko Messi", 54);
        
        
        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(carlo);
        employees.add(diego);
        employees.add(marko);
        
        employees.forEach(employee -> {
            System.out.println(employee.getName() + " " + employee.getAge());
        });
        System.out.println("********* NOT LAMBDAS *********");
        for (Employee employee : employees) {
            if (employee.getAge() > 30) {
                System.out.println(employee.getAge() + " es menor a 30");
            }
        }
        
        
        System.out.println("********* PREDICATES *********");
        printEmpleyeesByAge(employees, "Employee Over 30",
                            employee -> employee.getAge() > 30);
        
        printEmpleyeesByAge(employees, "employees under 30",
                            employee -> employee.getAge() < 30);
        
        //PREDICATES with int
        IntPredicate greaterThan15 = i -> i > 15;
        IntPredicate lessThan100   = i -> i < 100;
        System.out.println("Predicates");
        System.out.println(greaterThan15.test(10));
        System.out.println(greaterThan15.and(lessThan100).test(50));
        
        System.out.println("********* SUPPLIER *********");
        
        
        Random            random         = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(1000));
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(randomSupplier.get());
        }
        
        employees.forEach(employee -> {
            System.out.println(employee.getName().substring(
                employee.getName().indexOf(' ') + 1));
            
        });
        
        
        System.out.println("********* FUNCTIONS *********");
        Function<Employee, String> getLastName = (employee ->
            employee
                .getName()
                .substring(employee.getName().indexOf(' ') + 0));
        
        String lastName = getLastName.apply(employees.get(1));
        System.out.println(lastName);
        
        Function<Employee, String> getFirstName = (employee ->
            employee.getName().substring(0, employee.getName().indexOf(' '))
        );
        System.out.println("******** random ***********");
        Random random1 = new Random();
        for (Employee employee : employees) {
            if (random1.nextBoolean()) {
                System.out.println(getAname(getFirstName, employee));
            } else {
                
                System.out.println(getAname(getLastName, employee));
            }
        }
        
        
        System.out.println("********* FUNCTIONS *********");
        Function<Employee, String> upperCase =
            employee -> employee.getName().toUpperCase();
        
        Function<String, String> firstName =
            name -> name.substring(0, name.indexOf(" "));
        
        Function chainedFunction = upperCase.andThen(firstName);
        Function channingFunction = firstName.compose(upperCase);
        
        System.out.println(channingFunction.apply(employees.get(1)));
        
        System.out.println(chainedFunction.apply(employees.get(0)));
        
        //BIFUNCTIONS
        BiFunction<String, Employee, String> concatAge =
            (String name, Employee employee) ->
                name.concat(" " + employee.getAge());
        String upperName = upperCase.apply(employees.get(0));
        System.out.println(concatAge.apply(upperName,employees.get(0)));

        

        
    }
    
    private static void printEmpleyeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition) {
        
        System.out.println(ageText);
        System.out.println("===============");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
    
    // Metodo que recibe una Funcion anonima, que cambia de comportamiento
    // segun la funcion que recibe.
    
    
    private static String getAname(Function<Employee, String> getName,
                                   Employee employee) {
        return getName.apply(employee);
        
    }
    
    
}
