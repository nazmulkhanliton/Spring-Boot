package com.restapi.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.restapi.spring.course.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> list;
	
	public CourseServiceImpl() {
		list = new ArrayList<>();
		System.out.println("in CourseServiceImpl Constructor");
		list.add(new Course(150, "Java Course", "for Java Programmer"));
		list.add(new Course(151, "Python Course", "for ML Students"));
		list.add(new Course(152, "SPL Course", "for CSE Students"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourses(long courseId) {
		
		Course c = null;
		for(Course course:list) {
			if(courseId == course.getId())
				c= course;
		}
		return c;
	}

	@Override
	public Course addCoruse(Course course) {
		list.add(course);
		return course;
	}
	
	public Course updateCourse(Course course) {
		
		list.forEach(e ->{
			if(e.getId() == course.getId()) {
				e.setTitle(course.getTitle());
				e.setDescription(course.getDescription());
			}
		});
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		list = this.list.stream().filter(e->e.getId() != parseLong).collect(Collectors.toList());
	}

}
