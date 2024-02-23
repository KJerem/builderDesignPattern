package org.example;

import org.example.builders.CourseBuilder;
import org.example.builders.OfflineCourseBuilder;
import org.example.builders.OnlineCourseBuilder;
import org.example.courses.Course;
import org.example.director.CourseDirector;

public class Main {
    public static void main(String[] args) {

        CourseDirector director = new CourseDirector();

        // Construire un cours en ligne
        CourseBuilder onlineCourseBuilder = new OnlineCourseBuilder();
        Course onlineCourse = director.constructCourse(onlineCourseBuilder);
        System.out.println("Online Course: " + onlineCourse);

        // Construire un cours hors ligne
        CourseBuilder offlineCourseBuilder = new OfflineCourseBuilder();
        Course offlineCourse = director.constructCourse(offlineCourseBuilder);
        System.out.println("Offline Course: " + offlineCourse);

    }
}