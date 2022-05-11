package handsOn2;


/*

Create a Custom Class (Student / Employee) with properties (name, address, dob, roll no emp id etc.)
Implement equals and hashcode methods for your class.
Use the class as a key in a HashMap and see how change in hashcode methods affects the use of custom class as a Map key.



Implement compareTo method and write a comparator for your customized class.
Try out having different implementations of compareTo method and comparators.
Implement sorting according to the different compareTo and comparators.

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", "delhi", "05/03", 3);
        Student s2 = new Student("arjun", "delhi", "05/03", 15);
        Student s3 = new Student("karan", "delhi", "05/03", 90);
        Student s4 = new Student("Aditya", "delhi", "05/03", 3);
        Student s5 = new Student("kunal", "delhi", "05/03", 8);

//        System.out.println(s1.hashCode());
//        System.out.println(s4.hashCode());


        List<Employee> empset = new ArrayList<>();
        Employee e1 = new Employee("harsh", "delhi", "05/09", 75);
        Employee e2 = new Employee("kat", "america", "10/05", 445);
        Employee e3 = new Employee("ad", "up", "01/01", 8);
        Employee e4 = new Employee("dut", "haryana", "29/02", 4545);

        empset.add(e1);
        empset.add(e2);
        empset.add(e3);
        empset.add(e4);


        //if we want to sort employees using their id

        Collections.sort(empset);


        //if we want to sort dynamically
//        Collections.sort(empset,new comparatorSort());
//        Collections.sort(empset, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                if(o1.name.equals(o2.name))
//                    return o1.id - o2.id;
//                else
//                    return o1.name.compareTo(o2.name);
//            }
//        });

//        Collections.sort(empset, (o1, o2) ->
//                o1.name.compareTo(o2.name)
//        );


//        empset.forEach(System.out::println);
        empset.forEach(employee -> System.out.println(employee.id + " " + employee.name));

    }
}
//    static class comparatorSort implements Comparator<Employee>{
//
//        @Override
//        public int compare(Employee o1, Employee o2) {
//            if (o1.name.equals(o2.name)) {
//                return o1.id - o2.id;
//            }else
//                return o1.name.compareTo(o2.name);
//        }
//    }
