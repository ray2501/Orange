package com.danilo;

import jakarta.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatServiceTest extends JerseyTest {
    @Override
    public ResourceConfig configure() {
        return new ResourceConfig()
                .register(CatService.class);
    }

    @Test
    public void testGet() {
        Response response = target().path("cat").request().get(Response.class);

        assertEquals(200, response.getStatus());
    }
}
