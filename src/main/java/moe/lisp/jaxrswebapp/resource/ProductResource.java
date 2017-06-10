/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp.jaxrswebapp.resource;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import moe.lisp.jaxrswebaap.entity.Product;
import moe.lisp.jaxrswebapp.service.ProductService;

@RequestScoped
@Path("product")
public class ProductResource {
    @Inject
    private ProductService productService;
    
    @Path("register")
    @POST
    @Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Product register(Product p) {
        productService.create(p);
        return p;
    }
    
    @Path("findByName")
    @GET
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML,
    MediaType.TEXT_PLAIN})
    public Product findByName(@QueryParam("name") String name) {
        return productService.findByName(name);
    }
}
