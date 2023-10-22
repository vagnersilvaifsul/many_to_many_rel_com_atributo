package com.example.many_to_many_rel_com_atributo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Course {
    @Id
    Long id;
    @OneToMany(mappedBy = "course")
    Set<CourseRating> ratings;
}
