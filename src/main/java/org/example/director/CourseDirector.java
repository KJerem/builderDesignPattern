package org.example.director;

import org.example.builders.CourseBuilder;
import org.example.courses.Course;

public class CourseDirector {
    public Course constructCourse(CourseBuilder builder) {
        builder.buildTitle("Course Title");
        builder.buildDescription("Course Description");
        builder.buildContent("Course Content");
        builder.buildQuiz("Course Quiz");
        builder.buildExercises("Course Exercises");
        return builder.getCourse();
    }
}
