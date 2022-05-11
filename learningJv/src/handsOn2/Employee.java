package handsOn2;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    String name;
    String address;
    String dob;
    int id;

    public Employee(String name, String address, String dob, int id) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.id = id;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, id);
    }

    public int compareTo(Employee o){
        return this.id - o.id;
    }
//
//    @Override
//    public int compareTo(Employee o) {
//        return this.id-o.id;
//    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + name + '\'' +
//                ", address='" + address + '\'' +
//                ", dob='" + dob + '\'' +
//                ", id=" + id +
//                '}';
//    }
}
