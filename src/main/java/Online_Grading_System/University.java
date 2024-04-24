package Online_Grading_System;

import java.util.ArrayList;

public class University {
     private int id;
     private String name;
     private ArrayList<Department> departments;

    public University(int id, String name) {
        this.id = id;
        this.name = name;
        departments = new ArrayList<>(0);
    }

    public void addDepartment(Department department){this.departments.add(department);}

    public int getId() {return id;}
    public String getName() {return name;}
    public ArrayList<Department> getDepartments() {return departments;}
}




class Department {
    private int id;
    private String name;
    private ArrayList<Subject> subjects;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
        this.subjects = new ArrayList<>(0);
    }

    public void addCourse(Subject subject) {subjects.add(subject);}
    public int getId() {return id;}
    public String getName() {return name;}
}

