package com.nilesh.practice;

import com.nilesh.practice.dao.StudentDao;
import com.nilesh.practice.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao)
	{
		return runner->{
//			saveStudentDao(studentDao);
//			findStudentById(studentDao);
			findAllStudent(studentDao);
		};
	}

	private void findAllStudent(StudentDao studentDao) {

		List<Student> data = studentDao.getAllStudent("Bind");


		data.forEach(System.out::println);


	}

	private void findStudentById(StudentDao studentDao) {

		System.out.println(studentDao.getStudentById(1));

	}

	private void saveStudentDao(StudentDao studentDao) {

		Student tempStudent1 = new Student("Rajesh", "Yadav", "nilesh@123");
		Student tempStudent2 = new Student("Suresh", "Bind", "nilesh@123");
		Student tempStudent3 = new Student("Avinash", "Yadav", "nilesh@123");

		studentDao.save(tempStudent1);
		studentDao.save(tempStudent2);
		studentDao.save(tempStudent3);

		System.out.println("Data added");

	}

}
