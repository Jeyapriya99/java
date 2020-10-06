package com.day2;


public class Student {
	int studentNo;
	String firstName;
	String lastName;
	int age;
	char gender;
	float englishMark;
	float languageMark;
	String major;
	float average;
	
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public float getEnglishMark() {
		return englishMark;
	}
	public void setEnglishMark(float englishMark) {
		this.englishMark = englishMark;
	}
	public float getLanguageMark() {
		return languageMark;
	}
	public void setLanguageMark(float languageMark) {
		this.languageMark = languageMark;
	}

	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
public String getStudentDetails(Student student)
{
	System.out.println(" The student number is " +student.getStudentNo());
	System.out.println(" The student firt name is " +student.getFirstName());
	System.out.println(" The student last name is " +student.getLastName());
	System.out.println(" The student age is " +student.getAge());
	System.out.println(" The gender of the student is " +student.getGender());
	System.out.println(" The student's english mark is " +student.getEnglishMark());
	System.out.println(" The student's language mark is " +student.getLanguageMark());
	System.out.println(" The student's major is " +student.getMajor());
	return "got student details";
	
}
public String fetchFullName(Student student) {
	return student.firstName + student.lastName;
	
}
public int fetchAge(Student student) {
	return student.age;
}
public float totalMarks(Student student) {
	return student.englishMark + student.languageMark;
	
}
public float average(Student student) {
	float average = (student.englishMark + student.languageMark)/2;
	return average;
}
public char gender(Student student) {
	return 'F';
}

	

}
