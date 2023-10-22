package com.example.many_to_many_rel_com_atributo.model;

import javax.persistence.*;
import java.util.Set;

/*
* Baseado em: https://www.baeldung.com/jpa-many-to-many
* */
@Entity
public class Student {
    @Id
    Long id;
    @OneToMany(mappedBy = "student")
    Set<CourseRating> ratings;
}
