package com.luv2code.cruddemo;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runner->{
//			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
		};
	}

	private void createMultipleStudent(StudentDAO studentDAO) {

		// Create Multiple Student
		System.out.println("Creating 3 Student object...");
		Student tempStudent1 = new Student("john","doe","john@123");
		Student tempStudent2 = new Student("mary","public","public@123");
		Student tempStudent3 = new Student("bonita","applebum","bonita@123");

		//save the Student object
		System.out.println("Saving the Students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3); 

	}

	private void createStudent(StudentDAO studentDAO) {

		// create the student object
		System.out.println("Creating new Student object...");
		Student tempStudent = new Student("paul","doe","nileshbing@123");

		// save the student object
		System.out.println("Saving the student ...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved Student. Generated id: " + tempStudent.getId());

	}

}
