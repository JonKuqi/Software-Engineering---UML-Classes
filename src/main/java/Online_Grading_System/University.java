package Online_Grading_System;

import java.util.ArrayList;
import java.util.List;

public class University {

    private int id;
    private String name;
    private ArrayList<Department> departments;

    public University(int id, String name) {
        this.id = id;
        this.name = name;
        this.departments = new ArrayList<Department>(0);
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
    private ArrayList<Student> students;
    private ArrayList<Profesor> profesors;


    public Department(int id, String name) {
        this.id = id;
        this.name = name;
        this.subjects = new ArrayList<>(0);
        this.profesors = new ArrayList<>(0);
        this.students = new ArrayList<>(0);
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
    public void addStudent(Student student){
        this.students.add(student);
    }
    public void addProfesor(Profesor profesor){
        this.profesors.add(profesor);
    }


    public Student findStudentById(int id) {
        for(int i=0;i<this.students.size();i++){
            if(id == this.students.get(i).getId()){
                return this.students.get(i);
            }
        }
        return null;
    }
}
