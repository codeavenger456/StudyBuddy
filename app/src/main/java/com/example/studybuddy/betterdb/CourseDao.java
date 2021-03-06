package com.example.studybuddy.betterdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface CourseDao {

    @Query("SELECT * FROM courses")
    List<Course> getAllCourses();

    @Query("SELECT * FROM courses WHERE name LIKE :course " )
    public Course getCoursefromName(String course);

    @Query("SELECT * FROM courses WHERE id= :id")
    public Course getCoursefromId(long id);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertCourse(Course course);

    @Delete
    void deleteCourse(Course course);

}
