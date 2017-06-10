/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp.jaxrswebapp.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import moe.lisp.jaxrswebaap.entity.Person;

@Path("goodbye")
public class GoodbyeResource {
    @GET
    @Produces("text/plain")
    public String sayGoodbye(@QueryParam("name")Person name) {
        return "Good bye "+name.getName();
    }
}
