package org.wipro.com;

/**
 * 
 * User Details POJO class
 * 
 * 
 * 
 * @author VI264013
 * 
 *
 */

public class UserDetail {

	private String firstName;

	private String lastName;
	private String exeMsg;

	public String getExeMsg() {
		return exeMsg;
	}

	public void setExeMsg(String exeMsg) {
		this.exeMsg = exeMsg;
	}

	public UserDetail() {

	}

	/**
	 * 
	 * @param firstname
	 * 
	 * @param lastname
	 */

	public UserDetail(String firstname, String lastname) {

		super();

		firstName = firstname;

		lastName = lastname;

	}

	/**
	 * 
	 * @return the firstName
	 */

	public String getFirstName() {

		return firstName;

	}

	/**
	 * 
	 * @param firstName
	 * 
	 *            the firstName to set
	 */

	public void setFirstName(String firstName) {

		this.firstName = firstName;

	}

	/**
	 * 
	 * @return the lastName
	 */

	public String getLastName() {

		return lastName;

	}

	/**
	 * 
	 * @param lastName
	 * 
	 *            the lastName to set
	 */

	public void setLastName(String lastName) {

		this.lastName = lastName;

	}

}
