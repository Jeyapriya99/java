package com.day2;


public class Main1 {

		public static void main(String[] args) {
			Student student = new Student();
			student.setStudentNo(13);
			student.setFirstName("Jeyapriya");
			student.setLastName("Kannan");
			student.setAge(21);
			student.setGender('F');
			student.setEnglishMark(90.31f);
			student.setLanguageMark(89.56f);
			student.setMajor("Electronics");
			System.out.println(student.getStudentDetails(student));
			System.out.println("The full name of the student is " +student.fetchFullName(student));
			System.out.println("The age of the student is " + student.fetchAge(student));
			System.out.println("The total marks of the student is " + student.totalMarks(student));
			System.out.println("The average of the marks is " + student.average(student));
			System.out.println("The gender of the student is " + student.gender(student));
		}

	}


