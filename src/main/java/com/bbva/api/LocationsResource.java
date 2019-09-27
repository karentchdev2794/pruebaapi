package com.bbva.api;

import com.bbva.api.beans.Locations;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locations")
public interface LocationsResource {
  @GET
  @Produces("application/json")
  List<Locations> generatedMethod1();

  @Path("/bbva/{id}/")
  @GET
  @Produces("application/json")
  Response generatedMethod2(@PathParam("id") int id, @PathParam("id") int id);
}
