package com.EducationSystem.Enrollement.Controllers;

import com.EducationSystem.Enrollement.Model.Course;
import com.EducationSystem.Enrollement.Services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@CrossOrigin(origins = "http://localhost:8001")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/listcourses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    @GetMapping("/getcourse/{courseCode}")
    public Course getCourseById(@PathVariable Integer courseCode) {
        return courseService.getCourseById(courseCode);
    }

    @PostMapping("/savecourse")
    public Course saveCourse(@RequestBody Course course) {
        return courseService.saveCourse(course);
    }

    @PostMapping("/updatecourse")
    public Course updateCourse(@RequestBody Course course) {
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/delete/{courseCode}")
    public String deleteCourse(@PathVariable Integer courseCode) {
        courseService.deleteCourse(courseCode);
        return "Successfully deleted";
    }
}
