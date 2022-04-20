
public class User 
{
	private String id;
	private String role;
	private String password;
	private boolean isAdmin;
	private double checking_balance;
	private double savings_balance;
	
	
	public User()
	{
		this.isAdmin = false;
		this.id = "0";
		this.password = "default";
		this.checking_balance = 0.0;
		this.savings_balance = 0.0;

	
	}
	
	public User(String myId,String myPassword,boolean myAdminState,double checking, double savings)
	{
		this.id = myId;
		this.password = myPassword;
		this.isAdmin = myAdminState;
		this.checking_balance = checking;
		this.savings_balance = savings;

	}
	
	public String getPassword()
	{
		return password;
	}

	public void setPassword(String myPassword)
	{
		this.password = myPassword;
	}
	
	public String getRole()
	{
		if(getId().charAt(0)=='S')
		{
			role="Staff";
		}
		
		else if(getId().charAt(0)=='M')
		{
			role="Member";
		}
		return role;
	}
	public boolean isAdmin() 
	{
		return isAdmin;
	}
	
	public void setAdmin(boolean isAdmin) 
	{
		this.isAdmin = isAdmin;
	}
	
	public String getId() 
	{
		return id;
	}
	
	public void setId(String id) 
	{
		this.id = id;
	}

	public double getChecking_balance() {
		return checking_balance;
	}

	public void setChecking_balance(float checking_balance) {
		this.checking_balance = checking_balance;
	}

	public double getSavings_balance() {
		return savings_balance;
	}

	public void setSavings_balance(float savings_balance) {
		this.savings_balance = savings_balance;
	}
	
	

}

