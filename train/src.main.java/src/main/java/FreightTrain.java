package src.main.java;

import java.util.Collection;

public class FreightTrain implements Train {
   public FreightTrain() {}
   private String cargo;
   
	public String getCargo() {
	return cargo;
    }

    public void setCargo(String cargo) {
	this.cargo = cargo;
    }
    
    private Customer customer; 
    public void setCustomer(Customer customer) {
    	this.customer = customer;
    }
    
    private Collection<Customer> customers;
    public void setCustomers(Collection<Customer> customers) {
    	this.customers = customers;
    }

	public void drive() {
		System.out.println("Freight Train drives "+cargo);
		customer.order();
		System.out.println("Next orders:");
		for(Customer customer:customers)
			customer.order();
	}

}
