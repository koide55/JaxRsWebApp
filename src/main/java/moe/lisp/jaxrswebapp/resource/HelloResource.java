/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp.jaxrswebapp.resource;

import javax.ws.rs.BeanParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import moe.lisp.jaxrswebaap.entity.HelloBean;

/**
 *
 * @author koide
 */
@Path("hello")
public class HelloResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getText(@BeanParam HelloBean bean) {
        return "Hello foo="+bean.foo+" boo="+bean.boo;
    }
}
