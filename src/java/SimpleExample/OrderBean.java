/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleExample;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.enterprise.context.SessionScoped;

import javax.inject.Named;


/**
 *
 * @author Dan Smith
 */
@Named
@SessionScoped
public class OrderBean implements Serializable{

    private static final long serialVersionUID = 1L;
    
    private List<Order> orders = 
		new ArrayList<Order>(Arrays.asList(
		
		new Order("A0001", "Intel CPU", 
				1, new BigDecimal("700.00")),
		new Order("A0002", "Harddisk 10TB", 
				2, new BigDecimal("500.00")),
		new Order("A0003", "Dell Laptop", 
				8, new BigDecimal("11600.00")),
		new Order("A0004", "Samsung LCD", 
				3, new BigDecimal("5200.00")),
		new Order("A0005", "A4Tech Mouse", 
				10, new BigDecimal("100.00"))
	));
    
    /**
     * Creates a new instance of OrderBean
     */
    public OrderBean() {
        
    }

    public List<Order> getOrders() {
        
        return orders;
    }
    
    
}
