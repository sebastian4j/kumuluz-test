package com.sebastian.km;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Sebastian Avila A. <savila@waypoint.cl>
 */
@Path("/")
@ApplicationScoped
public class Recursos {
  @Inject
  private Servicio ssv;
  
  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public String kum1() {
    return ssv.ssv();
  }
}
