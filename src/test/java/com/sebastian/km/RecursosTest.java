package com.sebastian.km;

import org.junit.Test;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.is;
import org.jboss.arquillian.container.test.api.RunAsClient;

/**
 *
 * @author Sebastian Avila A. <savila@waypoint.cl>
 */
public class RecursosTest extends KumSrv {
  @Test
  @RunAsClient
  public void resourceTest() {
    when().get("/").then().statusCode(200).and().body(is("ssv"));
  }
}
