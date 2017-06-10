package moe.lisp.jaxrswebaap.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;
import org.eclipse.persistence.nosql.annotations.DataFormatType;
import org.eclipse.persistence.nosql.annotations.Field;
import org.eclipse.persistence.nosql.annotations.NoSql;




@XmlRootElement
@Entity
@NoSql(dataFormat = DataFormatType.MAPPED)
public class Product implements Serializable {

    @Id
    @GeneratedValue
    @Field(name="_id")
    private String id;
    
    @Field(name="price")
    private Double price;
    
    @Field(name="name")
    private String name;
    
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public Double getPrice() {
        return price;
    }
    
    public void setName(String value) {
        name = value;
    }
    
    public String getName() { return name; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
