package com.example.SMS.repos;

import com.example.SMS.entity.Course;
import com.example.SMS.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;
@Repository
public interface CourseRepo extends CrudRepository<Course, Integer> {
//    @Modifying
//    @Transactional
//    @Query("UPDATE Course c SET c.students = :user WHERE c.courseId = :courseId")
//    void addUserToCourse(@Param("user") UserEntity user, @Param("courseId") int courseId);

    Course getCourseByCourseId(int id);
//    Set<UserEntity> findStudentsByCourseId(int courseId);

}
