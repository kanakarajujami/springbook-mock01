package com.nt.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Course;
import com.nt.entity.Student;
import com.nt.repository.CourseRepository;
import com.nt.repository.StudentRepository;

@Component
public class StudentCourseRunner implements CommandLineRunner {

	@Autowired
	  private StudentRepository studentRepository;
	  @Autowired
	  private CourseRepository courseRepository;
	  @Override
	  public void run(String... args) throws Exception {
		
		  //create course one
		   
		  Course course1=new Course();
		  course1.setTitle("java");
		  course1.setDescription("advance java");
		  
		  //create course two
		  
		  Course course2=new Course();
		  course2.setTitle("python");
		  course2.setDescription("framework Django");
		  
		  //save courses
		  Student student=new Student();
		    student.setName("kanakaraju");
		    student.setEmail("kanakaraju123@gmail.com");
		  
		    student.addCourse(course1);
		    student.addCourse(course2);
		    
	
		    studentRepository.save(student);
		  System.out.println("student and courses registered ");
		  

		    //Retrieve all courses a specific student is enrolled in.
		    
		     Optional<Student> opt=studentRepository.findById(1L);
		     
		     if(opt.isPresent()) {
		    	  Student student2=opt.get();
		    	  System.out.println("courses registered:"+student2.getName());
		    	  System.out.println(student2);
		    	  student2.getCourses().forEach(course->System.out.println("course title:"+course.getTitle()+" course description:"+course.getDescription()));
		     }else {
		    	 System.out.println("student id not found:"+1);
		     }
		
		     //Retrieve all students enrolled in a specific course.
		     
		     Optional<Course> opt2=courseRepository.findById(2L);
		     
		     if(opt.isPresent()) {
		    	 Course course=opt2.get();
		    	 System.out.println("students enrolled in course:"+course.getTitle());
		    	course.getStudents().forEach(stud->System.out.println("student name:"+stud.getName()+"student email: "+stud.getEmail()));  
		     }else {
		    	 System.out.println("course id not found:"+2);
		     }
	  }
}
