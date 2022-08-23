package com.restapi.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.spring.course.Course;
import com.restapi.spring.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	
	//Get the all course info
	@GetMapping("/courses")
	public List<Course> getCourse(){
		
	return this.courseService.getCourses();
	}
	
	//Get the specific Course or Search a course by Course ID
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable long courseId) {
		
		return this.courseService.getCourses(courseId);
	}
	
	//Post a Course
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		return this.courseService.addCoruse(course);
	}
	
	//Update course 
	@PutMapping("/course")
	public Course updateCourse(@RequestBody Course course) {
		return this.courseService.updateCourse(course);
	}
	
	//Delete Course
	@DeleteMapping("/course/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
		try {
			this.courseService.deleteCourse(Long.parseLong(courseId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
