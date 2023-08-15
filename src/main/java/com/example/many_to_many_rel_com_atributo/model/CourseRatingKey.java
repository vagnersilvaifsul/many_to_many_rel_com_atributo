package com.example.many_to_many_rel_com_atributo.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseRatingKey implements Serializable {
    @Column(name = "student_id")
    Long studentId;
    @Column(name = "course_id")
    Long courseId;
}
