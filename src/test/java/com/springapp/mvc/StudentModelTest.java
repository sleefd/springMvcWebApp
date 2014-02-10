package com.springapp.mvc;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by _ashao2321919 on 14-1-5.
 */
public class StudentModelTest {

    private StudentModel studentModel = new StudentModel();

    @Test
    public void test_get_all_student_return_student_list() {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("studentTwo", 60));
        students.add(new Student("studentThree", 70));
        students.add(new Student("studentFour", 80));
        students.add(new Student("studentFive", 90));

        assertThat(studentModel.getAllStudent(), equalTo(students));
    }

    @Test
    public void test_get_qualified_students_return_qualified_list() {
        List<Student> qualifiedStudents = new ArrayList<Student>();
        qualifiedStudents.add(new Student("studentTwo", 60));
        qualifiedStudents.add(new Student("studentThree", 70));
        qualifiedStudents.add(new Student("studentFour", 80));
        qualifiedStudents.add(new Student("studentFive", 90));
        assertThat(studentModel.getPassedStudents(), is(qualifiedStudents));
    }

}
