package com.myapp.domain;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;


@Path("/")
public class EmployeeEndpoint {
	
	@GET
	@Path("/list")
	public Response getEmployees(){
		System.out.println("i reached here");
		return null;
	}

	
}
