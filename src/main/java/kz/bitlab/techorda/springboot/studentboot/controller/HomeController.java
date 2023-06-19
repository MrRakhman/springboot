package kz.bitlab.techorda.springboot.studentboot.controller;


import kz.bitlab.techorda.springboot.studentboot.db.DBManager;
import kz.bitlab.techorda.springboot.studentboot.db.Student;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {
    @GetMapping(value = "/")
    public String indexPage(Model model){
        ArrayList<Student> studentsList = DBManager.getStudents();
        model.addAttribute("studentter", studentsList);
        return "table";
    }

    @PostMapping(value = "/add-student")
    public String addStudent(Student student, Model model){
        DBManager.addStudent(student);
        return "redirect:/";
    }

    @GetMapping(value = "/add-student")
    public String addStudentPage(Model model){
        return "index";
    }

}
