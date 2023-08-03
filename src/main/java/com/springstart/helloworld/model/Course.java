package com.springstart.helloworld.model;

public class Course {
    private int courseNumber;
    private String courseName;
    private int courseHours;
    public Course(int courseNumber, String courseName, int courseHours){
        super();
        this.courseHours = courseHours;
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseHours() {
        return courseHours;
    }

    public void setCourseHours(int courseHours) {
        this.courseHours = courseHours;
    }

    @Override
    public String toString(){
        return "Course [" + courseNumber + " - " + courseName+ " (" + courseHours + ")]";
    }
}
