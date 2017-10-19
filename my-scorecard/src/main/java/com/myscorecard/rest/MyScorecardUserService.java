package com.myscorecard.rest;

import javax.ejb.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import java.util.Arrays;

import com.myscorecard.model.dto.Users;


@Singleton
@Path("/users")
@SuppressWarnings("javadoc")
@Produces(MediaType.APPLICATION_JSON)
public class MyScorecardUserService {
	
	@GET
    @Path("{id}")
	public String getUser(@PathParam("id") String id){
		return "Avinash is here";
	}

	@GET
	public Users getUsers(){
		String[] users = {"Avinash", "Archana", "Aryan"};
		Users usr = new Users();
		usr.init(Arrays.asList(users));
		return usr;
	}
	
	@POST
	public Response createUsers(){
		System.out.println("User has been Created");
		return Response.status(Response.Status.ACCEPTED).build();
	}
	
	@PUT
	public Response updateUsers(){
		System.out.println("User has been updated");
		return Response.status(Response.Status.ACCEPTED).build();
	}
}
