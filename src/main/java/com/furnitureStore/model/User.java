package com.furnitureStore.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
/**
 * Represents a user of the Furniture Store application.
 * Contains registration and login information.
 */

public class User {
	@NotBlank (message="First name is required")
	@Size(min =1,max=32, message="First name must be with 1 - 32 characters")
	private String firstName;
	
	@NotBlank (message="Last name is required")
	@Size(min =1,max=32, message="Last name must be with 1 - 32 characters")
    private String lastName;
	
	@NotBlank (message="Email is required")
	@Email( message="Must be a valid email address")
    private String email;
	
	/*@NotNull (message="Phone number is required")
	@Size(min =1,max=32, message="Phone number must 10 characters")
    private String phone; */
	
	
	@NotBlank (message="User name is required")
	@Size(min =1,max=32, message="Username must be with 1 - 32 characters")
    private String username;
	
	@NotBlank (message="Password is required")
	@Size(min =1,max=32, message="Password must be with 1 - 32 characters")
    private String password;
	
	public User() {
		
	}
	 /**
     * Constructor for creating a new User.
     *
     * @param firstName user's first name
     * @param lastName user's last name
     * @param email user's email
     * @param username username for login
     * @param password password for login
     */
	public User(String firstName, String lastName,String email, String username, String password) {
			
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	/**
	 * Gets the user's first name.
	 * 
	 * @return the first name of the user
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the user's first name.
	 * 
	 * @param firstName the first name to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	/**
	 * Gets the user's last name.
	 * 
	 * @return the last name of the user
	 */
	public String getLastName() {
		return lastName;
	}
	
	/**
	 * Sets the user's last name.
	 * 
	 * @param lastName the last name to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	/**
	 * Gets the user's email address.
	 * 
	 * @return the email of the user
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the user's email address.
	 * 
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * Gets the username used for login.
	 * 
	 * @return the username of the user
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * Sets the username used for login.
	 * 
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * Gets the user's password.
	 * 
	 * @return the password of the user
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * Sets the user's password.
	 * 
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
