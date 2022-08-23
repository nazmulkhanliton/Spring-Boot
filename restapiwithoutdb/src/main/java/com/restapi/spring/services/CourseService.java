package com.restapi.spring.services;

import java.util.List;

import com.restapi.spring.course.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourses(long courseId);

	public Course addCoruse(Course course);
	
	public Course updateCourse(Course course);

	public void deleteCourse(long parseLong);
	
}
