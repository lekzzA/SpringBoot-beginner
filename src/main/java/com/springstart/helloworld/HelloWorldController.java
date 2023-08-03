package com.springstart.helloworld;

import com.springstart.helloworld.model.Course;
import com.springstart.helloworld.service.CourseDetails;
import com.springstart.helloworld.service.CourseDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/first" + "/project")
public class HelloWorldController {

    @Autowired
    private CourseDetails courseDetails;

    @GetMapping
    public String helloWorld(){
        return "Hello World from Spring Boot";
    }

    @GetMapping("/goodbye")
    public String goodbye(){
        return "Goodbye from Spring";
    }

    @GetMapping("/home")
    public String welcome(){
        return "Welcome to Spring Boot";
    }

    @GetMapping("/student/details")
    public List<Course> getCoursesAll(){
        return this.courseDetails.getCourses();
    }
}
