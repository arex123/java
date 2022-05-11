package CvsC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
For Hands On:
        Create a Custom Class (Student / Employee) with properties (name, address, dob, roll no emp id etc.)
        Implement equals and hashcode methods for your class.
        Use the class as a key in a HashMap and see how change in hashcode methods affects the use of custom class as a Map key.



        Implement compareTo method and write a comparator for your customized class.
        Try out having different implementations of compareTo method and comparators.
        Implement sorting according to the different compareTo and comparators.

*/

public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();
        students.add(new Student(28,"aditya"));
        students.add(new Student(13,"rohit"));
        students.add(new Student(2,"kunal"));
        students.add(new Student(5,"subham"));
        students.add(new Student(21,"ankit"));

        Collections.sort(students);

        students.forEach(System.out::println);


    }
}
