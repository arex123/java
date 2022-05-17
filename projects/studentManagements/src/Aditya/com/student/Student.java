package Aditya.com.student;

public class Student {
    private int sid;
    private String sname;
    private String sPhone;
    private String scity;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getsPhone() {
        return sPhone;
    }

    public void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    public Student(int sid, String sname, String sPhone, String scity) {
        this.sid = sid;
        this.sname = sname;
        this.sPhone = sPhone;
        this.scity = scity;
    }

    public Student(String sname, String sPhone, String scity) {
        this.sname = sname;
        this.sPhone = sPhone;
        this.scity = scity;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sPhone='" + sPhone + '\'' +
                ", scity='" + scity + '\'' +
                '}';
    }
}
