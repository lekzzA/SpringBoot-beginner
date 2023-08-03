package com.springstart.helloworld.service;

import com.springstart.helloworld.model.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseDetailsImpl implements CourseDetails{
    List<Course> coursesList;
    public CourseDetailsImpl() {
    coursesList = new ArrayList<>();
    coursesList.add(new Course(1554, "Spring", 5));
    coursesList.add(new Course(1543, "JAVA", 121));
    }
    @Override
    public List<Course> getCourses() {
        return coursesList;
    }
}
