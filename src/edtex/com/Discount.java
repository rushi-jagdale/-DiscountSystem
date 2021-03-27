package edtex.com;

public class Discount {

	private static double serviceDiscountPlatinum = 0.14;	
	private static double serviceDiscountDiamond = 0.07;
    private static double productDiscountPlatinum = 0.14;
    private static double productDiscountDiamond = 0.14;
    
    public static double getServiceDiscount(String type) {
        switch(type) {
            case "Platinum":
            	
             	
                return serviceDiscountPlatinum;
          
            case "Diamond":
            	
                return serviceDiscountDiamond;
            
            default:
            
                throw new IllegalArgumentException("wrong service type specified");
        }
}
    public static double getProductDiscount(String type) {
        switch(type) {
            
            case "Platinum":
                return productDiscountPlatinum;
          
            case "Diamond":
                return productDiscountDiamond;
            
            default:
        	    throw new IllegalArgumentException("wrong service type specified");
        }
    }
    
    
}

 