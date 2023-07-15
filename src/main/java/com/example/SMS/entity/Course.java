package com.example.SMS.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Course {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private int courseId;

    @Column(name = "course_name", nullable = false)
    private String courseName;

    @Column(length = 500, name = "course_description")
    private String courseDescription;
    @ManyToOne(targetEntity = UserEntity.class)
    @JoinColumn(name = "instructor_id",referencedColumnName = "user_id", nullable = false)
    private UserEntity instructor;

//    @ManyToMany
//    @JoinTable(
//           name = "course_student",
//            joinColumns = {
//                    @JoinColumn(name = "course_id", referencedColumnName = "course_id")
//    },
//    inverseJoinColumns = {
//            @JoinColumn(name = "student_id",referencedColumnName = "user_id")
//
//    }
//    )
//    private Set<UserEntity> students;
}