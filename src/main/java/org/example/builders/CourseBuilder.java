package org.example.builders;

import org.example.courses.Course;

public interface CourseBuilder {
    void buildTitle(String title);
    void buildDescription(String description);
    void buildContent(String content);
    void buildQuiz(String quiz);
    void buildExercises(String exercises);
    Course getCourse();
}

