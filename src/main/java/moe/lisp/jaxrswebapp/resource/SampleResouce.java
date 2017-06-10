/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp.jaxrswebapp.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author koide
 */
@Path("sample")
public class SampleResouce {
    @GET
    public String sample() {
        return "Sample Resource";
    }
    
    @GET
    @Path("increment")
    public String inc(@QueryParam("value") String value) {
        Integer v = Integer.parseInt(value);
        v++;
        return "inc value="+v;
    }
}
