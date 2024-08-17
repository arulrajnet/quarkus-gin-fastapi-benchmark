package net.arulraj.github.controller;

import java.util.List;

import io.smallrye.common.annotation.NonBlocking;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import net.arulraj.github.model.User;

@Path("/user")
@NonBlocking
public class UserResource {

  @GET
  @Produces(MediaType.APPLICATION_JSON)
  @NonBlocking
  public Response list() {
    return Response.ok(List.of(new User("arul", "raj"), new User("john", "doe"))).build();
  }

}
