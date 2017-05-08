package rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import blogexceptions.DuplicateUserException;
import blogexceptions.InvalidParameterException;

public class BlogExceptionMapper implements ExceptionMapper<Throwable> {

	public Response toResponse(Throwable t) {
		t.printStackTrace();
		if(t instanceof DuplicateUserException)
		{
			return Response.status(400).build();
		}
		else if(t instanceof InvalidParameterException)
		{
			return Response.status(401).build();
		}
		else
		{
			return Response.status(402).build();
		}
	}

}
