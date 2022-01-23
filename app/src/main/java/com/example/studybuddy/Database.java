package com.example.studybuddy;

import androidx.room.RoomDatabase;

import com.example.studybuddy.betterdb.Course;
import com.example.studybuddy.betterdb.CourseDao;
import com.example.studybuddy.betterdb.CoursesWithStudentsDao;
import com.example.studybuddy.betterdb.EnrolledCourses;
import com.example.studybuddy.betterdb.Student;
import com.example.studybuddy.betterdb.StudentDao;

@androidx.room.Database(entities = {Course.class, Student.class, EnrolledCourses.class}, version = 1)
public abstract class Database extends RoomDatabase {


    public abstract CourseDao getCourseDao();

    public abstract StudentDao getStudentDao();

    public abstract CoursesWithStudentsDao getCoursesWithStudentsDao();


    //public abstract EventDao geteventDao();


}