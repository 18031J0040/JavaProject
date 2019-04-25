package ProjectMain;

import java.io.Serializable;

public class Profile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String emailid;
	public String password;
	public String name;
    public String phonenum;
    public String address;
    public String Type;
    public String det;
    public String code;
    boolean activation;
    MainAccount ma;
	//private String maa;
    //String da;
    public  void setaccount(MainAccount ma)
    {
    	this.ma=ma;
    }
 
    public  MainAccount getaccount()
    {
    	return this.ma;
    }
 
public String toString() 
	{
		return "\nUser Name :"+this.name+"\nemail :"+this.emailid+"\nphno :"+this.phonenum+"\nAddress :"+this.address+"\nAccount :"+this.Type+"\nACTIVATION code :"+this.code+"\n"+this.ma;
	}
}
