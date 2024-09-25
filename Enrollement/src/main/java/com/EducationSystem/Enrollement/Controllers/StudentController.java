package com.EducationSystem.Enrollement.Controllers;

import com.EducationSystem.Enrollement.Model.Student;
import com.EducationSystem.Enrollement.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "http://localhost:8001")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/liststudents")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable Integer studentId) {
        return studentService.getStudentById(studentId);
    }

    @PostMapping("/savestudent")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PostMapping("/updatestudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/deletestudent/{studentId}")
    public String deleteStudent(@PathVariable Integer studentId) {
        studentService.deleteStudent(studentId);
        return "Successfully deleted";
    }
}
