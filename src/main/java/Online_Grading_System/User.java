package Online_Grading_System;

public abstract class User {
    protected String id;
    protected String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public int method(){
        return 10;
    }

}



class Student extends User{
    private int studentId;

    public Student(String id, String name, int studentId) {
        super(id, name);
        this.studentId = studentId;
    }
}

class Professor extends User{
    //Departamenti
    public Professor(String id, String name) {
        super(id, name);
    }
}

class Administrator extends User{
    public Administrator(String id, String name) {
        super(id, name);
    }
}

