package com.example.SMS.controller;

import com.example.SMS.entity.Course;
import com.example.SMS.entity.UserEntity;
import com.example.SMS.repos.CourseRepo;
import com.example.SMS.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseRepo repo;
    @Autowired
    UserRepo userRepo;
    @GetMapping("/info/{id}")
    public ResponseEntity<Course> getCourseInfo(@PathVariable int id){
        return new ResponseEntity<Course>( repo.getCourseByCourseId(id), HttpStatus.OK);
    }

    @GetMapping("/info/user/{id}")
    public ResponseEntity<UserEntity> getUserInfo(@PathVariable int id){
        UserEntity instructor = userRepo.getUserEntityByUserId(id);
        // Load the associated courses instructed by the instructor
        Set<Course> courses = instructor.getCoursesInstructed(); // Trigger loading of courses

        return new ResponseEntity<>(instructor, HttpStatus.OK);
    }

//    @GetMapping("/enrolledStudents/{id}")
//    public ResponseEntity<Set<UserEntity>> enrolledStudents(@PathVariable int id){
//        return ResponseEntity<Set<UserEntity>>(new HashSet<UserEntity>(), HttpStatus.OK);
////        return new ResponseEntity<>( repo.findStudentsByCourseId(id), HttpStatus.OK);
//    }

}
