package pojo;

/*
https://www.tutorialspoint.com/hibernate/hibernate_persistent_classes.htm

Java classes whose objects or instances will be stored in database tables are called persistent classes in Hibernate*/

public class Student {
    private int roll;
    private String name;
    private float cgpa;

    private String college;

    public Student() {
    }

    public Student(int roll, String name, float cgpa, String college) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
        this.college = college;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
