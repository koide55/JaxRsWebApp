package moe.lisp.jaxrswebapp.service;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import moe.lisp.jaxrswebaap.entity.Product;

@RequestScoped
public class ProductService {
    
    @PersistenceContext(unitName = "LispMoePU")
    private EntityManager em;

    @Transactional
    public void create(Product product) {
        System.out.println("em="+em+
                ", product="+product.getName()+", "+product.getPrice());
        em.persist(product);
    }
    
    public Product findByName(String name) {
        return (Product)em
                .createNativeQuery(
                 "db.PRODUCT.findOne({\"name\":\""+name+"\"})", Product.class)
               .getSingleResult();
    }
    
    public List<Product> findAll() { 
        /*
        return (List<Product>)em
                .createNativeQuery(
                "db.PRODUCT.find()", Product.class);
        */
        return (List<Product>)em
                .createQuery("Select x from Product x")
                .getResultList(); 
    }
}
