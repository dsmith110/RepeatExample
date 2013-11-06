/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleExample;

import java.math.BigDecimal;

/**
 *
 * @author Dan Smith
 */
public class Order {
    private String orderNo;
    private String name;
    private int qty;
    private BigDecimal price;

    public Order() {
    }

    public Order(String orderNo, String name, int qty, BigDecimal price) {
        this.orderNo = orderNo;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}
