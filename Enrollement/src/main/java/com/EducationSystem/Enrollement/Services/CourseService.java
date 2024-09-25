package com.EducationSystem.Enrollement.Services;

import com.EducationSystem.Enrollement.Model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    private List<Course> courses = new ArrayList<>();

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course getCourseById(Integer courseCode) {
        return courses.stream()
                .filter(course -> course.getCourseCode().equals(courseCode))
                .findFirst()
                .orElse(null);
    }

    public Course saveCourse(Course course) {
        courses.add(course);
        return course;
    }

    public Course updateCourse(Course course) {
        Optional<Course> existingCourse = courses.stream()
                .filter(c -> c.getCourseCode().equals(course.getCourseCode()))
                .findFirst();
        if (existingCourse.isPresent()) {
            courses.remove(existingCourse.get());
            courses.add(course);
        }
        return course;
    }

    public void deleteCourse(Integer courseCode) {
        courses.removeIf(course -> course.getCourseCode().equals(courseCode));
    }
}
