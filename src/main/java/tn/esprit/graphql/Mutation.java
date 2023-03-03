package tn.esprit.graphql;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

import tn.esprit.entities.Student;
import tn.esprit.repository.StudentRepos;

public class Mutation implements GraphQLRootResolver{
	private final StudentRepos str;
	public Mutation (StudentRepos str)
	{this.str=str;}
	
	public Student createStudent(String cin,String nompre,String email)
	{
		Student S=new Student(cin, nompre, email);
		if(str.addStudent(S))
			return S;
		return null;
	}
	
	public Student updateStudent(String cin, String nompre, String email) {
		Student s= new Student(cin,nompre,email);
		this.str.updStd(s);
		return s;
	}
	
	public Student deleteStudent(String cin) {
		  this.str.delStd(cin);
		  return null;
		}

}
