package org.wipro.com;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class HelloBean {
	public HelloBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method to get the user details
	 * 
	 * @return
	 */
	public UserDetail getUserDetails(String userFname, String userLname) {
		return new UserDetail(userFname, userLname);
	}
}
