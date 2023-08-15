package com.example.many_to_many_rel_com_atributo.model;

import javax.persistence.*;

@Entity
public class CourseRating {
    @EmbeddedId
    CourseRatingKey id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id")
    Course course;

    int rating;
}
