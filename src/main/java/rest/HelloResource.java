package main.java.rest;

import java.util.Date;
import java.util.Properties;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {

	// @Inject
	// private Logger logger;

	@GET
	@Produces("text/plain")
	public String helloResource() {

		Properties properties = new Properties();
		properties.put("password", "x");

		String a = "a";
		String b = "b";

		String c = "c";
		String d = "d";

		String e = "e";
		String f = "f";

		String g = "g";
		String h = "h";

		String i = "i";
		String j = "j";

		String k = "k";
		String m = "m";

		return "Hello! It's " + new Date();
	}
}
