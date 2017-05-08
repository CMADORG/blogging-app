package rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import api.User;
import service.UserManagementService;

@Path("/")
public class UserRestServices {
	
	UserManagementService ums = new UserManagementService();
	
	@POST
	@Path("/user")
	@Consumes(MediaType.APPLICATION_JSON)
	public  Response addUser(User user)
	{
		ums.addUser(user);
		return Response.ok().build();
		
	}
	

}
