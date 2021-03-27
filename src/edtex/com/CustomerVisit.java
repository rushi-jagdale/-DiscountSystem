package edtex.com;

public class CustomerVisit {

	private EdTexCustomer name;
    
    private double serviceExpense;
    private double productExpense;
    
    
	public CustomerVisit(EdTexCustomer name) {
		this.name = name;
		
	}
  
	 public String getCustomerName() {
	        return name.getName();
	    }

	    public double getServiceExpense() {
	        return serviceExpense;
	    }
	    public void setServiceExpense(double serviceExpense) {
	        this.serviceExpense = this.serviceExpense + serviceExpense;
	    }

	    public double getProductExpense() {
	        return productExpense;
	    }

	    public void setProductExpense(double productExpense) {
	        this.productExpense = this.productExpense + productExpense;
	    }
	    
	   
		  
		   
	  
	    
	    public double getTotalExpense() {
	    	
	    	
	    	
	        return  (serviceExpense - (serviceExpense * Discount.getServiceDiscount(name.getMemberType()))) +
	                (productExpense - (productExpense * Discount.getProductDiscount(name.getMemberType())));
	    	
//	    	else {
//	    		 
//	    		 return  (serviceExpense - (serviceExpense * Discount.getServiceDiscount(name.getMemberType()))) +
//	 	                (productExpense - (productExpense *Discount.getProductDiscount(name.getMemberType())));
//	    }
	    }
	    
	    
	    
	    
	    
	    
	    @Override
	    public String toString() {
	        return "Visit{" +
	                "customer name=" + name.getName() +
	                ", customer member=" + name.ismember() +
	                ", customer member type=" + name.getMemberType() +
	               
	                ", serviceExpense=" + serviceExpense +
	                ", productExpense=" + productExpense +
	                '}';
	    }
}
