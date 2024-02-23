package org.example.builders;

import org.example.courses.Course;

public class OfflineCourseBuilder implements CourseBuilder {
    private Course course;

    public OfflineCourseBuilder() {
        this.course = new Course();
    }

    @Override
    public void buildTitle(String title) {
        course.setTitle(title);
    }

    @Override
    public void buildDescription(String description) {
        course.setDescription(description);
    }

    @Override
    public void buildContent(String content) {
        course.setContent(content);
    }

    @Override
    public void buildQuiz(String quiz) {
        // No quiz for offline courses
    }

    @Override
    public void buildExercises(String exercises) {
        // No exercises for offline courses
    }

    @Override
    public Course getCourse() {
        return course;
    }
}

