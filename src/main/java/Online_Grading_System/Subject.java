package Online_Grading_System;

import java.util.ArrayList;

public class Subject {

    private String code;
    private String name;
    private int credits;
    private ArrayList<Department> departments;
    private ArrayList<SubjectOffering> offerings;

    public Subject(String code, String name, int credits) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.departments = new ArrayList<>(0);
        this.offerings = new ArrayList<>(0);
    }

    public void addDepartment(Department department) {
       this.departments.add(department);
    }
    public void addOffering(SubjectOffering offering) {
        this.offerings.add(offering);
    }
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public int getCredits() {
        return credits;
    }
    public ArrayList<Department> getDepartments() {
        return departments;
    }
    public ArrayList<SubjectOffering> getOfferings() {
        return offerings;
    }

    public String getSubjectName() {
        return this.name;
    }
}

class Grade {
    private Student student;
    private SubjectOffering subjectOffering;
    private int score;

    public Grade(Student student, SubjectOffering subjectOffering, int score) {
        this.student = student;
        this.subjectOffering = subjectOffering;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }
    public SubjectOffering getSubjectOffering() {
        return subjectOffering;
    }
    public int getScore() {
        return score;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public void setSubjectOffering(SubjectOffering subjectOffering) {
        this.subjectOffering = subjectOffering;
    }
    public void setScore(int score) {
        this.score = score;
    }
}


class SubjectOffering {

    private Subject subject;

    private int yearOfStudy;

    private Profesor profesor;

    private ArrayList<Student> registeredStudents;
    private ArrayList<Grade> grades;

    public SubjectOffering(Subject subject, int yearOfStudy, Profesor profesor) {
        this.subject = subject;
        this.yearOfStudy = yearOfStudy;
        this.profesor = profesor;
        this.registeredStudents = new ArrayList<>(0);
        this.grades = new ArrayList<>(0);
    }

    public void recordGrade(Grade grade) {
        grades.add(grade);
    }

    public ArrayList<Grade> getGrades() {
        return grades;
    }

    public void registerStudent(Student student) {
        this.registeredStudents.add(student);
    }
    //getters dhe setter
    public Subject getSubject() {
        return subject;
    }
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public int getYearOfStudy() {
        return yearOfStudy;
    }
    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    public ArrayList<Student> getRegisteredStudents() {
        return registeredStudents;
    }
    public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    public Profesor getProfessor() {
        return this.profesor;
    }
}
