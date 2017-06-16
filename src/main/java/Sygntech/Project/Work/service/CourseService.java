package Sygntech.Project.Work.service;

import java.util.List;

import Sygntech.Project.Work.model.Course;

public interface CourseService {
	Course findById(int id);

	Course findByName(String name);

	void saveCourse(Course course);

	void updateCourse(Course course);

	void deleteCourseById(int id);

	void deleteAllCourses();

	List<Course> findAllCourses();

	boolean isCourseExist(Course course);
}
