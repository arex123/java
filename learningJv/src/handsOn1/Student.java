package handsOn1;

import java.util.Objects;

public class Student implements methods {
    int roll; //class variable
    String name;

    public Student(int roll,String name) { //parameterized constructor
        this.roll = roll;
        this.name = name;
    }



//    public void sayHi(){
//        System.out.println("Hi "+name);
//    }

    public boolean equals(Student o) {
        if(o==this) return true;

        return o.roll==this.roll && o.name==this.name;

    }



    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }


}





























