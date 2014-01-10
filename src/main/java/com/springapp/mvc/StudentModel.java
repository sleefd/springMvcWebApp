package com.springapp.mvc;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.FluentIterable.from;
import static com.google.common.collect.Iterables.filter;

/**
 * Created by _ashao2321919 on 14-1-5.
 */
public class StudentModel {
    private List<Student> students;

    public StudentModel() {
        students = new ArrayList<Student>();
        students.add(new Student("studentOne", 50));
        students.add(new Student("studentTwo", 60));
        students.add(new Student("studentThree", 70));
        students.add(new Student("studentFour", 80));
        students.add(new Student("studentFive", 90));
    }

    public List<Student> getAllStudent() {
        return students;
    }

    public List<Student> getPassedStudents() {
        List<Student> passedStudents = from(students).filter(getQualifiedPredicate()).toList();
        return passedStudents;
    }

    private Predicate<Student> getQualifiedPredicate() {
        return new Predicate<Student>() {
            @Override
            public boolean apply(Student student) {

                return student.getScore() >= 60;
            }
        };
    }
}
