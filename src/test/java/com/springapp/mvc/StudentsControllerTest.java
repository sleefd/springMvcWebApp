package com.springapp.mvc;

import org.hamcrest.Matcher;
import org.hamcrest.core.IsAnything;
import org.hamcrest.core.IsNull;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by slee on 14-1-5.
 */
public class StudentsControllerTest {

    private StudentModel mockedStudentModel;

    @Before
    public void setUp() throws Exception {
        mockedStudentModel = mock(StudentModel.class);
    }

    @Test
    public void test_get_all_students() {
        ModelMap model = new ModelMap();
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("studentOne", 50));
        students.add(new Student("studentTwo", 60));
        students.add(new Student("studentThree", 70));
        students.add(new Student("studentFour", 80));
        students.add(new Student("studentFive", 90));
        when(mockedStudentModel.getAllStudent()).thenReturn(students);

        String returnView = new StudentsController(mockedStudentModel).getAllStudent(model);

        assertThat(returnView, is("students"));

        List<Student> students1 = (List<Student>) model.get("students");

        assertThat(students1, equalTo(students));
    }


    @Test
    public void test_get_all_qualified_students() {
        ModelMap model = new ModelMap();
        List<Student> passedStudents = new ArrayList<Student>();
        passedStudents.add(new Student("studentTwo", 60));
        passedStudents.add(new Student("studentThree", 70));
        passedStudents.add(new Student("studentFour", 80));
        passedStudents.add(new Student("studentFive", 90));
        when(mockedStudentModel.getPassedStudents()).thenReturn(passedStudents);

        String returnView = new StudentsController(mockedStudentModel).getAllPassedStudents(model);

        assertThat(returnView, is("students"));
        assertThat((List<Student>) model.get("students"), is(passedStudents));
    }
}
