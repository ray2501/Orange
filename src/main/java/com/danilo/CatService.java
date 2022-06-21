package com.danilo;

import java.io.InputStream;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/cat")
public class CatService {

    private static Logger logger = LoggerFactory.getLogger(CatService.class);

    @GET
    @Produces("image/jpeg")
    public Response getPhoto() {
        logger.info("Cat: Orange is here.");

        InputStream imageIS = getClass().getResourceAsStream("/Orange.jpeg");
        return Response.ok(imageIS).build();
    }
}
