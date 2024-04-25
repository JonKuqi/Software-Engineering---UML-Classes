package Online_Grading_System;

import java.util.ArrayList;
import java.util.List;

public abstract class User {

    protected int id;

    protected String firstName;

    protected String lastName;

    protected String email;

    public User(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
}


class Student extends User {

    private int sId;

    private ArrayList<Grade> grades;

    public Student(int id, String firstName, String lastName, String email, int sId) {
        super(id, firstName, lastName, email);
        this.sId= sId;
        this.grades = new ArrayList<>(0);
    }

    public int getsId() {
        return sId;
    }

    public void addGrade(Grade grade) {
        this.grades.add(grade);
    }

    public ArrayList<Grade> getGrades() {
        return this.grades;
    }
    public int getStudentId() {
        return this.sId;
    }


}





class Profesor extends User {

    private int pid;

    private List<Department> departments;

    public Profesor(int id, String firstName, String lastName, String email, int pid) {
        super(id, firstName, lastName, email);
        this.pid = pid;
       
    }

    public int getPid() {return pid;}
    public List<Department> getDepartments() {return departments;}
}


class Administrator extends User {

    private int adminId;

    public Administrator(int userId, String firstName, String lastName,String email, int adminId) {
        super(userId,firstName,lastName,email);
        this.adminId = adminId;

    }

    public void addUniversity(University university) {
             //...
    }

    public void addDepartment(University university, Department department) {
         //...
    }

    public void addSubject(Department department, Subject subject) {
        department.addSubject(subject);
    }

    public void getStudentGrades(Student student) {

    }

}
