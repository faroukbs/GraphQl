package tn.esprit.repository;

import java.util.ArrayList;
import java.util.List;

import tn.esprit.entities.Student;

public class StudentRepos {
	private final List<Student> students;
	public StudentRepos()
	{
		students=new ArrayList<Student>();
		students.add(new Student
				("123", "ben foulen", "benfoulen@gmail.com"));
		students.add(new Student
				("145", "Ahmed ben saleh", "bensaleh@gmail.com"));
		students.add(new Student
				("20", "farouk boussaid", "farouk.boussaid@esprit.tn"));
	}
	
	
	
	//lis of all student
	public List<Student> getAllStudent()
	{return students;}
	
	
	//specific student 
	public Student getStdByCin(String cin)
	{
		for (Student S:students)
		{
			if (S.getCin().equals(cin))
				return S;
		}
		return null;
		}
	
	//add student
	public boolean addStudent(Student S) {
		return students.add(S);}
	
	
	//update student
	public void updStd(Student s) {
		int i = students.indexOf(s);
		if(i!=-1) {
			this.students.set(i, s);
		}
	}
	
	//delete student
	public void delStd(String cin) {
		Student s = this.getStdByCin(cin);
		this.students.remove(s);
	}
	
	
	
}
