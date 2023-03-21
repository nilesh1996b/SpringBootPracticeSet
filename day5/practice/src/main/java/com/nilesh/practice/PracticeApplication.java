package com.nilesh.practice;

import com.nilesh.practice.dao.StudentDao;
import com.nilesh.practice.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao)
	{
		return runner ->{

			addStudentData(studentDao);

		};
	}

	private void addStudentData(StudentDao studentDao) {

		Student tempStudent = new Student("Nilesh","Bind","nilesh@123");

		studentDao.save(tempStudent);


	}

}
