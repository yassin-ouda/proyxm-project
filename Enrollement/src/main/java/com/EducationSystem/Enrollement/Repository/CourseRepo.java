package com.EducationSystem.Enrollement.Repository;

import com.EducationSystem.Enrollement.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
}
