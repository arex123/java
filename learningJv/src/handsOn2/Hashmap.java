package handsOn2;

import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        Map<Employee,String> map = new HashMap<>();


        Employee e1 = new Employee("harsh", "delhi", "05/09", 75);
        Employee e2 = new Employee("kat", "america", "10/05", 445);
        Employee e3 = new Employee("ad", "up", "01/01", 8);
        Employee e4 = new Employee("harsh", "delhi", "05/09", 75);
        Employee e5 = new Employee("dut", "haryana", "29/02", 4545);

        map.put(e1,"funny");
        map.put(e2,"nice guy");
        map.put(e3,"bad guy");
        map.put(e4,"sincere");
        map.put(e5,"excellent");
//        empset.forEach(employee -> System.out.println(employee.name+" "+employee.id));

//        System.out.println(map.entrySet());
//        System.out.println(map.size());

        System.out.println(e1);

//        System.out.println(map.get(e2));
//        System.out.println(e2.hashCode());
//
//        System.out.println(map.contains(322360));

//        System.out.println(emp);
    }
}
