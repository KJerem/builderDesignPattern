package org.example.builders;

import org.example.courses.Course;

public class OnlineCourseBuilder implements CourseBuilder {
    private Course course;

    public OnlineCourseBuilder() {
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
        course.setQuiz(quiz);
    }

    @Override
    public void buildExercises(String exercises) {
        course.setExercises(exercises);
    }

    @Override
    public Course getCourse() {
        return course;
    }
}

