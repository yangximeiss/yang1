package cuz.yang.controller;

import com.google.gson.Gson;
import cuz.yang.mapper.StudentMapper;
import cuz.yang.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;
    private Gson gson = new Gson();

    @GetMapping("/student")
    public String getStudentList() {
        List<Student> studentList = studentMapper.selectList(null);
        return gson.toJson(studentList);
    }



}
