package com.springapp.mvc;

import org.junit.Test;
import org.springframework.ui.ModelMap;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by _ashao2321919 on 14-1-5.
 */
public class StudentControllerTest {
    @Test
    public void test_get_all_students() {
        ModelMap model = new ModelMap();

        String returnView = new StudentsController().getAllStudent(model);

        assertThat(returnView, is("students"));

        List<Student> students = new ArrayList<Student>();
        students.add(new Student("studentOne", 50));
        students.add(new Student("studentTwo", 60));
        students.add(new Student("studentThree", 70));
        students.add(new Student("studentFour", 80));
        students.add(new Student("studentFive", 90));

        List<Student> students1 = (List<Student>) model.get("students");

        assertThat(students1, equalTo(students));
    }
    
    @Test
    public void test_get_all_qualified_students(){
        ModelMap model = new ModelMap();

        String returnView = new StudentsController().getAllPassedStudents(model);

        assertThat(returnView , is("students"));


        List<Student> passedStudents = new ArrayList<Student>();
        passedStudents.add(new Student("studentTwo", 60));
        passedStudents.add(new Student("studentThree", 70));
        passedStudents.add(new Student("studentFour", 80));
        passedStudents.add(new Student("studentFive", 90));

        assertThat((List<Student>)model.get("passedStudents") , equalTo(passedStudents));
    }
}
