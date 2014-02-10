package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by _ashao2321919 on 14-1-5.
 */
@Controller
public class StudentsController {


    private final StudentModel studentModel;

    public StudentsController(StudentModel studentModel) {
        this.studentModel = studentModel;
    }

    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public String getAllStudent(ModelMap model) {
        model.addAttribute("students", studentModel.getAllStudent());
        return "students";
    }

    @RequestMapping(value = "/passedStudents", method = RequestMethod.GET)
    public String getAllPassedStudents(ModelMap model) {
        model.addAttribute("students", studentModel.getPassedStudents());
        return "students";
    }
}
