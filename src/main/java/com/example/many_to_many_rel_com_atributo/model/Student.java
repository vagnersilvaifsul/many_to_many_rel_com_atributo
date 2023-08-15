package com.example.many_to_many_rel_com_atributo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/*
* Baseado em: https://www.baeldung.com/jpa-many-to-many
* */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    Long id;
    @OneToMany(mappedBy = "student")
    Set<CourseRating> ratings;
}
