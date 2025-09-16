package com.furnitureStore.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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

	public User(String firstName, String lastName,String email, String username, String password) {
			
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
