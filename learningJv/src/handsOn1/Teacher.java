package handsOn1;

public class Teacher implements methods {
    int id;
    String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }



    public boolean equals(Teacher o) {
        if(o==this)
            return true;

        return o.id==this.id && o.name==this.name;
    }


}
