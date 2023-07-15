package com.example.SMS.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int userId;
    @Column(unique = true,nullable = false)
    private String userName;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(length = 500)
    private String summary;

    @OneToMany(mappedBy = "instructor", fetch = FetchType.EAGER)
    private Set<Course> coursesInstructed;

//    @ManyToMany(mappedBy = "students")
//    private Set<Course> coursesAttended;

}
