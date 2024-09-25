package com.EducationSystem.Enrollement.Services;

import com.EducationSystem.Enrollement.Model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private List<Student> students = new ArrayList<>();

    public List<Student> getAllStudents() {
        return students;
    }

    public Student getStudentById(Integer studentId) {
        return students.stream()
                .filter(student -> student.getStudentId().equals(studentId))
                .findFirst()
                .orElse(null);
    }

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    public Student updateStudent(Student student) {
        Optional<Student> existingStudent = students.stream()
                .filter(s -> s.getStudentId().equals(student.getStudentId()))
                .findFirst();
        if (existingStudent.isPresent()) {
            students.remove(existingStudent.get());
            students.add(student);
        }
        return student;
    }

    public void deleteStudent(Integer studentId) {
        students.removeIf(student -> student.getStudentId().equals(studentId));
    }
}
