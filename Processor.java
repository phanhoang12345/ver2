
package kttk;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Them moi student");
            System.out.println("2. Cap nhat student boi id");
            System.out.println("3. Xoa student boi id");
            System.out.println("4. Hien thi tat ca sinh vien");
            System.out.println("5. Tim sinh vien co điem GPA cao nhat");
            System.out.println("6. Hien thi sinh vien co hoc bong");
            System.out.println("7. Hien thi tong hoc phi cua tat ca sinh vien");
            System.out.println("8. Thoat");
            System.out.print("Lua chon: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Nhap ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Nhap ho ten: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Nhap GPA: ");
                    float gpa = scanner.nextFloat();
                    scanner.nextLine(); 
                    System.out.print("Nhap chuyen nganh: ");
                    String major = scanner.nextLine();
                    studentList.addStudent(new Student(id, fullName, new Date(), gpa, major));
                    break;

                case 2: 
                    System.out.print("Nhap ID sinh vien can cap nhat: ");
                    id = scanner.nextLine();
                    Student student = studentList.findStudentById(id);
                    if (student != null) {
                        System.out.print("Nhap GPA moi: ");
                        gpa = scanner.nextFloat();
                        student.setGpa(gpa);
                        System.out.print("Nhap chuyen nganh moi: ");
                        scanner.nextLine(); 
                        major = scanner.nextLine();
                        student.setMajor(major);
                    } else {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;

                case 3: 
                    System.out.print("Nhap ID sinh vien can xoa: ");
                    id = scanner.nextLine();
                    studentList.deleteStudentById(id);
                    break;

                case 4: 
                    studentList.displayAllStudents();
                    break;
        case 5: 
                    Student topStudent = studentList.findTopStudent();
                    if (topStudent != null) {
                        System.out.println("Sinh vien co GPA cao nhat:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("Khong co sinh vien nao.");
                    }
                    break;

                case 6: 
                    ArrayList<Student> scholarshipStudents = studentList.findScholarshipStudents();
                    if (!scholarshipStudents.isEmpty()) {
                        System.out.println("Sinh viên có học bổng:");
                        for (Student s : scholarshipStudents) {
                            s.displayInfo();
                        }
                    
                    }
                    break;

                case 7: 
                    double totalTuition = studentList.calculateTuitionOfAllStudents();
                    System.out.println("Tong hoc phi cua tat ca sinh vien: " + totalTuition);
                    break;

                case 8: 
                    System.out.println("Thoat chuong trinh.");
                    return;

                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        }
    }
}
