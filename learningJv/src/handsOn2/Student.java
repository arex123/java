package handsOn2;

import java.util.Objects;

public class Student {
    String name;
    String address;
    String dob;
    int rollno;

    public Student(String name, String address, String dob, int rollno) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.rollno = rollno;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//
//        if(o==null) return false;
//
//        Student student = (Student) o;
//        return this.rollno== student.rollno;
//    }

    public boolean equals(Student o) {
        if (this == o) return true;

        if(o==null) return false;

        return this.rollno== o.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollno);
    }
}
