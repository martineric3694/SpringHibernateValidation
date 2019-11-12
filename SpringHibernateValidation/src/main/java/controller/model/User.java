package controller.model;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class User {

	@NotEmpty(message = "username tidak boleh kosong")
	@Length(min = 2,max = 5)
	private String username;
	@NotEmpty(message = "password tidak boleh kosong")
	private String password;
	
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
