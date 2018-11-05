package com.sebastian.km;

import javax.enterprise.context.RequestScoped;


/**
 *
 * @author Sebastian Avila A. <savila@waypoint.cl>
 */
@RequestScoped
public class Servicio {
    public String ssv() {
      return "ssv";
    }
}
