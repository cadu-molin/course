package com.educandoweb.course.entities;

import com.educandoweb.course.entities.pk.OrderItemPk;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {

    @EmbeddedId
    private OrderItemPk id;

    private Integer quantity;
    private Double priece;

    public OrderItem() {
    }

    public OrderItem(Order order, Product product, Integer quantity, Double priece) {
        this.id.setOrder(order);
        this.id.setProduct(product);
        this.quantity = quantity;
        this.priece = priece;
    }

    public Order getOrder() {
        return id.getOrder();
    }

    public void setOrder(Order order) {
        this.id.setOrder(order);
    }

    public Product getProduct() {
        return id.getProduct();
    }

    public void setProduct(Product product) {
        this.id.setProduct(product);
    }



    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPriece() {
        return priece;
    }

    public void setPriece(Double priece) {
        this.priece = priece;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderItem orderItem = (OrderItem) o;
        return Objects.equals(id, orderItem.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
