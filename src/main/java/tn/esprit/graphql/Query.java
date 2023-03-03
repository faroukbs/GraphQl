package tn.esprit.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import tn.esprit.entities.Student;
import tn.esprit.repository.StudentRepos;

public class Query implements GraphQLRootResolver {
	private final StudentRepos str;
	public Query(StudentRepos str)
	{this.str=str;}
	public List<Student> allStudents()
	{return str.getAllStudent();}
	
	

	public Student getStudentbycin(String cin)
	{
		for (Student S:str.getAllStudent()){
			if (S.getCin().equals(cin))
				return S;
		}
		return null;
	}

}
