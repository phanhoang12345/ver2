
package kttk;

public class Student extends Person {
    private float gpa;
    private String major;

    public Student(String id, String fullName, String dateOfBirth, float gpa, String major) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + getId() + ", Name: " + getFullName() + ", Date of Birth: " + getDateOfBirth() +
                           ", GPA: " + gpa + ", Major: " + major);
    }
}