package edtex.com;

public class TestDiscountSystem {
	public static void main(String[] args) {
		
		EdTexCustomer c = new EdTexCustomer("rushi",true,"Platinum");
		EdTexCustomer c1 = new EdTexCustomer("suraj",false,"Diamond");
		
		System.out.println(c.toString());
		System.out.println(c1.toString());
		
		CustomerVisit v = new CustomerVisit(c);
		CustomerVisit v1 = new CustomerVisit(c1);
//		
//		System.out.println(v.toString());
//		System.out.println(v1.toString());
//		
		v.setProductExpense(1000.0);
	    v.setServiceExpense(2000.0);
	    v1.setProductExpense(1000.0);
	    v1.setServiceExpense(1000.0);
	    

	    System.out.println(v.toString());
	    System.out.println(v1.toString());
//	    System.out.println(v.getTotalExpense());
	    
	    System.out.println("Total bill  made by " + v.getCustomerName() + " = " + v.getTotalExpense());
	    System.out.println("Total bill  made by " + v1.getCustomerName() + " = " + v1.getTotalExpense());
   
	}

}
