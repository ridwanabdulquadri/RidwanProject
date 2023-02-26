package StudentManagementSystem;

import StudentManagementSystem.School;
import StudentManagementSystem.Student;
import StudentManagementSystem.StudentData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student prospectiveStudent;
    private StudentData studentData;

    private School school;


    @BeforeEach
    void setUp() {
        prospectiveStudent = new Student();
        studentData = new StudentData();
        school = new School();
    }

    @Test
    void testThatStudentCanApply() {
        Student registeredStudent = school.apply(studentData);
        System.out.println(registeredStudent);
        System.out.println(prospectiveStudent.getFirstName());
        assertNotNull(registeredStudent);
    }

    @Test
    void testTheNumberOfRegisteredStudents() {
//        REGISTERED STUDENTS
//        CHECK THAT THE LIST OF STUDENTS HAS INCREASED TO ONE

        school.admitStudent(school.apply(studentData));
        school.admitStudent(school.apply(studentData));
        Student ab = school.apply(studentData);
        ab.setEmail("emen");
        school.admitStudent(ab);
        System.out.println(school.getEmail(ab));

        int studentSize = school.getTotalNumberOfRegisteredStudents();
        assertEquals(3, studentSize);


        }
}