package edtex.com;

public class EdTexCustomer {
	private String name;
	private boolean member;
	private String memberType;
	
	public EdTexCustomer() {
		this.member = false;
		
	}
   public EdTexCustomer(String name, boolean member, String memberType) {
	   this.name = name;
       this.member = member;
       this.memberType = memberType;
   }
   public String getName() {
	   return name;
   }
   public boolean ismember() {
	   return member;
	   
   }
   public String getMemberType() {
	   return memberType;
	   
   }
   public void setMemberType(String memberType) {
	   this.memberType = memberType;
	   
   }
   @Override
   public String toString() {
	   return "Customer{" +
			   "name='" + name + '\'' +
               ", member=" + member +
               ", memberType='" + memberType + '\'' +
               '}';
   }


}
