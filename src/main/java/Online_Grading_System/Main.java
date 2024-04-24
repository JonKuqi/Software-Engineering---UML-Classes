package Online_Grading_System;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      University fiek = new University(1,"FIEK");

      Department kompjuterika = new Department(1,"Kompjuterika");
      Department ear = new Department(2,"Ear");



      Subject softwareEngineering = new Subject("ABCD","Inxhinieri Softuerike",5);
      Subject dataSecurity = new Subject("DCBA", "Siguri te Dhenave",5);

      kompjuterika.addSubject(softwareEngineering);
      kompjuterika.addSubject(dataSecurity);


        fiek.addDepartment(kompjuterika);
        fiek.addDepartment(ear);

      User student1 = new Student(10,"Filan","Fisteku","filan.fisteku@student.uni-pr.edu",22075610);



      User profesorIS = new Profesor(1,"Prof i ","IS","prof@uni-pr.edu",1000);
      User profesorSDH = new Profesor(2,"Prof i ","SDH","prof@uni-pr.edu",1001);

      SubjectOffering subjectOfferingIS = new SubjectOffering(softwareEngineering, 2024, (Profesor)profesorIS);
      SubjectOffering subjectOfferingSDH = new SubjectOffering(dataSecurity,2024,(Profesor)profesorSDH);



      Grade grade1 = new Grade((Student)student1,subjectOfferingIS,10);
      Grade grade2 = new Grade((Student)student1,subjectOfferingSDH,10);

      subjectOfferingIS.recordGrade(grade1);
      subjectOfferingSDH.recordGrade(grade2);




        for (Grade grade : subjectOfferingIS.getGrades()) {
            Student student = grade.getStudent();
            student.addGrade(grade);
        }
        for (Grade grade : subjectOfferingSDH.getGrades()) {
            Student student = grade.getStudent();
            student.addGrade(grade);
        }


        kompjuterika.addStudent((Student)student1);

        // Me ane te scannerit
        Scanner scanner = new Scanner(System.in);
        System.out.print("Shkruaj Id te studentit: ");
        int studentId = scanner.nextInt();

        Student studentiNgaDepartmenti = kompjuterika.findStudentById(studentId);

        if (studentiNgaDepartmenti != null) {
            System.out.println("Studenti: " + studentiNgaDepartmenti.getFirstName() + " " + studentiNgaDepartmenti.getLastName());
            System.out.println("Student ID: " + studentiNgaDepartmenti.getStudentId());
            System.out.println("Grades:");

            for (Grade grade : studentiNgaDepartmenti.getGrades()) {
                SubjectOffering offering = grade.getSubjectOffering();
                Subject subject = offering.getSubject();
                Profesor professor = offering.getProfessor();

                System.out.println("Subjekti: " + subject.getSubjectName());
                System.out.println("Profesori: " + professor.getFirstName() + " " + professor.getLastName());
                System.out.println("Nota: " + grade.getScore());
                System.out.println("-----");
            }
        } else {
            System.out.println("Student not found with ID: " + studentiNgaDepartmenti);
        }

        // Close the scanner
        scanner.close();
    }



}


