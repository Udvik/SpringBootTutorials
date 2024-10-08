package com.luv2code;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.luv2code.cruddemo.dao.StudentDAO;
import com.luv2code.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner CommandLineRunner(StudentDAO studentDAO){
		return runner -> {
            //readStudent(studentDAO);

			//createStudent(studentDAO);

			//createMultipleStudents(studentDAO);

			//queryForStudents(studentDAO);

			//queryForStudentsByLastName(studentDAO);

			//updateStudent(studentDAO);

			deleteStudent(studentDAO);

		};
	}


	

	private void readStudent(StudentDAO studentDAO) {
		//create a new student object
		System.out.println("Creating new Studnet object");
		Student tempStudent = new Student("Daffy","Duck","daffy@luv2code.com");


		//save the student 
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		//display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("Saved student . Generated Id: "+theId);

		//retrieve student based on the id:primary key
		System.out.println("Retrieving Student with te given id: "+ theId);
        Student myStudent = studentDAO.findById(theId);
		//display the student
		System.out.println("Found the Student :"+myStudent);
	}

	private void createStudent(StudentDAO studentDAO) {
		
		//create the student object
		System.out.println("Creating the new student object");
		Student tempStudent = new Student("John","radison","john@luv2code.com");
		


		//save the student object
		System.out.println("Saving the student....");
		studentDAO.save(tempStudent);


		//display id of the saved student
		System.out.println("Saved student Generated id: "+ tempStudent.getId());
	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		//create multiple students

		System.out.println("Creating the new student object");
		Student tempStudent1 = new Student("John","Doe","john@luv2code.com");
		Student tempStudent2 = new Student("Mary","public","mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita","AppleBum","bonita@luv2code.com");
		//save th student objects

		System.out.println("Saving the students");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);

	}


    private void queryForStudents(StudentDAO studentDAO) {
        List<Student> theStudents = studentDAO.findAll();

		for(Student tempStudent : theStudents){
			System.out.println(tempStudent);
		}
    }

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		// get a list of students
		List<Student> theStudents = studentDAO.findByLastName("Public");

		// display list of students
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}

	private void updateStudent(StudentDAO studentDAO) {
		//get the student by id
		int studentId = 1;
		System.out.println("Getting the student with id " + studentId);
		Student theStudent = studentDAO.findById(studentId);

		//change the first name to scooby
		System.out.println("Changing the first name to Scooby...");
		theStudent.setFirstName("Scooby");

		//update the student
        studentDAO.updateStudent(theStudent);

		//display the updated student
		System.out.println("Student updated");
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int id = 3;//Deleting the student from the database having the id as 3
        System.out.println("Deleting the Student with id " + id);
		studentDAO.delete(id);
	}
}

