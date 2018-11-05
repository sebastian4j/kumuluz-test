package com.sebastian.km;

import javax.inject.Inject;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Sebastian Avila A. <savila@waypoint.cl>
 */
public class ServicioTest extends KumSrv {

  @Inject
  private Servicio ssv;

  @Test
  public void injectTest() {
    Assert.assertNotNull(ssv);
    Assert.assertEquals("ssv", ssv.ssv());
  }
}
