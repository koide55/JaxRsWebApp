/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp.jaxrswebaap.entity;

import javax.ws.rs.QueryParam;

/**
 *
 * @author koide
 */
public class HelloBean {
    @QueryParam("foo")
    public String foo;
    @QueryParam("boo")
    public String boo;
}
