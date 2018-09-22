package com.myapp.repository;

import javax.ws.rs.core.Response;

import com.myapp.model.Employee;

public class EmployeeResponseTransformer {

	public Response populateResponse(){
		Employee employee=new Employee(1, "karuna","bhabua");
		System.out.println(employee);
		 Response response = Response.ok(employee).build();
	        return response;
		
	}


}
