package io.prochyra;

public class CourseSession {

    private final String department;
    private final String number;
    private int numberOfStudents = 0;

    public CourseSession(String department, String number) {
        this.department = department;
        this.number = number;
    }

    public String getDepartment() {
        return department;
    }

    public String getNumber() {
        return number;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void enroll(Student student) {
        numberOfStudents++;
    }
}   
