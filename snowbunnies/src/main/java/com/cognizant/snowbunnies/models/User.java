package com.cognizant.snowbunnies.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	
	@Id
	@Column(nullable = false, unique = true)
	private long userID;
	
	@Column(nullable = false)
	private String email;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private boolean isEmployee;
	
	@Column(nullable = false)
	private String firstName;
	
	@Column(nullable = false)
	private String lastName;
	
	public User() {
		super();
	}

	public User(long userID, String email, String password, boolean isEmployee, String firstName, String lastName) {
		super();
		this.userID = userID;
		this.email = email;
		this.password = password;
		this.isEmployee = isEmployee;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	


	public User(String email, String password, boolean isEmployee, String firstName, String lastName) {
		super();
		this.email = email;
		this.password = password;
		this.isEmployee = isEmployee;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/**
	 * @return the userID
	 */
	public long getUserID() {
		return this.userID;
	}

	/**
	 * @param username the userID to set
	 */
	public void setUserID(long userID) {
		this.userID = userID;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the isEmployee
	 */
	public boolean isEmployee() {
		return isEmployee;
	}

	/**
	 * @param isEmployee the isEmployee to set
	 */
	public void setEmployee(boolean isEmployee) {
		this.isEmployee = isEmployee;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	
	
	

} //user class
