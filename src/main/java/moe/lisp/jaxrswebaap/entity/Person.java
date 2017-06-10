/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp.jaxrswebaap.entity;

/**
 *
 * @author koide
 */
public final class Person {
    private String name;
    public static Person valueOf(String v) { return new Person(v); }
    private Person(String v) { setName(v); }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
