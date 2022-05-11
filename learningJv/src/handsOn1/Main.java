package handsOn1;

/*
* Q:
*
* */
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(1,"Aditya");
        Student s2 = new Student(5,"kunal");
        Student s3 = new Student(1,"Aditya");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());


        Teacher t1 = new Teacher(115,"dhere");
        Teacher t2 = new Teacher(115,"dhere");

        System.out.println(t1.equals(t2));
    }
}
