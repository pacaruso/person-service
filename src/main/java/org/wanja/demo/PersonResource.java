package org.wanja.demo;

import io.quarkus.panache.common.Sort;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {
    @GET
    public List<Person> getAll() throws Exception {
        //return Person.findAll(Sort.ascending("last_name")).list(); }
        return Person.findAll().list(); }
}
