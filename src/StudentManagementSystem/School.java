package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> studentList = new ArrayList<>();

    public void admitStudent(Student student){
        studentList.add(student);
    }

    public int getTotalNumberOfRegisteredStudents() {
        return studentList.size();
    }
    public Student apply(StudentData studentData) {
        Student student = new Student();
        School school = new School();
        student.setFirstName(studentData.getFirstName());
        student.setLastName(studentData.getLastName());
//        student.id
        student.setEmail(studentData.getEmail());
        school.admitStudent(student);
        System.out.println(student);
        return student;
    }
    public String getEmail(Student student){
        return student.getEmail();
        }
}