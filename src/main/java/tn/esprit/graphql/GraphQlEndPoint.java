package tn.esprit.graphql;

import javax.servlet.annotation.WebServlet;

import com.coxautodev.graphql.tools.SchemaParser;

import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import tn.esprit.repository.StudentRepos;
@WebServlet(urlPatterns = "/graphql")
public class GraphQlEndPoint extends SimpleGraphQLServlet{
public GraphQlEndPoint()
	{super(buildSchema());}
	private static GraphQLSchema buildSchema()
	{StudentRepos str=new StudentRepos();
	return SchemaParser.newParser().file("schema.graphqls")
			.resolvers(new Query(str),new Mutation(str)).build().makeExecutableSchema();
	}
}
