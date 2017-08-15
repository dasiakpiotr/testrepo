package main.java.rest;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource2 {

	// @Inject
	// private Logger logger;

	@GET
	@Produces("text/plain")
	public String helloResource() {
		// logger.info("jhab");
		return "Hello! It's " + new Date();
	}
}
