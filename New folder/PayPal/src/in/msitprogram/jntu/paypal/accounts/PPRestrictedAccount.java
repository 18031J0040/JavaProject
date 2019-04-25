package in.msitprogram.jntu.paypal.accounts;

import ProjectMain.Profile;

public class PPRestrictedAccount extends PPAccount {
	private String parentEmail;
	private float withdrawLimit;


	public PPRestrictedAccount(Profile profile) {
		super(profile);
		// TODO Auto-generated constructor stub
	}

}
