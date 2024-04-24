package Online_Grading_System;

public class Subject{
    private String code;
    private String name;
    private int credits;
    private Department department;

    public Subject(String code, String name, int credits, Department department) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }
}

