package CvsC;

public class Student implements Comparable<Student> {
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }


    public String toString(){
        return "Student{" + "marks=" + marks + ", name='" + name + '\''+'}';

    }


    @Override
    public int compareTo(Student o) {
//        if(this.marks>o.marks) return 1;
//        else if(this.marks < o.marks) return -1;
//        return 0;

        return this.marks - o.marks ;
    }
}
